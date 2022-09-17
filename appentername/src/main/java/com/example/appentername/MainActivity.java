package com.example.appentername;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText edit1 = findViewById(R.id.nameEditText);
        Button button1 = findViewById(R.id.buttonClick);
        ImageView image1 = findViewById(R.id.imageView);

        image1.setImageResource(R.drawable.dragon);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edit1.getText().toString();
                Toast.makeText(getApplicationContext(), "Hello " + name, Toast.LENGTH_SHORT).show();
            }
        });
    }
}