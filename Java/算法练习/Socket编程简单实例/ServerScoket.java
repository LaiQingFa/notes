package com.example;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerScoket {
	
	public static void main(String[] args) throws IOException {
		int port = 9090;
		ServerSocket server = new ServerSocket(port);
		Socket socket = server.accept();
		Reader read = new InputStreamReader(socket.getInputStream());
		char bytes[] = new char[64];
		StringBuilder buider = new StringBuilder();
		int len;
		while((len =read.read(bytes))!=-1){
			buider.append(new String(bytes,0,len));
		}
		System.out.println("socekt Demo"+buider);
		read.close();
		socket.close();
		server.close();
	}
}
