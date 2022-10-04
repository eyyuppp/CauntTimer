 package com.example.caunttimer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {
      TextView textView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textViewtimer);
        new CountDownTimer(61000,100){

            @Override
            public void onTick(long l) {
             textView.setText("00 :"+l/1000);
            }

            @Override
            public void onFinish() {

            }
        }.start();
    }
}