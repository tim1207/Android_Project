package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Hello World for debug");
        Log.e("MainActivity", "Hello World for error");
        Log.v("MainActivity", "Hello World for verbose");
        Log.i("MainActivity", "Hello World for info");
    }

}