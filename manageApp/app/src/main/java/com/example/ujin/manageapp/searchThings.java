package com.example.ujin.manageapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class searchThings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searchthings);


    }
    public void backBtn(View v) {
        Intent myIntent=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(myIntent);


    }


}
