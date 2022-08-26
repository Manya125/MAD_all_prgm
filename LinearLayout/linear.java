package com.example.linearcalc;

import androidx.appcompat.app.AppCompatActivity;
import android.util.*;
import android.widget.*;
import android.os.Bundle;

public class linearCal extends AppCompatActivity {
    String tag="LifeCycle Events";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_cal);
        Toast toast = Toast.makeText(getApplicationContext(),"onCreate Called",Toast.LENGTH_SHORT);
        toast.show();
        Log.d(tag,"OnCreate Called");
    }
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_linear_cal);
        Toast toast = Toast.makeText(getApplicationContext(),"onStart Called",Toast.LENGTH_SHORT);
        toast.show();
        Log.d(tag,"OnStart Called");
    }
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_linear_cal);
        Toast toast = Toast.makeText(getApplicationContext(),"onResume Called",Toast.LENGTH_SHORT);
        toast.show();
        Log.d(tag,"OnResume Called");
    }
    protected void onStop() {
        super.onStop();
        setContentView(R.layout.activity_linear_cal);
        Toast toast = Toast.makeText(getApplicationContext(),"onStop Called",Toast.LENGTH_SHORT);
        toast.show();
        Log.d(tag,"OnStop Called");
    }
    protected void onDestroy() {
        super.onDestroy();
        setContentView(R.layout.activity_linear_cal);
        Toast toast = Toast.makeText(getApplicationContext(),"onDestroy Called",Toast.LENGTH_SHORT);
        toast.show();
        Log.d(tag,"OnDestroy Called");
    }
}
