package com.example.tamannasharma.newproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button myButton =findViewById(R.id.Button)
    }

    public void display(View view) {
        Intent myActivity =new Intent(MainActivity.this,Main2Activity.class);
        startActivity(myActivity);

    }
}
