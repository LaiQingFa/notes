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
 * �����ж�ȡ�ı�
 * @param is
 * @return
 */
   
    
    
    
    public void htmlclick(View v){
    	
    	Thread thread=new Thread(){
    		
    		@Override
    		public void run() {
    			//ȷ����ַ
    	    	String path="https://www.baidu.com/";
    	    	//����url����
    	    	try {
    				URL url=new URL(path);
    				
    				try {
    					//�õ����Ӷ���
    					HttpURLConnection urlConnection=(HttpURLConnection) url.openConnection();
    					//��ʼ�����Ӷ���
    					urlConnection.setConnectTimeout(5000);
    					urlConnection.setReadTimeout(5000);
    					urlConnection.setRequestMethod("GET");
    					//��������   ��ȡ��Ӧ��
    					if(urlConnection.getResponseCode()==200){
    						InputStream isInputStream=urlConnection.getInputStream(); 
    						//�ӷ��������ص����а��ı���ȡ����
    						String text=getTextFromInputStream(isInputStream);
    						//������Ϣ��ˢ��ui����ʾ��ȡ����
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
    	//����һ���ֽ����������  ������ÿ�ζ�ȡ�����ֽ�
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		try {
			while((len=is.read(b))!=-1){
				
				bos.write(b, 0, len);
				
			}
			//�ƶ����   String text=new String(bos.toByteArray(),"utf-8");    ����Ļ�Ĭ����utf-8
			String text=new String(bos.toByteArray());
	    	return text;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	return null;
    }
    
}
