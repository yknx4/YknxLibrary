package com.yknx4.lib.yknxtools.number;

/**
 * Created by yknx4 on 3/16/16.
 */
public class Ordinal {
    public static String getString(int i){
        String[] sufixes = new String[] { "th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th" };
        switch (i % 100) {
            case 11:
            case 12:
            case 13:
                return i + "th";
            default:
                return i + sufixes[i % 10];

        }
    }
}
