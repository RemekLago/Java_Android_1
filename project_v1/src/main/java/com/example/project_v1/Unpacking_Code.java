package com.example.project_v1;

import java.util.ArrayList;

public class Unpacking_Code {

    public static String code_for_scan_label = "WYGPZ2201681|         1897 013 05|0,300|0|S300-2205||562105_1|749955|NEW|||124/A/05/22||||20.05.22|||||||";
    public static String[] c = code_for_scan_label.split("|");

    public static void Read() {
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }


}
