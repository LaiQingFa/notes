package com.test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
/**
 * 这是一个客户端程序，可以连接服务器端
 * @author Administrator
 *
 */
import java.net.*;
public class MyClient {

	public static void main(String[] args) {
		MyClient mc =new MyClient();

	}

	public MyClient(){
		
		try {
			//Socket 函数就是去连接某个服务器端  127.0.0.1表示服务器的IP  9999是端口
			Socket s =new Socket("127.0.0.1",9999);
			//如果s连接成功，就可以发数据给服务器了
			//我们通过pw,向s写数据，true表示即时刷新
			PrintWriter pw =new PrintWriter(s.getOutputStream(),true);
			pw.println("你好吗，我是客户端");
			
			//要读取s中传递的数据
			InputStreamReader isr=new  InputStreamReader(s.getInputStream());
			BufferedReader br =new BufferedReader(isr);
			String response=br.readLine();
			System.out.println("客户端收到服务器回送信息："+response);
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
