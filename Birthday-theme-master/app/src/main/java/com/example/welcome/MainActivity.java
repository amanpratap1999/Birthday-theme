package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int timeout=4000;
        Timer timer=new Timer();
        timer.schedule(new TimerTask(){
            @Override
            public void run(){
                finish();
                Intent Homepage=new Intent(MainActivity.this,themesselection.class);
                startActivity(Homepage);
            }
        },timeout);

    }
}