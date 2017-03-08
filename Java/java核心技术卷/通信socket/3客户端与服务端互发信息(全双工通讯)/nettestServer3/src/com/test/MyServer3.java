package com.test;
/**
 * 服务器端
 *
 */
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;
public class MyServer3 extends JFrame implements ActionListener{

	JTextArea jta=null;
	JTextField jtf =null;
	JButton jbt=null;
	JPanel Jp1=null;
	JScrollPane jsp=null;
	
	//把信息发送给客户端的对象
	PrintWriter pw=null;
	
	
	public static void main(String[] args) {
		
		MyServer3 ms=new MyServer3();
	}

	public MyServer3(){
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
		this.setTitle("QQ简易聊天：服务器");
		this.setSize(400,300);
		this.setVisible(true);
		
		try {
			//服务器监听、
			ServerSocket ss=new ServerSocket(9988);
			//等待连接
			Socket s=ss.accept();
			
			InputStreamReader isr =new InputStreamReader(s.getInputStream());
			BufferedReader  br= new BufferedReader(isr);
			
			pw=new PrintWriter(s.getOutputStream(),true);
			//读取从客户端发来的信息
			while(true){
				//读取从客户端发来的信息
				String info =br.readLine();
				//追加
				jta.append("客户端 对 服务器说"+info+ "\r\n");
				
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//如果用户按下发送信息的按钮
		if(e.getSource()==jbt){
			//把这个服务器在jtf里写的内容发送给客户端
			String info=jtf.getText();
			
			jta.append("服务器 对 客户端说："+info+"\r\n");
			
			pw.println(info);
			//情况发送框内容
			jtf.setText("");
		}
		
	}
}
