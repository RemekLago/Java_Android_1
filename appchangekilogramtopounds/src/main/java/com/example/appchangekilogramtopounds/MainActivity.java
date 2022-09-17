package com.example.appchangekilogramtopounds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Widgets
        EditText editText = findViewById(R.id.editText);
        Button button = findViewById(R.id.button);
        TextView textView1 = findViewById(R.id.textView1);
        TextView textView2 = findViewById(R.id.textView2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 1 - Get the kilograms value from the editText
                String kilograms = editText.getText().toString();
                // 2 - Convert kilograms to pounds
                float kilos = Float.parseFloat(kilograms);
                float pounds = (float) (kilos * 2.20462);

                // 3 - Set the TextView with the Result - displaying Results
                textView1.setText("" + pounds);
            }
        });

    }
}