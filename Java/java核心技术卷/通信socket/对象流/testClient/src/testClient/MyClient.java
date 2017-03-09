package testClient;
import java.net.*;
import java.io.*;
import java.util.*;






public class MyClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClient mc=new MyClient();
	}

	public MyClient()
	{
		
		try {
			Socket s=new Socket("127.0.0.1",3456);
			//通过ObjectOutputStream 给服务器对象
			ObjectOutputStream oos=new ObjectOutputStream(s.getOutputStream());
			
			com.common.User u=new com.common.User();
			u.setName("名字：测试1");
			u.setPass("密码：123154156");
			oos.writeObject(u);
			System.out.print("++++++++++++++++++++++");
			s.close();
			
			//想把一个对象在网络上传输，需要将对象序列化
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
