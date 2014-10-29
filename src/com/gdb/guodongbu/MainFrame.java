package com.gdb.guodongbu;


import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.Window;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TextView;

public class MainFrame extends Activity {
	RadioGroup radio;
	TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//下面是使用动态方法加载fragment
		setContentView(R.layout.mainframe);
		radio=(RadioGroup)findViewById(R.id.rg_mainframe_radiogroup);
		radio.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch(checkedId){
				case R.id.rb_mainframe_index:{
					MainFragment fragment=new MainFragment();
					FragmentManager fragmentManager=getFragmentManager();
					android.app.FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
					beginTransaction.add(R.id.rl_mainframe_frame, fragment);
					beginTransaction.commit();
					break;}
				case R.id.rb_mainframe_tubiao:
					
				}
			}
		});
		
		/**
		 * TABHost已经废弃，不建议使用
		 */
		/*requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.maintabhost);
		TabHost tabhost=(TabHost)findViewById(R.id.TabHost);
		tabhost.setup();
		tabhost.addTab(tabhost.newTabSpec("tab1").setIndicator("首页",null).setContent(R.id.Tab_ll1));
		tabhost.addTab(tabhost.newTabSpec("tab2").setIndicator("账户",null).setContent(R.id.Tab_ll2));
		tabhost.addTab(tabhost.newTabSpec("tab3").setIndicator("图表",null).setContent(R.id.Tab_ll3));
		tabhost.addTab(tabhost.newTabSpec("tab4").setIndicator("欲望清单",null).setContent(R.id.Tab_ll4));
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
            }              
        });   */
}
}
