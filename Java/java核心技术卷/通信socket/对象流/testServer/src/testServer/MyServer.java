package testServer;
import java.net.*;
import java.io.*;
import java.util.*;

import com.common.User;


public class MyServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyServer ms =new MyServer();
	}

	
	public MyServer()
	{
		
		try {
			System.out.println("在3456端口监听");
			
			//监听本地9999端口
			ServerSocket ss = new ServerSocket(3456);
			
		    //阻塞，等待连接、
			Socket s=ss.accept();
			//以对象流方式读取（假设客户端发送的是User的一个对象）
			
			ObjectInputStream oisr=new ObjectInputStream(s.getInputStream());
			try {
				User u=(User)oisr.readObject();
				
				
				//输出
				System.out.print("从客户端接收到"+u.getName()+u.getPass());
				s.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
