package com.android.attendance.activity;

import com.android.attendance.bean.StudentBean;
import com.android.attendance.db.DBAdapter;
import com.example.androidattendancesystem.R;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DelStudentActivity extends Activity {

    Button delStudent;
    EditText stu_id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.delstudent);

        stu_id=(EditText)findViewById(R.id.editText2);
        delStudent=(Button)findViewById(R.id.button);

        delStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = stu_id.getId();
                StudentBean sb = new StudentBean();
                int id1=sb.getStudent_id1(id);
                stu_id.setText(Integer.toString(id1));
                id1+=1;
                DBAdapter dbAdapter = new DBAdapter(DelStudentActivity.this);
                dbAdapter.deleteStudent(id1);

                Intent intent = new Intent(DelStudentActivity.this, MenuActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Student Deleted successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}