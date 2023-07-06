package com.example.oneclickeats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }
    public void Login(View view) {
        startActivity(new Intent(RegistrationActivity.this, LoginActivity.class));
    }
    public void SignIn(View view) {
       startActivity(new Intent(RegistrationActivity.this, LoginActivity.class));
    }
    public void MainActivity(View View){
        startActivity(new Intent(RegistrationActivity.this, MainActivity.class));
    }
}