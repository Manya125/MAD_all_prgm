package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class registration extends AppCompatActivity {
    EditText first,last,usr,pswd,email;
    Button bu1;
    Button bu2;
    boolean isAllChecked= false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        first = (EditText) findViewById(R.id.first);
        last = (EditText) findViewById(R.id.last);
        usr = (EditText) findViewById(R.id.usr);
        pswd = (EditText) findViewById(R.id.pswd);
        email = (EditText) findViewById(R.id.email);
        bu1 = (Button) findViewById(R.id.bu1);
        bu2 = (Button) findViewById(R.id.bu2);
        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isAllChecked = AllChecked();
                if (isAllChecked) {
                    Toast.makeText(getApplicationContext(), "Valid Credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
        bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registration.this.finish();
                System.exit(0);
            }
        });
    }

        private boolean AllChecked(){
            if(usr.length()==0 || usr.length()<5){
                usr.setError("This field is required");
                return false;
            }
            if(pswd.length()==0 || pswd.length()<5){
                usr.setError("This field is required");
                return false;
            }
            if(email.length()==0 || email.length()<5){
                usr.setError("This field is required");
                return false;
            }
            return true;
        }
}
