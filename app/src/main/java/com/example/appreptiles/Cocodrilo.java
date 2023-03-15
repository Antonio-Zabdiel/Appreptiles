package com.example.appreptiles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Cocodrilo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocodriolos);
    }

    public void goMain(View view){
        Intent i = new Intent( Cocodrilo.this, MainActivity.class);
        startActivity(i);
    }

    public void goCoc(View view){
        Intent i = new Intent( Cocodrilo.this, Cocodrilo.class);
        startActivity(i);
    }

    public void goCoc1(View view){
        Intent i = new Intent( Cocodrilo.this, Cocodrilos2.class);
        startActivity(i);
    }

    public void goCoc2(View view){
        Intent i = new Intent( Cocodrilo.this, Cocodrilos3.class);
        startActivity(i);
    }
}