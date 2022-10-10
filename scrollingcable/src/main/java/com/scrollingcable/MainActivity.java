package com.scrollingcable;

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

import com.scrollingcable.db.DataBaseColumns;
import com.scrollingcable.db.DataCable;

public class MainActivity extends AppCompatActivity {

    private DataCable dataBaseCable;


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
                StringBuilder nexttext = showKonfekcja(takeKonfekcja());
                intent.putExtra("listcables", (CharSequence) nexttext);
                startActivity(intent);
            }
        });

        try{
            addKonfekcja("Konfekcja3", "Magazyn3", 700 );
            Cursor cursor = takeKonfekcja();
            showKonfekcja(cursor);
        } finally{
            dataBaseCable.close();
        }


    }

    private StringBuilder showKonfekcja(Cursor cursor) {
        StringBuilder stringBuilder = new StringBuilder("Kable na stanie: \n");

        while (cursor.moveToNext()){
            long id = cursor.getLong(0);
            String konfekcja = cursor.getString(1);
            String lokalizacja = cursor.getString(2);
            int ilosc = cursor.getInt(3);

            stringBuilder.append(id + ", ");
            stringBuilder.append(konfekcja + ", ");
            stringBuilder.append(lokalizacja + ", ");
            stringBuilder.append(ilosc + "\n");
        }

        return stringBuilder;
    }

    private Cursor takeKonfekcja() {
        SQLiteDatabase database = dataBaseCable.getReadableDatabase();
        Cursor cursor = database.query(DataBaseColumns.TABLE_NAME,
                new String[]{DataBaseColumns._ID,
                        DataBaseColumns.KONFEKCJA,
                        DataBaseColumns.KONFEKCJA_LOKALIZACJA,
                        DataBaseColumns.KONFEKCJA_ILOSC_METROW},
                null, null, null, null, DataBaseColumns._ID);
//        startManagingCursor(cursor);
        return cursor;
    }

    private void addKonfekcja(String konfekcja, String lokalizacja, int ilosc) {
        SQLiteDatabase database = dataBaseCable.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(DataBaseColumns.KONFEKCJA, konfekcja);
        values.put(DataBaseColumns.KONFEKCJA_LOKALIZACJA, lokalizacja);
        values.put(DataBaseColumns.KONFEKCJA_ILOSC_METROW, ilosc);
        database.insertOrThrow(DataBaseColumns.TABLE_NAME, null, values);
    }

}