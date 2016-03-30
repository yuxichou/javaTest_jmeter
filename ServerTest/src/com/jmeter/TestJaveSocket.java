package com.jmeter;

import com.jmeter.protocol.MsgProtobuf;
import com.jmeter.utils.BuildMsg;
import com.jmeter.utils.Funcations;
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

	byte[] bVoice;

	byte[] sbVoice;


	String vc;
	
	private String host;

	private String port;

	private String user_id;

	private String password;

	private String imei;

	private String RequestTimeout;

	private String ResponseTimeout;

	private String socketType;

	private String isWatchSendVoice;

	private MsgProtobuf.LoginRequest ml;



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

	      host = context.getParameter( "host" , "" );

	      port =context.getParameter( "port" , "" );

	      RequestTimeout = context.getParameter( "RequestTimeout" , "" );

	      ResponseTimeout = context.getParameter( "ResponseTimeout" , "" );

		  user_id = context.getParameter( "user_id" , "" );

		  password=context.getParameter("password","");

		  imei=context.getParameter("imei","");

		  socketType=context.getParameter("socketType(登录:1 长连接:2 通知:3)","");

		  isWatchSendVoice=context.getParameter("isVoice","");

//		  watchId = context.getParameter("watchId", "");

	   }




	public Arguments getDefaultParameters(){
		
		
		log.info("execute getDefaultParameters...");
		
		Arguments params= new Arguments();
		
		params.addArgument("host", "");
		
		params.addArgument("port","");
		
		params.addArgument("RequestTimeout","");
		
		params.addArgument("ResponseTimeout","");
		
		params.addArgument("user_id","");

		params.addArgument("password","");

		params.addArgument("imei","");

		params.addArgument("socketType(登录:1 长连接:2 通知:3)","");

		params.addArgument("isWatchSendVoice","");

		params.addArgument("watchId","");
		
		
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


		if(socketType.equals("1")){

			ml = BuildMsg.loginByUser(user_id,password,imei);


		}

		sc.sndByte(BuildMsg.getByteArrayByRequest(ml));

		log.info(" 登录id: "+ml.getUserId()+" 序列:  "+ml.getSequence());

		results.setSamplerData("登录id: "+ml.getUserId()+" 序列:  "+ml.getSequence());

		log.info("socket 是否连接:  "+sc.isConnected());

		while((sc != null && sc.isConnected())){
			
	  try{


		  try {
			    log.info("设置的请求超时时间为: "+RequestTimeout);

			    sc.setRespTimeOut(Integer.parseInt(ResponseTimeout));

			    log.info("开始接收返回数据");
                //获取返回数据
                byte[] resp = sc.rcvProtoBuf();

                byte[] proBufLengthByte = new byte[4];
                 //读取返回数据长度
                System.arraycopy(resp, 4, proBufLengthByte, 0, 4);

                int proBufLength = Funcations.byteArray2Int(proBufLengthByte);

                log.info("原始数据长度: "+proBufLength);
               // 获取真实返回数据
                byte[] realResp = new byte[proBufLength];

                System.arraycopy(resp,12,realResp,0,proBufLength);

              //解析返回数据为"登录返回"类型
				MsgProtobuf.LoginResponse mmResp = MsgProtobuf.LoginResponse.parseFrom(realResp);


				
				log.info("socket返回: "+" 消息类型为: "+ mmResp.getDefaultInstanceForType() + " 序列为: "+mmResp.getSequence()+"data: "+ mmResp.getData());
				
				results.setResponseData(mmResp.getData());
				
				results.setDataType(SampleResult.TEXT);
				
				
			 if(mmResp.hasData()){

						results.setSuccessful(true);
				}else{

					results.setResponseMessage("返回失败");

					results.setSuccessful(false);
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



	public StringBuilder  getHeadSb(){

		StringBuilder sb = new StringBuilder();

		sb.append("[");

		sb.append("3G");

		sb.append("*");

		sb.append(sc.getId());

		sb.append("*");

		sb.append(sc.getLen());

		sb.append("*");

		sb.append("TK");


		sb.append(",");

		return  sb;
	}




	 public byte[] addToNewByte(StringBuilder sb,byte[] voice){

		  byte[] head = sb.toString().getBytes();

		  int len = head.length + voice.length+1;

		  log.info("新数组的长度为: "+len);

		  byte[] newbyte= new  byte[len];

		  int k=0;

          for(int i=0;i<head.length;i++){


			  newbyte[k]=head[i];

			  k++;


		  }


		 for (int j=0;j<voice.length;j++){

			 newbyte[k]=voice[j];

			 k++;

		 }

		 newbyte[len-1]=0x5D;

		 return newbyte;

	 }





}


	
	
	

    
   