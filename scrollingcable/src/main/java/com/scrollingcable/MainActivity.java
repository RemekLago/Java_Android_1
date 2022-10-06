package com.scrollingcable;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

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
        StringBuilder stringBuilder = new StringBuilder("Kable na stanie: \n");

        while (cursor.moveToNext()){
            long id = cursor.getLong(0);
            String konfekcja = cursor.getString(1);
            String lokalizacja = cursor.getString(2);
            int ilosc = cursor.getInt(3);

            stringBuilder.append(id + ":");
            stringBuilder.append(konfekcja + ":");
            stringBuilder.append(lokalizacja + ":");
            stringBuilder.append(ilosc + "\n");
        }

        TextView list_textView = (TextView) findViewById(R.id.listWithCables_textView);
       list_textView.setText(stringBuilder);

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
        values.put(DataBaseColumns.KONFEKCJA_LOKALIZACJA, konfekcja);
        values.put(DataBaseColumns.KONFEKCJA_ILOSC_METROW, konfekcja);
        database.insertOrThrow(DataBaseColumns.TABLE_NAME, null, values);
    }
}