package com.example.appreptiles;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewConfiguration;
import android.widget.Toast;

import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //no se que hace pero no se si funciona eventualmente lo hara
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.overflow, menu);

        return super.onCreateOptionsMenu(menu);
    }


    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id == R.id.id1coc){
            Toast.makeText(  this,  "clicleaste en cocodrilos", Toast.LENGTH_SHORT).show();
        }else if(id == R.id.id2squa){
            Toast.makeText(  this,  "clicleaste en aquamatas", Toast.LENGTH_SHORT).show();
        }else if(id == R.id.id3que){
            Toast.makeText(  this,  "clicleaste en quelenios", Toast.LENGTH_SHORT).show();
        }else if(id == R.id.id4rin){
            Toast.makeText(  this,  "clicleaste en rinocefalos", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}