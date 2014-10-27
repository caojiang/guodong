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

public class MainActivity extends Activity implements OnClickListener{
	TextView forgetpassword,register;
	Button Login;
	EditText password,account;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		
		TabHost tabhost=(TabHost)findViewById(R.id.TabHost);
		tabhost.setup();
		
		forgetpassword=(TextView)findViewById(R.id.tv_main_fogetpassword);
		register=(TextView)findViewById(R.id.tv_main_register);
		Login=(Button)findViewById(R.id.btn_main_login);
		password=(EditText)findViewById(R.id.et_main_password);
		account=(EditText)findViewById(R.id.et_main_zhanghao);
		Login.setOnClickListener(this);
		forgetpassword.setOnClickListener(this);
		register.setOnClickListener(this);
	
		tabhost.addTab(tabhost.newTabSpec("tab1").setIndicator("首页",null).setContent(R.id.Tab_ll1));
		tabhost.addTab(tabhost.newTabSpec("tab2").setIndicator("账户",null).setContent(R.id.Tab_ll2));
		tabhost.addTab(tabhost.newTabSpec("tab3").setIndicator("图表",null).setContent(R.id.Tab_ll3));
		tabhost.addTab(tabhost.newTabSpec("tab4").setIndicator("欲望清单",null).setContent(R.id.Tab_ll4));
		tabhost.addTab(tabhost.newTabSpec("tab5").setIndicator("更多",null).setContent(R.id.Tab_ll5));
		tabhost.setOnTabChangedListener(new OnTabChangeListener(){    
            @Override  
            public void onTabChanged(String tabid) {  
                if (tabid.equals("tab1")) {   
              }  
                if (tabid.equals("tab2")) {     
                }  
                if (tabid.equals("tab3")) {   
                }  
                if(tabid.equals("tab4")){
                }
                if (tabid.equals("tab5")) {   
                }  
           }              
        });   
	

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
			Intent intent=new Intent(MainActivity.this,RegisterFrame.class);
			startActivity(intent);break;
		case R.id.tv_main_fogetpassword:
			Toast.makeText(this, "密码错误", 1000).show();
		}
	}
}
