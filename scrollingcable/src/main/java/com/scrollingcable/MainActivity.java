package com.scrollingcable;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.scrollingcable.db.DataBaseCable;
import com.scrollingcable.db.DataBaseColumns;

public class MainActivity extends Activity {

    private DataBaseCable dataBaseCable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataBaseCable = new DataBaseCable(this);

        try{
            addKonfekcja("Konfekcja1", "Magazyn1", 500 );
            Cursor cursor = takeKonfekcja();
            showKonfekcja(cursor);
        } finally{
            dataBaseCable.close();
        }
    }

    private void showKonfekcja(Cursor cursor) {
    }

    private Cursor takeKonfekcja() {
    }

    private void addKonfekcja(String konfekcja, String lokalizacja, int ilosc) {
        SQLiteDatabase database = dataBaseCable.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(DataBaseColumns.KONFEKCJA, konfekcja);
        values.put(DataBaseColumns.KONFEKCJA_LOKALIZACJA, konfekcja);
        values.put(DataBaseColumns.KONFEKCJA_ILOSC_METROW, konfekcja);
        database.insertOrThrow(DataBaseColumns.TABLE_NAME, null, values);
    }
}