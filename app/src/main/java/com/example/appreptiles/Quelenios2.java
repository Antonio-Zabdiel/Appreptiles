package com.example.appreptiles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Quelenios2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quelenios2);
    }

    public void goMain(View view){
        Intent i = new Intent( Quelenios2.this, MainActivity.class);
        startActivity(i);
    }

    public void goQue(View view){
        Intent i = new Intent( Quelenios2.this, Quelenios.class);
        startActivity(i);
    }

    public void goQue1(View view){
        Intent i = new Intent( Quelenios2.this, Quelenios2.class);
        startActivity(i);
    }

    public void goQue2(View view){
        Intent i = new Intent( Quelenios2.this, Quelenios3.class);
        startActivity(i);
    }
}