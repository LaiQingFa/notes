package com.example.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


public class FileSendClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		int length = 0;
		double sumL = 0;
		byte[] bytes = null;
		DataOutputStream data = null;
		FileInputStream fis = null;
		boolean bool = false;
		String host = "127.0.0.1";
		int port = 9090;
		Socket socket = new Socket(host, port);
		File file = new File("D:/WIN7Activation.rar");
		long l = file.length();
		data = new DataOutputStream(socket.getOutputStream());
		fis = new FileInputStream(file);
		bytes = new byte[1024];
		while((length=fis.read(bytes,0,bytes.length))>0){
			sumL+=length;
			System.out.println("文件已经传输:"+((sumL/l)*100)+"%");
			data.write(bytes, 0, length);
			data.flush();
		}
		  //虽然数据类型不同，但JAVA会自动转换成相同数据类型后在做比较  
        if(sumL==l){  
            bool = true;  
        } 
        data.close();
        fis.close();
        socket.close();
	}

}
