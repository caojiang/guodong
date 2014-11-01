package com.gdb.ui;

import com.gdb.guodongbu.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class RegisterFrame extends Activity {
	ImageView iv;
	int xuhao;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);
		setTitle("注册账号");
		iv=(ImageView) findViewById(R.id.iv_register_touxiang);
		iv.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(RegisterFrame.this,SelectIcon.class);
				startActivityForResult(intent, 1);
			}
		});
		
	}
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		xuhao=data.getIntExtra("xuhao", R.drawable.pic_1);
		iv.setImageResource(xuhao);
	}
}
