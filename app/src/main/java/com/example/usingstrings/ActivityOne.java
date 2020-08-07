package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ActivityOne extends AppCompatActivity {

    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_one);
        textView2 = findViewById(R.id.textView2);
        textView2.setText(R.string.Msg2);

       Log.i(tag: "LifeCycle" , msg:"onCreate() invoked");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i(tag: "LifeCycle" , msg: "onStart()");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i(tag: "LifeCycle" , msg: "onRestart() invoked");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i(tag: "LifeCycle" , msg: "onPause() invoked");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i(tag: "LifeCycle" , msg: "onStop() invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(tag: "LifeCycle" , msg: "onDestroy() invoked");
    }
}