package com.scrollingcable;

import static com.scrollingcable.activities_on_database.ActivitiesOnDatabase.dataBaseCable;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.scrollingcable.activities_on_database.ActivitiesOnDatabase;
import com.scrollingcable.db.DataBaseColumns;
import com.scrollingcable.db.DataCable;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataBaseCable = new DataCable(this);

        Button pokaz_Button = findViewById(R.id.pokaz_button);

        pokaz_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CableList.class);
                StringBuilder nexttext = ActivitiesOnDatabase.showKonfekcja(ActivitiesOnDatabase.takeKonfekcja());
                intent.putExtra("listcables", (CharSequence) nexttext);
                startActivity(intent);
            }
        });

        try{
            ActivitiesOnDatabase.addKonfekcja("Konfekcja3", "Magazyn3", 700 );
            Cursor cursor = ActivitiesOnDatabase.takeKonfekcja();
            ActivitiesOnDatabase.showKonfekcja(cursor);
        } finally{
            ActivitiesOnDatabase.dataBaseCable.close();
        }
    }





}