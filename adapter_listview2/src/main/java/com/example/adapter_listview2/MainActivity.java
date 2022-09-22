package com.example.adapter_listview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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

        // second solution
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Toast.makeText(getApplicationContext(), "First Item has been clicked", Toast.LENGTH_SHORT).show();
                } else if (i == 1) {
                    Toast.makeText(getApplicationContext(), "Second Item has been clicked", Toast.LENGTH_SHORT).show();
                } else if (i == 2) {
                    Toast.makeText(getApplicationContext(), "Third Item has been clicked", Toast.LENGTH_SHORT).show();
                }else if (i == 3) {
                    Toast.makeText(getApplicationContext(), "Forth Item has been clicked", Toast.LENGTH_SHORT).show();
                }
                return false;
        }
        });
    }
}

                // 4. Handling Click Event
//        listView.setOnClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                if (i == 0){
//                    Toast.makeText(getApplicationContext(), "First Item has been clicked", Toast.LENGTH_SHORT).show();
//                }else if (i == 1){
//                    Toast.makeText(getApplicationContext(), "Second Item has been clicked", Toast.LENGTH_SHORT).show();
//                }else if (i == 2){
//                Toast.makeText(getApplicationContext(), "Third Item has been clicked", Toast.LENGTH_SHORT).show();
//            }
//        });
