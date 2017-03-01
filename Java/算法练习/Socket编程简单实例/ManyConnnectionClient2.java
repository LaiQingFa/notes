package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;

public class ManyConnnectionClient2 {
	public static void main(String[] args) throws IOException {
		int port = 9090;
		ServerSocket server = new ServerSocket(port);
		while(true){
			Socket socket = server.accept();
			new Thread(new Task(socket)).start();
		}
	}
	
	static class Task implements Runnable{
		private Socket socket;
		

		public Task(Socket socket) {
			this.socket = socket;
			// TODO Auto-generated constructor stub
		}


		@Override
		public void run() {
			try {
				HandleSocket();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		private void HandleSocket() throws IOException{
			/*Reader reader = new InputStreamReader(socket.getInputStream());*/
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
			StringBuilder sb = new StringBuilder();
			/*char[] chars = new char[64];
			int len;*/
			String temp;
			while((temp = br.readLine()) != null){
				if(temp.indexOf("eof")!=-1){
					sb.append(temp.substring(0, temp.indexOf("eof")));
					break;
				}
				sb.append(temp);
			}
			System.out.println("from client:"+sb);
			Writer writer = new OutputStreamWriter(socket.getOutputStream(),"UTF-8");
			writer.write("你好客户端们");
			writer.write("eof");
			writer.flush();
			br.close();
			writer.close();
		}
	}
}
