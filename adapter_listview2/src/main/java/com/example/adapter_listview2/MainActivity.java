package com.example.adapter_listview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 1. ListView View declaration
        ListView listView = findViewById(R.id.listView2);

        // 2. Data Source - Array [title, subtitle, images]
        String[] mainTitle = {
                "Master Coding 111",
                "Master Coding 222",
                "Master Coding 333",
                "Master Coding 444",
        };
        String[] subTitle = {
                "Subtitle 111",
                "Subtitle 222",
                "Subtitle 333",
                "Subtitle 444",
        };
        int[] imagesArray = {
                R.drawable.image1,
                R.drawable.image2,
                R.drawable.image3,
                R.drawable.image4,
        };

        // 3. Adapter - Custom Adapter

        MyListAdapter adapter = new MyListAdapter(this, mainTitle, subTitle, imagesArray);
        listView.setAdapter(adapter);


    }
}