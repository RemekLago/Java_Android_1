package com.example.database_storage.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.database_storage.db.entity.Contact;

import java.lang.invoke.ConstantCallSite;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "contact_db";

    public DatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(Contact.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS" + Contact.CREATE_TABLE);
        onCreate(sqLiteDatabase);
    }

    // Insert Data into Datatable
    public long insertContact(String name, String email){
        SQLiteDatabase db = this.getReadableDatabase();
        ContentValues values = new ContentValues();

        long id = db.insert(Contact.TABLE_NAME, null, values);
        db.close();

        return id;
    }

    // Getting Contact(data) from DataBase
    public Contact getContact(long id){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(
                Contact.TABLE_NAME,
                new String[]{
                        Contact.COLUMN_ID,
                        Contact.COLUMN_NAME,
                        Contact.COLUMN_EMAIL},
                Contact.COLUMN_ID + "=?",
                new String[]{
                        String.valueOf(id) },
            null,
            null,
            null,
            null);

        if (cursor != null){
            cursor.moveToFirst();
        }

        Contact contact = new Contact(
                cursor.getString(cursor.getColumnIndex(Contact.COLUMN_NAME)),
                cursor.getString(cursor.getColumnIndex(Contact.COLUMN_EMAIL)),
                cursor.getInt(cursor.getColumnIndex(Contact.COLUMN_ID)));

        cursor.close();
        return contact;
    }

    // Getting all Contacts(data)



}
