package com.example.appnamehello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textViewName = findViewById(R.id.textView2);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            String nameString = extras.getString("UserName");
            String fullText = "Hello " + nameString + " Congratulation, you did it!";

            textViewName.setText(fullText);
        }
    }
}