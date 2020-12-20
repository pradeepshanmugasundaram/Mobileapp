package com.example.loginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomePageActivity extends AppCompatActivity {
    private TextView text1;
    private TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);
        Intent intent = getIntent();
        String str1 = intent.getStringExtra("message1");
        text1.setText(str1);
        String str2 = intent.getStringExtra("message2");
        text2.setText(str2);
    }

}