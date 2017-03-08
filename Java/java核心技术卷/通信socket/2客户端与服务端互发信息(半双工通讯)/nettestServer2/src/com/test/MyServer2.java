package com.test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
/**
 * 功能：是一个服务器端  ，在9999端口上监听
 *通过控制台，输入回送给客户端信息
 */
import java.net.*;
public class MyServer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyServer2 ms =new MyServer2();
	}
	public  MyServer2(){
		//在9999端口上监听
		try {
			System.out.println("服务器在9999端口监听。。。。");
			ServerSocket ss=new ServerSocket(9999);
			//等待连接
			Socket s=ss.accept();
			//先接收客户端的信息
			InputStreamReader isr =new InputStreamReader(s.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			
			PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
			
			//接受从控制台的信息
			InputStreamReader isr2 =new InputStreamReader(System.in);
			BufferedReader br2 = new BufferedReader(isr2);
			
			//一直处于读的状态
			while(true)
			{
				
				String infoFromCilent =br.readLine();
				System.out.println("客户端发来++++"+infoFromCilent);
				
				//退出对话
				if(infoFromCilent.equals("bye")){
					System.out.println("对话结束");
					s.close();
					break;
				}
			
				//接受从控制台的信息
				System.out.println("输入你希望对客户端说的话");
				String response =br2.readLine();
				//把从控制台接收的信息回送给客户端
				pw.println(response);
				
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
	}
}
