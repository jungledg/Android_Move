package com.example.tabhostdemo;

import android.os.Bundle;
import android.app.Activity;
import android.app.TabActivity;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {
	private TabHost tabHost=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tabHost=getTabHost();
		TabSpec tab1=tabHost.newTabSpec("tab1").setIndicator("我的信息").setContent(R.id.tab1);
		tabHost.addTab(tab1);
		TabSpec tab2=tabHost.newTabSpec("tab2").setIndicator("预约课程").setContent(R.id.tab2);
		tabHost.addTab(tab2);
		TabSpec tab3=tabHost.newTabSpec("tab3").setIndicator("最近答疑").setContent(R.id.tab3);
		tabHost.addTab(tab3);
		TabSpec tab4=tabHost.newTabSpec("tab4").setIndicator("近期答疑").setContent(R.id.tab4);
		tabHost.addTab(tab4);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
