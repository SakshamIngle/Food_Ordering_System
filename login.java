package com.example.mealmate.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mealmate.MainActivity;
import com.example.mealmate.R;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void Register(View view) {
        startActivities(new Intent[]{new Intent(login.this, RegistrationActivity.class)});

    }
    public void mainActivity(View v){
        startActivities(new Intent[]{new Intent(login.this, MainActivity.class)});

    }
}