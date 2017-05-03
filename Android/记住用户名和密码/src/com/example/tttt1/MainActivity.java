package com.example.tttt1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	
	private EditText et_name;
	private EditText et_pass;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        et_name=(EditText) findViewById(R.id.editText1);
        et_pass=(EditText) findViewById(R.id.editText2);
        try {
			readAccount();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

    public void login(View vv) throws IOException{
 	   
 	   String name=et_name.getText().toString();
 	 
 	   String pass=et_pass.getText().toString();
 	   CheckBox cb=(CheckBox) findViewById(R.id.checkBox1);
 	   //制定安卓诶不存储空间的路径     按照安卓的盘符来写   内部存储空间的盘符   内部存储空间读写不需要权限
	   File f=new File("data/data/com.example.tttt1/ceshishishisi.text");
	   try {
		FileOutputStream fos=new FileOutputStream(f);
		fos.write((name +"##"+pass).getBytes());
		fos.close();
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 	   System.out.print("登录成功");
       //弹出提示框  提示用户登录成功
//       Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
 	   //三秒
 	  Toast.makeText(this, "登录成功", 0).show();
      }
    
    public void readAccount() throws IOException{

     		   //制定安卓诶不存储空间的路径     按照安卓的盘符来写   内部存储空间的盘符   内部存储空间读写不需要权限
     		   File f=new File("data/data/com.example.tttt1/ceshishishisi.text");
     		if(f.exists()){
     			FileInputStream fos=new FileInputStream(f);
     			BufferedReader br=new BufferedReader(new InputStreamReader(fos));
     		    String text=br.readLine();
     		    String s[]=text.split("##");
//     		   EditText et_name=(EditText) findViewById(R.id.editText1);
//     		   EditText et_pass=(EditText) findViewById(R.id.editText2);
     		   et_name.setText(s[0]);
     		   et_pass.setText(s[1]);
    }
    
    }
}
