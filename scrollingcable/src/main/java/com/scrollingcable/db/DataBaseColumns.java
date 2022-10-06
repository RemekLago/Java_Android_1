package com.scrollingcable.db;

import android.provider.BaseColumns;

public interface DataBaseColumns extends BaseColumns {
    public static final String TABLE_NAME = "baza_kable";

//    public static final String STARA_KONFEKCJA = "stara_konfekcja";
//    public static final String STARA_KONFEKCJA_LOKALIZACJA = "stara_konfekcja_lokalizacja";
//    public static final String ILOSC_METROW_PRZED = "ilosc_metrow_przed";
//    public static final String ILOSC_METROW_PO  = "ilosc_metrow_po";
//    public static final String ILOSC_METROW_PRZEWINIETO  = "ilosc_metrow_przewinieto";
//    public static final String NOWA_KONFEKCJA  = "nowa_konfekcja";
//    public static final String NOWA_KONFEKCJA_DLUGOSC  = "nowa_konfekcja_dlugosc";
//    public static final String NOWA_KONFEKCJA_LOKALIZACJA = "nowa_konfekcja_lokalizacja";

    public static final String KONFEKCJA = "konfekcja";
    public static final String KONFEKCJA_LOKALIZACJA = "konfekcja_lokalizacja";
    public static final String KONFEKCJA_ILOSC_METROW = "konfekcja_ilosc_metrow";
}
