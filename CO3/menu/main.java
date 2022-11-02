package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        int id = item.getItemId();

        if(id == R.id.home){
            Toast.makeText(this,"User Clicked Home",Toast.LENGTH_LONG).show();
        }
        if(id == R.id.settings){
            Toast.makeText(this,"User Clicked Settings",Toast.LENGTH_SHORT).show();
        }
        if(id == R.id.about){
            Toast.makeText(this,"User Clicked About",Toast.LENGTH_SHORT).show();
        }
        if(id == R.id.share){
            startActivity(new Intent(MainActivity.this,SecondActivity.class));
            Toast.makeText(this,"User Clicked Share",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
