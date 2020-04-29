package com.android.attendance.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.androidattendancesystem.R;

public class Aboutus extends Activity {

    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        b=(Button) findViewById(R.id.b1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeCall();
            }
        });
    }
protected void makeCall(){
    Log.i("Make Call","");

    Intent pi=new Intent(Intent.ACTION_CALL);
    pi.setData(Uri.parse("tel:91-738-559-7325"));
    try
    {
        startActivity(pi);
        finish();

    }catch (android.content.ActivityNotFoundException ex)
    {
        Toast.makeText(Aboutus.this,"Call Field,try again later",Toast.LENGTH_SHORT).show();
    }
}
}
