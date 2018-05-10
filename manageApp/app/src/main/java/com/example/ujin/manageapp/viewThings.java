package com.example.ujin.manageapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class viewThings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewthings);


    }
    public void backBtn(View v) {
        Intent myIntent=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(myIntent);
        

    }
}
