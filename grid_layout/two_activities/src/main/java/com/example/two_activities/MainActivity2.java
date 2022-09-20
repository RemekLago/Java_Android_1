package com.example.two_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView = findViewById(R.id.textView2);

        // receiving data from Activity1
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String myString = extras.getString("myName");

            textView.setText(myString);
        }

    }
}