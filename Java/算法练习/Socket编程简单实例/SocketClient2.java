package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient2 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		String host = "127.0.0.1";
		int port = 9090;
		Socket socket =new Socket(host,port);
		Writer write = new OutputStreamWriter(socket.getOutputStream());
		write.write("你好服务端");
		write.write("eof\n");
		write.flush();
		/*Reader reader = new InputStreamReader(socket.getInputStream());
		char chars[] = new char[64];*/
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
		StringBuilder sb = new StringBuilder();
		int len;
		int index;
		String temp;
		/*while((len = reader.read(chars))!=-1){
			temp = new String(chars,0,len);
			if((index=temp.indexOf("eof"))!=-1){
				sb.append(temp.substring(0, index));
				break;
			}
			sb.append(temp);
		}*/
		socket.setSoTimeout(10*1000);
		
		try {
			while((temp=br.readLine())!=null){
				if((index=temp.indexOf("eof"))!=-1){
					sb.append(temp.substring(0, index));
					break;
				}
				sb.append(temp);
			}
		} catch (Exception e) {
			throw new RuntimeException("数据就获取超时!");
		}
		System.out.println("服务端:"+sb);
		socket.close();
		write.close();
		br.close();
	}
}
