package com.example.ujin.manageapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void viewThingsBtn(View v){
        Intent myIntent=new Intent(getApplicationContext(),viewThings.class);
        startActivity(myIntent);

    }
    public void searchThingsBtn(View v){
        Intent myIntent=new Intent(getApplicationContext(),viewThings.class);
        startActivity(myIntent);
    }
    public void enrollThingsBtn(View v){
        Intent myIntent=new Intent(getApplicationContext(),viewThings.class);
        startActivity(myIntent);
    }
}
