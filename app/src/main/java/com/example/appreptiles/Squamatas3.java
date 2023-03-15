package com.example.appreptiles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Squamatas3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squamatas3);
    }

    public void goMain(View view){
        Intent i = new Intent( Squamatas3.this, MainActivity.class);
        startActivity(i);
    }

    public void goSqa(View view){
        Intent i = new Intent( Squamatas3.this, Squamatas.class);
        startActivity(i);
    }

    public void goSqa1(View view){
        Intent i = new Intent( Squamatas3.this, Squamatas2.class);
        startActivity(i);
    }

    public void goSqa2(View view){
        Intent i = new Intent( Squamatas3.this, Squamatas3.class);
        startActivity(i);
    }
}