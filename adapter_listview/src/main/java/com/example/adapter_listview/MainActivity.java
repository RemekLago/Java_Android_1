package com.example.adapter_listview;

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
        ListView listView = findViewById(R.id.listView1);
        // 2. Data Source - for example Array
        String[] androidVersions = {
                "Lollipop",
                "Oreo",
                "Kitkat",
                "Marshmallow",
                "Android 10",
                "Android 11",
                "Android 12"
        };
        // 3. Adapter - ArrayAdapter
        ArrayAdapter adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, androidVersions);

        listView.setAdapter(adapter);


    }
}