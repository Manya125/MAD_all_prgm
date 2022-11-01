package com.example.gridview_images;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CursorAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;

public class MainActivity extends AppCompatActivity {
    GridView simplegrid;
    int logs[] = {R.drawable.c,R.drawable.cpp,R.drawable.csharp,R.drawable.html,R.drawable.bootstrap,
            R.drawable.css,R.drawable.nodejs,R.drawable.react,R.drawable.tf};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simplegrid = (GridView) findViewById(R.id.simpleGridView);

        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(),logs);

        simplegrid.setAdapter(customAdapter);
        simplegrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("image",logs[i]);
                startActivity(intent);
            }
        });



    }
}
