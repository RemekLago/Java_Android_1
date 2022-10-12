package com.example.project_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView1 = findViewById(R.id.textView1);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);
        TextView textView4 = findViewById(R.id.textView4);
        TextView textView5 = findViewById(R.id.textView5);
        TextView textView6 = findViewById(R.id.textView6);
        TextView textView7 = findViewById(R.id.textView7);
        TextView textView8 = findViewById(R.id.textView8);
        TextView textView9 = findViewById(R.id.textView9);
        TextView textView10 = findViewById(R.id.textView10);
        TextView textView11 = findViewById(R.id.textView11);
        TextView textView12 = findViewById(R.id.textView12);
        TextView textView13 = findViewById(R.id.textView13);
        TextView textView14 = findViewById(R.id.textView14);

        textView1.setText(Unpacking_Code.text1);
        textView2.setText(Unpacking_Code.text2);
        textView3.setText(Unpacking_Code.text3);
        textView4.setText(Unpacking_Code.text4);
        textView5.setText(Unpacking_Code.text5);
        textView6.setText(Unpacking_Code.text6);
        textView7.setText(Unpacking_Code.text7);
        textView8.setText(Unpacking_Code.text8);
        textView9.setText(Unpacking_Code.text9);
        textView10.setText(Unpacking_Code.text10);
        textView11.setText(Unpacking_Code.text11);
        textView12.setText(Unpacking_Code.text12);
        textView13.setText(Unpacking_Code.text13);
        textView14.setText(Unpacking_Code.text14);


    }
}