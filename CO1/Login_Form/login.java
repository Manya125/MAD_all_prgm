package com.example.gridcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class linear_toast extends AppCompatActivity {
    EditText usr,pswd;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_toast);
        usr = (EditText)findViewById(R.id.usr);
        pswd = (EditText)findViewById(R.id.pswd);
        submit = (Button)findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(usr.getText().toString().equals("admin") &&  pswd.getText().toString().equals("admin")){
                    Toast.makeText(getApplicationContext(),"Redirecting",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Invalid Credentials",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
