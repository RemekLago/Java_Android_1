package com.scrollingcable;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import com.scrollingcable.db.DataBaseCable;

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
}