package com.scrollingcable.activities_on_database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.scrollingcable.MainActivity;
import com.scrollingcable.db.DataBaseColumns;
import com.scrollingcable.db.DataCable;

public class ActivitiesOnDatabase {

    public static DataCable dataBaseCable;

    public static StringBuilder showKonfekcja(Cursor cursor) {

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

    public static Cursor takeKonfekcja() {
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

    public static void addKonfekcja(String konfekcja, String lokalizacja, int ilosc) {
        SQLiteDatabase database = dataBaseCable.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(DataBaseColumns.KONFEKCJA, konfekcja);
        values.put(DataBaseColumns.KONFEKCJA_LOKALIZACJA, lokalizacja);
        values.put(DataBaseColumns.KONFEKCJA_ILOSC_METROW, ilosc);
        database.insertOrThrow(DataBaseColumns.TABLE_NAME, null, values);
    }
}
