package com.jmeter.utils;

import com.apple.laf.AquaButtonLabeledUI;
import com.google.protobuf.InvalidProtocolBufferException;
import com.jmeter.protocol.MsgProtobuf;

/**
 * Created by zhouzhangyin on 16/3/15.
 */
public class BuildMsg {

      public static int sequence = 0;

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
     * 长连接请求
     * @param
     * @return
     */

    public static MsgProtobuf.LinkRequest  linkrequest(){
        MsgProtobuf.LinkRequest.Builder lb = MsgProtobuf.LinkRequest.newBuilder();

        return lb.build();
    }



    /**
     * 根据byte数组获取Message
     * @return
     */
//    public MsgProtobuf.LoginResponse getMessageByteArray(byte [] bytes){
//
//        byte[] proBufLengthByte = new byte[4];
//        System.arraycopy(bytes, 3, proBufLengthByte, 0, 4);
//        int dataLength =Funcations.byteArray2Int(proBufLengthByte);
//        if (dataLength==0)
//            return null;
//        byte[] proBufByte = new byte[dataLength];
//        System.arraycopy(bytes, 19, proBufByte, 0, dataLength);
//        MsgProto.Message.Builder mergeFrom = null;
//        try {
//            mergeFrom = MsgProto.Message.getDefaultInstance().newBuilderForType().mergeFrom(proBufByte);
//        } catch (InvalidProtocolBufferException e) {
//            e.printStackTrace();
//        }
//        assert mergeFrom != null;
//        MsgProto.Message message = mergeFrom.build();
////        MsgProto.MessageType msgType = build.getMsgType();
//        return message;
//    }




    /**
     * 根据Message获取Byte数组
     * @return
     */
    public static  byte[] getByteArrayByRequest(MsgProtobuf.LoginRequest ML){


        int serializedSize = ML.getSerializedSize();

        byte[] result = new byte[12 + serializedSize];

//        System.arraycopy(Funcations.int2Byte(1), 0, result, 0, 1);//协议头标志：1 类型：char,1byte
//        System.arraycopy(Funcations.int2Byte(1), 0, result, 1, 4);//协议版本：1 类型：char,1byte

        System.arraycopy(Funcations.int2ByteArray(1),0,result,0,4);//协议版本：char,4byte
        System.arraycopy(Funcations.int2ByteArray(serializedSize), 0, result, 4, 4);//数据长度：程序计算,4byte
        System.arraycopy(Funcations.int2ByteArray(0),0,result,8,4);//消息类型


//        System.arraycopy(Funcations.int2Byte(19), 0, result, 2, 1);//头部长度：19 类型：char,1byte
//        System.arraycopy(Funcations.int2ByteArray(sequence), 0, result, 7, 4);//序列号：程序自增计算,4byte
//        System.arraycopy(Funcations.int2ByteArray(0), 0, result, 11, 4);//保留字段：填0,4byte
//        System.arraycopy(Funcations.int2ByteArray(0), 0, result, 15, 4);//保留字段：填0,4byte


        System.arraycopy(ML.toByteArray(), 0, result, 12, serializedSize);
        sequence++;
        return result;
    }




}
