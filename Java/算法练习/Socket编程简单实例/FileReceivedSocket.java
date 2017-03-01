package com.example.socket;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class FileReceivedSocket {
	
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
		
		private Task(Socket socket){
			this.socket = socket;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				HandleTask();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		private void HandleTask() throws IOException{
			byte[] bytes = null;
			DataInputStream data = null;
			FileOutputStream fos = null;
			data = new DataInputStream(socket.getInputStream());
			File file = new File("D:/temp");
			if(!file.exists()){
				file.mkdir();
			}
			String filepath = "D:/temp/"+UUID.randomUUID()+".zip";
			fos = new FileOutputStream(new File(filepath));
			bytes = new byte[1024];
			int len;
			while((len=data.read(bytes,0,bytes.length))>0){
				fos.write(bytes, 0, len);
				fos.flush();
			}
			
			System.out.println("完成数据接收:"+filepath);
			socket.close();
			data.close();
			fos.close();
		}
	}
	
	
}
