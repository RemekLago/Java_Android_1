package com.example.helloworld2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView1 = findViewById(R.id.text1);
        textView1.setText("Hello");
        textView1.setTextColor(Color.RED);
        textView1.setTextSize(32);
        textView1.setBackgroundColor(Color.GREEN);

        TextView textView2 = findViewById(R.id.text2);

        EditText edit1 = findViewById(R.id.edit1);
        EditText edit2 = findViewById(R.id.edit2);

    }
}