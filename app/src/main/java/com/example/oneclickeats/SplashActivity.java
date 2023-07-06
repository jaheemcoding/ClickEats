package com.example.oneclickeats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class SplashActivity extends AppCompatActivity {

    Handler h = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        h.postDelayed(new Runnable() {
            @Override
            public void run() {
            Intent i = new Intent(SplashActivity.this,MainActivity.class);
            startActivity(i);
            }
        },3000);
    }
}