package com.example.project_v1;

public class Unpacking_Code {

    public static String code_for_scan_label = "1233|3456|345";
//            "WYGPZ2201681|         1897 013 05|0,300|0|S300-2205||562105_1|749955|NEW|||124/A/05/22||||20.05.22|||||||";
    public static String[] code = code_for_scan_label.split("\\|");

    static String text1 = code[0];
    static String text2 = code[1].trim();
    static String text3 = code[2];
    static String text4 = code[3];
    static String text5 = code[4];
    static String text6 = code[5];
    static String text7 = code[6];
    static String text8 = code[7]; //pusty
    static String text9 = code[8]; //pusty
    static String text10 = code[9];
    static String text11 = code[10]; //pusty
    static String text12 = code[11]; //pusty
    static String text13 = code[12]; //pusty
    static String text14 = code[13];

}
