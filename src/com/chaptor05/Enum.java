package com.chaptor05;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Enum {
    public static enum Size {SMALL, MEDIUM, LARGE, EXTRA_LARGE}
    public static void main(String[] args) {
        System.out.println(Size.SMALL.toString());

        Size s = java.lang.Enum.valueOf(Size.class, "LARGE");
        System.out.println(s);

        Size[] values = Size.values();
    }


}
