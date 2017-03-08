package com.test1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
/**
 * 第一个服务器端程序，让他在9999端口监听
 *可以接受从客户端发来的信息
 */
import java.net.*;
public class MyServer1 {
    public static void main(String args[]){
    	
    	MyServer1 ms =new MyServer1();
    	
    }        
	
	public MyServer1(){
		
		try {
			//在9999号端口监听
			ServerSocket ss =new ServerSocket(9999);
			System.out.println("我是服务器，在9999端口监听！！！！");
			//等待某个客户端来连接，该函数会返回一个socket连接！！！			
			Socket s=ss.accept();
			System.out.println("11");
			
			//要读取s中传递的数据
			InputStreamReader isr=new  InputStreamReader(s.getInputStream());
			BufferedReader br =new BufferedReader(isr);
			String info=br.readLine();
			System.out.println("服务器接收到"+info);
			
			//发送的话还是这个管道s.getOutputStream()
			PrintWriter pw =new PrintWriter(s.getOutputStream(),true);
			pw.println("我是服务器，你也好");
			
		} catch (IOException e) {
			// 异常打出来
			e.printStackTrace();
		}
	}
}
