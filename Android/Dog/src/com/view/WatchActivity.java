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
		dialog.setTitle("�������ӵ�����");
		dialog.setMessage("���Ժ�...");
		dialog.show();
	}
	

}
