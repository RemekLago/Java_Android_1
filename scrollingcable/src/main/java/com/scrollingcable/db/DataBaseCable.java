package com.scrollingcable.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DataBaseCable extends SQLiteOpenHelper {
    private static final String DATA_BASE_NAME = "dataBaseCable.db";
    private static final int DATA_BASE_VERSION = 1;


    public DataBaseCable(Context context, String name,
                         SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATA_BASE_NAME, null, DATA_BASE_VERSION);
    }

    public DataBaseCable(Context context) {
        super(context, DATA_BASE_NAME, null, DATA_BASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + DataBaseColumns.TABLE_NAME + "(" +
                DataBaseColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                DataBaseColumns.KONFEKCJA + " TEXT, " +
                DataBaseColumns.KONFEKCJA_LOKALIZACJA + " TEXT, " +
                DataBaseColumns.KONFEKCJA_ILOSC_METROW + " INTEGER" + " )"
                );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + DataBaseColumns.TABLE_NAME);
        onCreate(db);
    }
}
