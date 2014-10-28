package com.gdb.guodongbu;


import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;

public class MainTabhost extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
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
        });   
}
}
