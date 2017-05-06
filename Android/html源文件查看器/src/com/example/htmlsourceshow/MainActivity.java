package com.example.htmlsourceshow;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.R.integer;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	Handler handler =new Handler(){
		public void handleMessage(android.os.Message msg) {
			if(msg.what==1){
				TextView textView=(TextView) findViewById(R.id.textView);
				textView.setText((String)msg.obj);
				
			}
			
		}
		
	};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
/**
 * 从流中读取文本
 * @param is
 * @return
 */
   
    
    
    
    public void htmlclick(View v){
    	
    	Thread thread=new Thread(){
    		
    		@Override
    		public void run() {
    			//确定网址
    	    	String path="https://www.baidu.com/";
    	    	//构建url对象
    	    	try {
    				URL url=new URL(path);
    				
    				try {
    					//得到连接对象
    					HttpURLConnection urlConnection=(HttpURLConnection) url.openConnection();
    					//初始化连接对象
    					urlConnection.setConnectTimeout(5000);
    					urlConnection.setReadTimeout(5000);
    					urlConnection.setRequestMethod("GET");
    					//建立连接   获取响应码
    					if(urlConnection.getResponseCode()==200){
    						InputStream isInputStream=urlConnection.getInputStream(); 
    						//从服务器返回的流中把文本读取出来
    						String text=getTextFromInputStream(isInputStream);
    						//发送消息，刷新ui，显示读取到的
    						Message msg=handler.obtainMessage();
    						msg.obj=text;
    						msg.what=1;
    						handler.sendMessage(msg);
    						
    					}
    					
    				} catch (IOException e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				}
    				
    				
    			} catch (MalformedURLException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    		}
    		
    	};
    	
    	thread.start();
    	
    }
    
    public String  getTextFromInputStream(InputStream is){
		int len=0;
		byte[] b=new byte[1024];
    	//定义一个字节数组输出流  ，保存每次读取到的字节
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		try {
			while((len=is.read(b))!=-1){
				
				bos.write(b, 0, len);
				
			}
			//制定码表   String text=new String(bos.toByteArray(),"utf-8");    不填的话默认是utf-8
			String text=new String(bos.toByteArray());
	    	return text;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	return null;
    }
    
}
