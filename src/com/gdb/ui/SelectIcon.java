package com.gdb.ui;

import java.util.ArrayList;
import java.util.HashMap;

import com.gdb.guodongbu.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.SimpleAdapter;

public class SelectIcon extends Activity implements OnItemClickListener{
	GridView gridview;
	int icon[];
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.selecticon);
		setTitle("选择头像");
		gridview=(GridView) findViewById(R.id.gv_selection_gridview);
		icon=new int[]{R.drawable.pic_1,R.drawable.pic_2,R.drawable.pic_3,R.drawable.pic_4,R.drawable.pic_5,R.drawable.pic_6,R.drawable.pic_7,R.drawable.pic_8,R.drawable.pic_9,R.drawable.pic_10,R.drawable.pic_11,R.drawable.pic_12,R.drawable.pic_13,R.drawable.pic_14,R.drawable.pic_15,R.drawable.pic_16,R.drawable.pic_17,R.drawable.pic_18,R.drawable.pic_19,R.drawable.pic_20,R.drawable.pic_21,R.drawable.pic_22,R.drawable.pic_23,R.drawable.pic_24,R.drawable.pic_25,R.drawable.pic_26,R.drawable.pic_27,R.drawable.pic_28,R.drawable.pic_29,R.drawable.pic_30	
		};
		 ArrayList<HashMap<String, Object>> lstImageItem = new ArrayList<HashMap<String, Object>>();  
	      for(int i=0;i<30;i++)  
	      {  
	        HashMap<String, Object> map = new HashMap<String, Object>();  
	        map.put("ItemImage", icon[i]);//添加图像资源的ID  
	        map.put("ItemText", "NO."+String.valueOf(i+1));//按序号做ItemText  
	        lstImageItem.add(map);  
	      }  
	      //生成适配器的ImageItem <====> 动态数组的元素，两者一一对应  
	      SimpleAdapter saImageItems = new SimpleAdapter(this, //没什么解释  
	                                                lstImageItem,//数据来源   
	                                                R.layout.gridviewlayout,//night_item的XML实现  
	                                                  
	                                                //动态数组与ImageItem对应的子项          
	                                                new String[] {"ItemImage","ItemText"},   
	                                                  
	                                                //ImageItem的XML文件里面的一个ImageView,两个TextView ID  
	                                                new int[] {R.id.ItemImage,R.id.ItemText});  
	      //添加并且显示  
	      gridview.setAdapter(saImageItems);  
	      //添加消息处理  
	      gridview.setOnItemClickListener(this);
	  }
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		Intent intent=new Intent(SelectIcon.this,RegisterFrame.class);
		intent.putExtra("xuhao", icon[position]);
		setResult(0,intent);
		finish();
	}  
	   
	}
