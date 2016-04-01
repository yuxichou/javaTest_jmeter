/*
协议头格式：

版本(4Byte)  数据长度(4Byte) 消息类型(4Byte) 数据(proto buffer)

协议体说明：
请求消息格式：_Request
响应消息格式：_Response

请求公共参数：
required  sequence=1;
required  version=2;

响应公共参数：
请求消息格式：_Request
响应消息格式：_Response

请求公共参数：
required sequence=1;
required version=2;
响应公共参数：
required sequence=1;
required version=2;
required status=3;
核心消息：
message NotificationRequest {
required sequence=1;
required version=2;
required string type = 3;
optional string data = 4;

}
message NotificationResponse{
required sequence=1;
required version=2;
required status=3;
optional data=4;
}
message LoginRequest{
required sequence=1;
required version=2;
required userId=4;
optional imei=4;
required passwd=5;
}
message LoginResponse{
required sequence=1;
required version=2;
required status=3;
optional data=4;
}
message LinkRequest{
}
message LinkResponse{
}
协议头说明
版本   1代表头部长度是12字节
数据长度    根据数据而变
消息类型
0-登录请求 1-登录响应 2-通知请求 3-通知响应  4-link请求 5-link响应

测试地址  192.168.1.111   端口8888

 */

package com.jmeter.protocol;

import com.google.protobuf.GeneratedMessage;
import com.jmeter.protocol.MsgConstants;
import com.jmeter.protocol.MsgProtobuf;
import com.jmeter.protocol.MsgType;
import com.jmeter.utils.Funcations;

/**
 * Created by zhouzhangyin on 16/3/15.
 */
public class BuildMsg {

      public static int sequence = 0;


    /**
     * 根据用户账户密码等登录socket
     * @param user_id
     * @param password
     * @param imei
     * @return
     */
    public  static MsgProtobuf.LoginRequest loginByUser(String user_id,String password,String imei){

      //创建登录请求builder
       MsgProtobuf.LoginRequest.Builder mlBuilder = MsgProtobuf.LoginRequest.newBuilder();
      //set所需参数

          mlBuilder.setSequence(sequence);

          mlBuilder.setUserId(user_id);

          mlBuilder.setPasswd(password);

          mlBuilder.setVersion(2);

          mlBuilder.setImei(imei);

       //  创建登录请求
          MsgProtobuf.LoginRequest ml = mlBuilder.build();

          return  ml;

      }

    /**
     * 创建长连接请求
     * @param
     * @return
     */

    public static MsgProtobuf.LinkRequest  linkRequest(){


        MsgProtobuf.LinkRequest.Builder lb = MsgProtobuf.LinkRequest.newBuilder();

        return lb.build();
    }


    /**
     * 创建通知请求
     * @param data
     * @return
     */
     public static  MsgProtobuf.NotificationRequest notifacationRequest(String data){


         MsgProtobuf.NotificationRequest.Builder nl = MsgProtobuf.NotificationRequest.newBuilder();

         nl.setVersion(MsgConstants.VERSION);

         nl.setSequence(sequence);

         nl.setType(String.valueOf(MsgType.getIntByMsgtype(MsgType.NOTIFACATION)));

         nl.setData(data);

         return nl.build();
    }






    /**
     * 根据返回的byte数组获取protobuf数组
     * @return
     */
    public static  byte[] getProtoBufByRespByteArray(byte [] bytes){

        byte[] proBufLengthByte = new byte[4];
        //读取头部返回数据长度
        System.arraycopy(bytes, 4, proBufLengthByte, 0, 4);

        int proBufLength = Funcations.byteArray2Int(proBufLengthByte);

        if (proBufLength==0)
            return null;

        byte[] protobuf = new byte[proBufLength];

        System.arraycopy(bytes,12,protobuf,0,proBufLength);

        return protobuf;
    }


    /**
     * 根据返回的byte数组获取消息类型
     * @param bytes
     * @return
     */
    public  static int getMsgTypeByRespByteArray(byte[] bytes){

         byte[] msgType = new byte[4];

         System.arraycopy(bytes, 8, msgType, 0, 4);

        return Funcations.byteArray2Int(msgType);
    }




    /**
     * 根据请求获取Byte数组
     * @return
     */
    public static  byte[] getByteArrayByRequest(GeneratedMessage msg,int type){

        //获取要发送protobuf的长度
        int protobufMsgSize = msg.getSerializedSize();
        //要发送的包长度=协议头长度+protobuf长度
        byte[] sendBytes = new byte[12 + protobufMsgSize];

        System.arraycopy(Funcations.int2ByteArray(MsgConstants.VERSION),0,sendBytes,0,4);//协议版本：char,4byte

        System.arraycopy(Funcations.int2ByteArray(protobufMsgSize), 0, sendBytes, 4, 4);//数据长度：程序计算,4byte

        System.arraycopy(Funcations.int2ByteArray(type),0,sendBytes,8,4);//消息类型,4byte

        System.arraycopy(msg.toByteArray(), 0, sendBytes, 12, protobufMsgSize);

        sequence++;

        return sendBytes;
    }


    /**
     * 获取当前的sequence
     * @return
     */
    public static  int getSequence(){

        return  sequence;
    }





}
