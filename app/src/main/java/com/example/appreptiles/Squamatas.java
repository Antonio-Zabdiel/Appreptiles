package com.example.appreptiles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Squamatas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squamatas);
    }

    public void goMain(View view){
        Intent i = new Intent( Squamatas.this, MainActivity.class);
        startActivity(i);
    }

    public void goSqa1(View view){
        Intent i = new Intent( Squamatas.this, Squamatas.class);
        startActivity(i);
    }

    public void goSqa2(View view){
        Intent i = new Intent( Squamatas.this, Squamatas2.class);
        startActivity(i);
    }

    public void goSqa3(View view){
        Intent i = new Intent( Squamatas.this, Squamatas3.class);
        startActivity(i);
    }
}