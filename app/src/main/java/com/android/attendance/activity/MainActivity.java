package com.android.attendance.activity;

import com.example.androidattendancesystem.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{

	Button start,ab;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		start =(Button)findViewById(R.id.buttonstart);
		ab=(Button)findViewById(R.id.abt);
		start.setOnClickListener(this);
		ab.setOnClickListener(this);

	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View view) {
		if(view.getId()==R.id.buttonstart)
		{
			Intent i=new Intent(MainActivity.this,LoginActivity.class);
			startActivity(i);

		}
		else if(view.getId()==R.id.abt)
		{
			Intent i=new Intent(MainActivity.this,Aboutus.class);
			startActivity(i);


		}
	}
}
