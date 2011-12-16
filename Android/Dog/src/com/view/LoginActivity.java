package com.view;

import com.ps.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
	private Button btn_id_login;
	private EditText edt_id_name;
	private EditText edt_id_pass;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        btn_id_login = (Button)findViewById(R.id.btn_id_login);
        btn_id_login.setOnClickListener(this);
        
        edt_id_name = (EditText)findViewById(R.id.edt_id_name);
        edt_id_pass = (EditText)findViewById(R.id.edt_id_pass);
    }
    
    
    public void login()
    {
    }
    
    public void succedLogin()
    {
    	Intent intent = new Intent(LoginActivity.this, WatchActivity.class);
    	startActivity(intent);
    }
    
    public void failedLogin()
    {
    	
    }

	public void onClick(View arg0) {
		succedLogin();
	} 
}