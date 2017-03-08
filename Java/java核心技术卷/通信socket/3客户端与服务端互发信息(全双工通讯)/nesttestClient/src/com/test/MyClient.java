package com.test;
/**
 * 客户端
 *
 */
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;
public class MyClient extends JFrame implements ActionListener{

	JTextArea jta=null;
	JTextField jtf =null;
	JButton jbt=null;
	JPanel Jp1=null;
	JScrollPane jsp=null;
	
	//把信息发送给服务器的对象
	PrintWriter pw=null;
	
	public static void main(String[] args) {
		
		MyClient ms=new MyClient();
	}

	public MyClient(){
		jta=new JTextArea();
		jtf=new JTextField(20);
		jbt=new JButton("发送");
		jsp=new JScrollPane(jta);
		jbt.addActionListener(this);
		
		Jp1=new JPanel();
		Jp1.add(jtf);
		Jp1.add(jbt);
		
		
		
		this.add(jsp,"Center");
		this.add(Jp1,"South");
		this.setTitle("QQ简易聊天：客户端");
		this.setSize(400,300);
		this.setVisible(true);
		
		
		try {
			Socket s=new Socket("127.0.0.1",9988);
			
			InputStreamReader isr =new InputStreamReader(s.getInputStream());
			BufferedReader  br= new BufferedReader(isr);
			
			pw=new PrintWriter(s.getOutputStream(),true);
			
			while(true)
			{
				//不停的读取从服务器端发来的信息
				String info=br.readLine();
				jta.append("服务器 对 客户端说 ："+info+"\r\n");
				
				
				
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//如果用户按下发送信息的按钮
				if(e.getSource()==jbt){
					//把这个客户端在jtf里写的内容发送给服务器
					String info=jtf.getText();
					//把客户端发送的信息显示到jta
					jta.append("客户端 对 服务器说："+info+"\r\n");
					
					pw.println(info);
				
				}
	}
}
