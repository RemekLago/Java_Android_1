package com.scrollingcable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CableList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cable_list);


        TextView list_textView = (TextView) findViewById(R.id.textView2);
        String listcables = getIntent().getStringExtra("listcables");
        list_textView.setText(listcables);
    }
}