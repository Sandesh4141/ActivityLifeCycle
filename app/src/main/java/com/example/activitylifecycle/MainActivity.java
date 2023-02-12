package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String tag = "Events";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "In onCreate() Event");
    }
    @Override
    public void onStart(){
        super.onStart();
        Log.d(tag, "In onStart() Event");
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.d(tag, "In onResume() Event");
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.d(tag,"In onPause() event");
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.d(tag, "In onStop() event");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(tag, "In onDestroy() event");
    }
}