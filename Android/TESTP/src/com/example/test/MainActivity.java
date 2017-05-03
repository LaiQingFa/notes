package com.example.test;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button bt=(Button) findViewById(R.id.button1);
        bt.setOnClickListener(new MyListener());
    }

class MyListener   implements OnClickListener{

	@Override
	public void onClick(View arg0) {
		EditText et=(EditText) findViewById(R.id.editText1);
		String phone=et.getText().toString();
		
		Intent intent=new Intent();
		
		intent.setAction(Intent.ACTION_CALL);
		intent.setData(Uri.parse("tel:"+phone));
		startActivity(intent);
	}
	
	
	
}

    
}
