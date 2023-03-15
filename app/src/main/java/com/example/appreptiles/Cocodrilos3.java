package com.example.appreptiles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Cocodrilos3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocodrilos3);
    }

    public void goMain(View view){
        Intent i = new Intent( Cocodrilos3.this, MainActivity.class);
        startActivity(i);
    }

    public void goCoc(View view){
        Intent i = new Intent( Cocodrilos3.this, Cocodrilo.class);
        startActivity(i);
    }

    public void goCoc1(View view){
        Intent i = new Intent( Cocodrilos3.this, Cocodrilos2.class);
        startActivity(i);
    }

    public void goCoc2(View view){
        Intent i = new Intent( Cocodrilos3.this, Cocodrilos3.class);
        startActivity(i);
    }
}