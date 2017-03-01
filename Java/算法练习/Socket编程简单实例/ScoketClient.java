package com.example;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;
import java.net.UnknownHostException;

public class ScoketClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		String host = "127.0.0.1";
		int port = 9090;
		Socket socket =new Socket(host,port);
		Writer write = new OutputStreamWriter(socket.getOutputStream());
		write.write("你好世界!");
		write.write("eof");
		write.flush();
		Reader reader = new InputStreamReader(socket.getInputStream());
		char chars[] = new char[64];
		StringBuilder sb = new StringBuilder();
		int len;
		int index;
		String temp;
		while((len = reader.read(chars))!=-1){
			temp = new String(chars,0,len);
			if((index=temp.indexOf("eof"))!=-1){
				sb.append(temp.substring(0, index));
				break;
			}
			sb.append(temp);
		}
		System.out.println("服务端:"+sb);
		socket.close();
		write.close();
		reader.close();
	}
}
