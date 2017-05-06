package com.example.chachepitcureshow;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.R.integer;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * 每一个应用只有一个ApplicationContext 每一个Activity都是一个ActivityContext
 * 
 * #####主线程阻塞 1.界面会听着刷新，并且应用会停止响应用户任何操作 2.当主线程阻塞时间过长，系统就爆出ANR异常，application no
 * responing 3.只有主线程才可以刷新UI，主线程又叫做ui线程
 * 
 * #######消息对列
 * 
 * 主线程创建的时候轮询器Looper 和消息队列Message Queue对象就会被创建，但是消息处理器对象，需要使用时，自行创建 Looper
 * 一旦发现Message Queue中有消息，就会把消息取出，然后把消息扔给Handler对象，
 * Handler会调用自己的handleMessage方法来处理这条消息
 * handleMessage方法运行在主线程中，其实就是说只要消息队列中有消息，就会触发主线程去执行handleMessage方法
 * 更直白的说，只要子线程往消息队列发消息，就会触发主线程去执行handleMessage方法
 * 
 * 
 */
public class MainActivity extends Activity {

	
	
	Handler hd = new Handler() {
		// 只要消息队列有消息，此方法调用
		public void handleMessage(android.os.Message msg) {

			ImageView imageView=(ImageView) findViewById(R.id.imageView1);
			imageView.setImageBitmap((Bitmap) msg.obj);

		}

	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}

	public void click(View v) {
		
		final String path = "https://www.baidu.com/img/51_540_e373389cdbd70a5fc6fa5bc089c0adbf.png";
		//首先判缓存是否存在
		final File file=new File(getCacheDir(),getFileName(path));
		if(file.exists()){
			
			//从缓存中获取图片
			
			//通过图片的绝对路径给图片构造出一个bitmap对象 
			Bitmap bitm=BitmapFactory.decodeFile(file.getAbsolutePath());
			
			ImageView imageView=(ImageView) findViewById(R.id.imageView1);
			imageView.setImageBitmap(bitm);

			
		}else{
			//从网络中获取图片
		  new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					// 请求网址 获取图片
					
	
					// 获取url对象
					try {
						URL url = new URL(path);
	
						// 获取连接对象 此时还没有建立连接
						HttpURLConnection conection = (HttpURLConnection) url
								.openConnection();
	
						// 初始化连接对象 设置请求方式，注意大写
						conection.setRequestMethod("GET");
						// 读取超时
						conection.setReadTimeout(5000);
						// 连接超时
						conection.setConnectTimeout(5000);
						// 建立连接
						conection.connect();
	
						if (conection.getResponseCode() == 200) {
							// 拿到服务器返回的流，客户端请求的数据就保存在流中
							InputStream in = conection.getInputStream();
							
						/********************   文件缓存      ********************/	
							//开启文件输出流  把读取到的字节写到本地文件
							

							FileOutputStream foStream=new FileOutputStream(file);
							
							int len=0;
							byte[] b =new byte[1024];
							while((len=in.read(b))!=-1){
								
								foStream.write(b,0,len);
								
							}
							foStream.close();
							
						/********************   文件缓存      ********************/	
							//通过图片的绝对路径给图片构造出一个bitmap对象 
							Bitmap bitm=BitmapFactory.decodeFile(file.getAbsolutePath());
							
	
	
							// 创建消息对象
	
							Message msg = new Message();
							// 把bitm存放进消息里面
	
							msg.obj = bitm;
							// 子线程往消息队列中发消息
							hd.sendMessage(msg);
	
	
						} else {
							Toast.makeText(MainActivity.this, "请求失败", 0).show();
						}
	
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}).start();
			}
	}
/**
 * 截取路径字符串 
 * @param path
 * @return  返回文件名
 */
	public  String getFileName(String path){
		
		int index=path.lastIndexOf("/");
		return path.substring(index+1);
	}
	
	
	
	}

