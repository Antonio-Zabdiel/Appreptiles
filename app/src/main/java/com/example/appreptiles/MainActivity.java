package com.example.appreptiles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

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
            Toast.makeText(  this,  R.string.id1coc, Toast.LENGTH_SHORT).show();
        }else if(id == R.id.id2squa){
            Toast.makeText(  this,  R.string.id2squa, Toast.LENGTH_SHORT).show();
        }else if(id == R.id.id3que){
            Toast.makeText(  this,  R.string.id3que, Toast.LENGTH_SHORT).show();
        }else if(id == R.id.id4rin){
            Toast.makeText(  this,  R.string.id4rin, Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }

    public void goCocodrilos(View view){
        Intent i = new Intent( MainActivity.this, Cocodrilo.class);
        startActivity(i);
    }

    public void goSquamatas(View view){
        Intent i = new Intent( MainActivity.this, Squamatas.class);
        startActivity(i);
    }

    public void goQuelenios(View view){
        Intent i = new Intent( MainActivity.this, Quelenios.class);
        startActivity(i);
    }

    public void goRinocefalos(View view){
        Intent i = new Intent( MainActivity.this, Rinocefalos.class);
        startActivity(i);
    }
}