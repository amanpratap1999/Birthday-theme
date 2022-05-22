package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class themesselection extends AppCompatActivity {
    Button button, button2, button3, button4;

     EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themesselection);
//        int timeout = 4000;
//        Timer timer = new Timer();
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                finish();
//                Intent Homepage = new Intent(themesselection.this, theme.class);
//                startActivity(Homepage);
//            }
//        }, timeout);

        themes();
    }

    void themes() {

//        RelativeLayout rl = null;
//        setContentView(R.layout.activity_main);
//        setContentView(R.layout.activity_main);
        name= (EditText) findViewById(R.id.nameinput);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);


        Intent i=new Intent(themesselection.this, theme.class);
        button.setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           String h=name.getText().toString();
                i.putExtra("name", 1);
                i.putExtra("value",h);
                startActivity(i);
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String h=name.getText().toString();
                i.putExtra("value",h);
                i.putExtra("name", 2);
                startActivity(i);

            }
        });


        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String h=name.getText().toString();
                i.putExtra("value",h);
                i.putExtra("name", 3);
                startActivity(i);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String h=name.getText().toString();
                i.putExtra("value",h);
                i.putExtra("name", 4);
                startActivity(i);
            }
        });
    }
}
