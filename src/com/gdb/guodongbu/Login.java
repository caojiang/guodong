package com.gdb.guodongbu;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.TabHost.OnTabChangeListener;

public class Login extends Activity implements OnClickListener{
	TextView forgetpassword,register;
	Button Login;
	EditText password,account;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		forgetpassword=(TextView)findViewById(R.id.tv_main_fogetpassword);
		register=(TextView)findViewById(R.id.tv_main_register);
		Login=(Button)findViewById(R.id.btn_main_login);
		password=(EditText)findViewById(R.id.et_main_password);
		account=(EditText)findViewById(R.id.et_main_zhanghao);
		Login.setOnClickListener(this);
		forgetpassword.setOnClickListener(this);
		register.setOnClickListener(this);
	
	

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.tv_main_register:
			Intent intent=new Intent(Login.this,RegisterFrame.class);
			startActivity(intent);
			break;
		case R.id.tv_main_fogetpassword:
//			Intent intent=new Intent(this)
			break;
		case R.id.btn_main_login:
			Intent intent2=new Intent(Login.this,MainFrame.class);
			startActivity(intent2);
			break;
		}
	}
}
