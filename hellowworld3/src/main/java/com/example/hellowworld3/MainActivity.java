package com.example.hellowworld3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edit1 = findViewById(R.id.edit1);
        EditText edit2 = findViewById(R.id.edit2);
        EditText edit3 = findViewById(R.id.edit3);

        edit1.setTextColor(Color.RED);
        edit2.setTextSize(32);
        edit3.setBackgroundColor(Color.BLUE);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);

        button2.setText("Say hello");
        button2.setTextColor(Color.RED);



        // Getting Input from EditText
        String name = edit1.getText().toString();
        String phone = edit2.getText().toString();
        String password = edit3.getText().toString();

    }
}