package com.test2;
import java.net.*;
import java.io.*;
public class MyClient2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClient2 mc=new MyClient2();
	}
	
     public MyClient2(){
    	 
    	 try {
    		 //连接服务器端
			Socket sk=new Socket("127.0.0.1",9999);
			PrintWriter pw=new  PrintWriter(sk.getOutputStream(),true);
			
			//接受从控制台的信息
			InputStreamReader isr =new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			//接收从服务器发来的话
			InputStreamReader isr2 =new InputStreamReader(sk.getInputStream());
			BufferedReader br2 = new BufferedReader(isr2);
			
			//保持状态
			while (true)
			{
				System.out.println("输出你想对服务端说的话");
				//客户端先从控制台接收
				String info=br.readLine();
				//然后发送给服务器
				pw.println(info);
				
				//退出对话
				if(info.equals("bye")){
					System.out.println("对话结束");
					sk.close();
					break;
				}
				
				
				//接收从服务器发来的话
				String response =br2.readLine();
				System.out.println("服务器说++++"+response);
			
				
				
			}
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 
    	 
     }
	
}
