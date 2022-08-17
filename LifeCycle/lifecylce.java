package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.*;
import android.widget.Toast;

public class lifecycle extends AppCompatActivity {
    String tag = "LifeCycle Events:";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        Toast toast = Toast.makeText(getApplicationContext(),"onCreate Called",Toast.LENGTH_SHORT);
        toast.show();
        Log.d(tag,"OnCreate Called");
    }
    protected void onStart() {
        super.onStart();
        Toast toast = Toast.makeText(getApplicationContext(), "onStart Called", Toast.LENGTH_SHORT);
        toast.show();
        Log.d(tag, "OnStart Called");
    }
    protected void onRestart() {
        super.onRestart();
        Toast toast = Toast.makeText(getApplicationContext(), "onRestart Called", Toast.LENGTH_SHORT);
        toast.show();
        Log.d(tag, "OnRestart Called");
    }
    protected void onPause() {
        super.onPause();
        Toast toast = Toast.makeText(getApplicationContext(), "onPause Called", Toast.LENGTH_SHORT);
        toast.show();
        Log.d(tag, "OnPause Called");
    }
    protected void onResume(){
        super.onResume();
        Toast toast = Toast.makeText(getApplicationContext(), "onResume Called", Toast.LENGTH_SHORT);
        toast.show();
        Log.d(tag, "OnResume Called");
    }
    protected void onStop(){
        super.onStop();
        Toast toast = Toast.makeText(getApplicationContext(), "onResume Called", Toast.LENGTH_SHORT);
        toast.show();
        Log.d(tag, "OnStop Called");
    }
    protected void onDestroy() {
        // It will show a message on the screen
        // then onDestroy is invoked
        super.onDestroy();
        Toast toast = Toast.makeText(getApplicationContext(), "onDestroy Called", Toast.LENGTH_LONG);
        toast.show();
        Log.d(tag, "OnDestroy Called");
    }


}
