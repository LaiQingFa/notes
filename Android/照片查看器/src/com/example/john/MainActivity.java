package com.example.john;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * ÿһ��Ӧ��ֻ��һ��ApplicationContext ÿһ��Activity����һ��ActivityContext
 * 
 * #####���߳����� 1.���������ˢ�£�����Ӧ�û�ֹͣ��Ӧ�û��κβ��� 2.�����߳�����ʱ�������ϵͳ�ͱ���ANR�쳣��application no
 * responing 3.ֻ�����̲߳ſ���ˢ��UI�����߳��ֽ���ui�߳�
 * 
 * #######��Ϣ����
 * 
 * ���̴߳�����ʱ����ѯ��Looper ����Ϣ����Message Queue����ͻᱻ������������Ϣ������������Ҫʹ��ʱ�����д��� Looper
 * һ������Message Queue������Ϣ���ͻ����Ϣȡ����Ȼ�����Ϣ�Ӹ�Handler����
 * Handler������Լ���handleMessage����������������Ϣ
 * handleMessage�������������߳��У���ʵ����˵ֻҪ��Ϣ����������Ϣ���ͻᴥ�����߳�ȥִ��handleMessage����
 * ��ֱ�׵�˵��ֻҪ���߳�����Ϣ���з���Ϣ���ͻᴥ�����߳�ȥִ��handleMessage����
 * 
 * 
 */
public class MainActivity extends Activity {

//	private ImageView imageView;
//	
	Handler hd = new Handler() {
		// ֻҪ��Ϣ��������Ϣ���˷�������
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

	  new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				// ������ַ ��ȡͼƬ
				String path = "https://www.baidu.com/img/51_540_e373389cdbd70a5fc6fa5bc089c0adbf.png";

				// ��ȡurl����
				try {
					URL url = new URL(path);

					// ��ȡ���Ӷ��� ��ʱ��û�н�������
					HttpURLConnection conection = (HttpURLConnection) url
							.openConnection();

					// ��ʼ�����Ӷ��� ��������ʽ��ע���д
					conection.setRequestMethod("GET");
					// ��ȡ��ʱ
					conection.setReadTimeout(5000);
					// ���ӳ�ʱ
					conection.setConnectTimeout(5000);
					// ��������
					conection.connect();

					if (conection.getResponseCode() == 200) {
						// �õ����������ص������ͻ�����������ݾͱ���������
						InputStream in = conection.getInputStream();
						// �������ȡ���� �����ͼƬ����
						Bitmap bitm = BitmapFactory.decodeStream(in);

						// ������Ϣ����

						Message msg = new Message();
						// ��bitm��Ž���Ϣ����

						msg.obj = bitm;
						// ���߳�����Ϣ�����з���Ϣ
						hd.sendMessage(msg);
//						hd.handleMessage(msg);

					} else {
						Toast.makeText(MainActivity.this, "����ʧ��", 0).show();
					}

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		}

	}

