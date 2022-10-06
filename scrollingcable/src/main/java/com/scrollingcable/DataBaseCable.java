package com.scrollingcable;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseCable extends SQLiteOpenHelper {
    private static final String DATA_BASE_NAME = "DataBaseCable.db";
    private static final int DATA_BASE_VERSION = 1;


    public DataBaseCable(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATA_BASE_NAME, factory, DATA_BASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + DataBaseColumns.TABLE_NAME + " (" +
                DataBaseColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                DataBaseColumns.STARA_KONFEKCJA + " TEXT, " +
                DataBaseColumns.STARA_KONFEKCJA_LOKALIZACJA + " TEXT NOT NULL, " +
                DataBaseColumns.ILOSC_METROW_PRZED + " INTEGER, " +
                DataBaseColumns.ILOSC_METROW_PO + " INTEGER, " +
                DataBaseColumns.ILOSC_METROW_PRZEWINIETO + " INTEGER, " +
                DataBaseColumns.NOWA_KONFEKCJA + " TEXT, " +
                DataBaseColumns.NOWA_KONFEKCJA_DLUGOSC + " INTEGER, " +
                DataBaseColumns.NOWA_KONFEKCJA_LOKALIZACJA + " TEXT" +" )"
                );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + DataBaseColumns.TABLE_NAME);
        onCreate(db);
    }
}
