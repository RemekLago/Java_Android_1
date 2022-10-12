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

import com.google.android.material.textfield.TextInputEditText;
import com.scrollingcable.activities_on_database.ActivitiesOnDatabase;
import com.scrollingcable.db.DataBaseColumns;
import com.scrollingcable.db.DataCable;

public class MainActivity extends AppCompatActivity {

    String input_konfekcja = "";
    String input_lokalizacja = "";
    String input_ilosc = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataBaseCable = new DataCable(this);

        Button zatwierdz_button = findViewById(R.id.zatwierdz_button);
        Button pokaz_button = findViewById(R.id.pokaz_button);
        TextInputEditText numer_konfekcji_input = findViewById(R.id.numer_konfekcji_input);
        TextInputEditText ilosc_metrow_input = findViewById(R.id.ilosc_metrow_input);
        TextInputEditText lokalizacja_input = findViewById(R.id.lokalizacja_input);



        pokaz_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CableList.class);
                StringBuilder nexttext = ActivitiesOnDatabase.showKonfekcja(ActivitiesOnDatabase.takeKonfekcja());
                intent.putExtra("listcables", (CharSequence) nexttext);
                startActivity(intent);
            }
        });

        zatwierdz_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_konfekcja = numer_konfekcji_input.getText().toString();
                input_lokalizacja = lokalizacja_input.getText().toString();
                input_ilosc = ilosc_metrow_input.getText().toString();
            }
        });

        try{
            ActivitiesOnDatabase.addKonfekcja(input_konfekcja, input_lokalizacja, Integer.parseInt(input_ilosc));
            Cursor cursor = ActivitiesOnDatabase.takeKonfekcja();
            ActivitiesOnDatabase.showKonfekcja(cursor);
        } finally{
            ActivitiesOnDatabase.dataBaseCable.close();
        }
    }





}