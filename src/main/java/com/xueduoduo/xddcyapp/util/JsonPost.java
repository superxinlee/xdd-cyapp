package com.xueduoduo.xddcyapp.util;
 
import java.io.IOException;
 
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
 
 
public class JsonPost {
	
	public static void main(String[] args) {
		String url = "http://api.730edu.net/restApi/evalv2/v1/evaluate/xdd/student/log";
		
		//Post方式提交Json字符串，按照指定币种，指定时间点查询
		String json1 = "{\r\n" + 
				"	\"tchNo\": \"T99001\",\r\n" + 
				"	\"stuNo\": \"Ss2016010001\",\r\n" + 
				"	\"subName\": \"English\",\r\n" + 
				"	\"dimensionName\": \"课堂表现\",\r\n" + 
				"	\"itemName\": \"参与讨论\",\r\n" + 
				"	\"assessScore\": 2,\r\n" + 
				"	\"time\": \"2018-09-25 07:00:00\"\r\n" + 
				"}";
		System.out.println(JsonPost.HttpPostWithJson(url, json1));
		
	}
	
	public static String HttpPostWithJson(String url, String json) {
		String returnValue = "这是默认返回值，接口调用失败";
		CloseableHttpClient httpClient = HttpClients.createDefault();
		ResponseHandler<String> responseHandler = new BasicResponseHandler();
		try{
			//第一步：创建HttpClient对象
		 httpClient = HttpClients.createDefault();
		 	
		 	//第二步：创建httpPost对象
	        HttpPost httpPost = new HttpPost(url);
	        
	        //第三步：给httpPost设置JSON格式的参数
	        StringEntity requestEntity = new StringEntity(json,"utf-8");
	        requestEntity.setContentEncoding("UTF-8");    	        
	        httpPost.setHeader("Content-type", "application/json");
	        httpPost.setEntity(requestEntity);
	       
	       //第四步：发送HttpPost请求，获取返回值
	       returnValue = httpClient.execute(httpPost,responseHandler); //调接口获取返回值时，必须用此方法
	      
		}
		 catch(Exception e)
		{
			 e.printStackTrace();
		}
		
		finally {
	       try {
			httpClient.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    }
		 //第五步：处理返回值
	     return returnValue;
	}
	
 
 
}