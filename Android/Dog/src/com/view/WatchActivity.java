package com.view;

import com.ps.R;
import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;

public class WatchActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.watch);
		
		init();
	}
	
	private void init()
	{
		ProgressDialog dialog = new ProgressDialog(WatchActivity.this);
		dialog.setTitle("正在连接到桌面");
		dialog.setMessage("请稍后...");
		dialog.show();
	}
	

}
