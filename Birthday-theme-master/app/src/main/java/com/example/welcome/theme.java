package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class theme extends AppCompatActivity {
TextView tv;
String j;
    int s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme);
        s=getIntent().getIntExtra("name", 1);
         tv=findViewById(R.id.textView);
        ImageView theme=findViewById(R.id.theme);

        if(s ==1) {
            j = "Happy Birthday " + getIntent().getExtras().getString("value");
            tv.setText(j);
            theme.setImageResource(R.drawable.theme);
        }
        else if(s ==2)
        {
            j="Happy Birthday "+getIntent().getExtras().getString("value");
            tv.setText(j);
            theme.setImageResource(R.drawable.themes2);
        }
        else if(s ==3)
        {
            j="Happy Birthday "+getIntent().getExtras().getString("value");
            tv.setText(j);
            theme.setImageResource(R.drawable.themese3);
        }
        else if(s ==4)
        {
            j="Happy Birthday "+getIntent().getExtras().getString("value");
            tv.setText(j);
            theme.setImageResource(R.drawable.theme4);
        }
    }
}