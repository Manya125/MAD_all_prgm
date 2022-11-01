package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        FragmentManager fragmentManager = getSupportFragmentManager();
        Button btnchat = findViewById(R.id.btncht);
        btnchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView , FirstFragment.class , null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();

            }
        });
        Button btnstatus = findViewById(R.id.btnstatus);
        btnstatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView , SecondFragment.class , null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();

            }
        });
        Button btncalls = findViewById(R.id.btncalls);
        btncalls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView,ThirdFragment.class,null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();

            }
        });
    }
}
