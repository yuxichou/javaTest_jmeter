package com.jmeter.javaRequest;

import com.google.protobuf.GeneratedMessage;
import com.jmeter.protocol.MsgProtobuf;
import com.jmeter.protocol.MsgType;
import com.jmeter.protocol.BuildMsg;
import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;
import org.apache.log.Logger;

import java.net.SocketTimeoutException;
import java.util.Iterator;


public class TestJaveSocket extends AbstractJavaSamplerClient {
	
	
	private Logger log=getLogger();
	
	private SampleResult results;

	SocketClient sc;
	
	private String host;

	private String port;

	private String user_id;

	private String password;

	private String imei;

	private String RequestTimeout;

	private String ResponseTimeout;

	private String socketType;

	private String data;


	private GeneratedMessage msg;



	public void setupTest(JavaSamplerContext context){
		
		listParameters(context);	
		
	 }
	

	
	private void listParameters(JavaSamplerContext context) {
	
      String name;
      
      for ( Iterator argsIt= context.getParameterNamesIterator(); 
    		  
    		   argsIt.hasNext(); 
    		    
    		      log.debug(( new StringBuilder()).append(name).append( "=" ).append(context.getParameter(name)).toString()))

                    name= (String) argsIt.next();
	
       }

	
	
	 private void setupValues(JavaSamplerContext context) {

	      host = context.getParameter( "host(必填)" , "" );

	      port =context.getParameter( "port(必填)" , "" );

	      RequestTimeout = context.getParameter( "RequestTimeout(必填)" , "" );

	      ResponseTimeout = context.getParameter( "ResponseTimeout(必填)" , "" );

		  user_id = context.getParameter( "user_id(登录用)" , "" );

		  password=context.getParameter("password(登录用)","");

		  imei=context.getParameter("imei(登录用)","");

		  socketType=context.getParameter("socketType(登录:1 长连接:2 通知:3)","");

		  data = context.getParameter("data(通知用)","");


//		  watchId = context.getParameter("watchId", "");

	   }




	public Arguments getDefaultParameters(){
		
		
		log.info("execute getDefaultParameters...");
		
		Arguments params= new Arguments();
		
		params.addArgument("host(必填)", "");
		
		params.addArgument("port(必填)","");
		
		params.addArgument("RequestTimeout(必填)","");
		
		params.addArgument("ResponseTimeout(必填)","");
		
		params.addArgument("user_id(登录用)","");

		params.addArgument("password(登录用)","");

		params.addArgument("imei(登录用)","");

		params.addArgument("socketType(登录:1 长连接:2 通知:3)","");

//		params.addArgument("isWatchSendVoice","");

		params.addArgument("data(通知用)","");
		
		
		return params;
		
		
	}
	
	
	@Override
	public SampleResult runTest(JavaSamplerContext context) {
		
		log.info("exec runTest...");
		
		results = new SampleResult();
		
		results.sampleStart();
		
		setupValues(context);

		sc = new SocketClient(host, Integer.parseInt(port), RequestTimeout);

		log.info("发送的ip及端口为: "+host+":"+port);

         //登录
		if(socketType.equals("1")){

			msg = BuildMsg.loginByUser(user_id,password,imei);

			sc.sndByte(BuildMsg.getByteArrayByRequest(msg, MsgType.getIntByMsgtype(MsgType.LOGIN)));

			results.setSamplerData("登录id: "+user_id+" 序列:  "+ BuildMsg.getSequence());

        //长连接
		}else if(socketType.equals("2")){


			msg = BuildMsg.linkRequest();

			sc.sndByte(BuildMsg.getByteArrayByRequest(msg,MsgType.getIntByMsgtype(MsgType.LINK)));

			results.setSamplerData("link请求");
         //通知
		}else if (socketType.equals("3")){

           msg = BuildMsg.notifacationRequest(data);

			sc.sndByte(BuildMsg.getByteArrayByRequest(msg,MsgType.getIntByMsgtype(MsgType.NOTIFACATION)));

			results.setSamplerData("发送data:  "+data+" 序列:  "+BuildMsg.getSequence());

		}else{

			log.info("请输入正确的socket类型!!!");

			results.setResponseMessage("返回失败");

			results.setSuccessful(false);

			results.sampleEnd();

			return results;

		}


		log.info("socket 是否连接:  "+sc.isConnected());

		while((sc != null && sc.isConnected())){
			
	  try{


		  try {
			    log.info("设置的请求超时时间为: "+RequestTimeout);

			    sc.setRespTimeOut(Integer.parseInt(ResponseTimeout));

			    log.info("开始接收返回数据");

			    //获取原始返回数据
			     byte[] resp = sc.rcvProtoBuf();

			    int type = BuildMsg.getMsgTypeByRespByteArray(resp);
                //获取返回包里的protobuf数据
                byte[] protoBuResp = BuildMsg.getProtoBufByRespByteArray(resp);

			    log.info("type: "+type);

              //解析返回数据为"登录返回"类型

			  if(type==1  && resp!=null ){

				  MsgProtobuf.LoginResponse loginResp = MsgProtobuf.LoginResponse.parseFrom(protoBuResp);

				  log.info(" data: "+ loginResp.getData());

				  results.setEncodingAndType("UTF-8");

				  results.setResponseData("status: "+loginResp.getStatus()+" data: "+loginResp.getData());

				   if(loginResp.hasData()){

					  results.setSuccessful(true);
				    }else{

					  results.setResponseMessage("返回失败");

					  results.setSuccessful(false);
				  }


				  //返回类型为通知
			  }else if (type==3 && resp!=null){

				  MsgProtobuf.NotificationResponse notificationResponse =  MsgProtobuf.NotificationResponse.parseFrom(protoBuResp);

				  results.setEncodingAndType("UTF-8");

				  results.setResponseData("status: "+notificationResponse.getStatus()+" data: "+notificationResponse.getData());

				  if(notificationResponse.hasData()){

					  results.setSuccessful(true);
				  }else{

					  results.setResponseMessage("返回失败");

					  results.setSuccessful(false);
				  }

               //返回类型为link
			  }else if (type==5 && resp==null ){

				  MsgProtobuf.LinkResponse linkResponse = MsgProtobuf.LinkResponse.parseFrom(protoBuResp);

				  results.setEncodingAndType("UTF-8");

				  results.setResponseData("");


				  if(linkResponse.getSerializedSize()==0){

					  results.setSuccessful(true);
				  }else{

					  results.setResponseMessage("返回失败");

					  results.setSuccessful(false);
				  }


			  }

				
			}catch(SocketTimeoutException e){
				
				log.info("--读返回数据超时了--");
				
				break;
			}
		 } catch (Exception e) {
				// TODO Auto-generated catch block
				log.info("读取异常: "+e.getMessage());

		        break;
			}
			 
		 }
		 
		sc.closeConnection();
		 
		results.sampleEnd();
		
		
		return results;
		
	}






}


	
	
	

    
   