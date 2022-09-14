package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;

public class shared extends AppCompatActivity {
    private EditText name,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared);
        name = findViewById(R.id.first);
        pass = findViewById(R.id.password);
    }
    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sh = getSharedPreferences("MySharedPreference",MODE_PRIVATE);
        String s1 = sh.getString("Name","");
        String s2 = sh.getString("Pass","");

        name.setText(s1);
        pass.setText(s2);
    }

    @Override
    protected void onPause(){
        super.onPause();
        SharedPreferences shared = getSharedPreferences("MySharedPreference",MODE_PRIVATE);
        SharedPreferences.Editor myEdit = shared.edit();
        myEdit.putString("Name",name.getText().toString());
        myEdit.putString("Pass",pass.getText().toString());
        myEdit.apply();
    }
}
