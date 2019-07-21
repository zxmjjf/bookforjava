package com.chaptor03.selfprocedure;

import java.util.Date;

public class PrintData {
    public static void main(String[] args) {
        System.out.printf("%tc", new Date());
        System.out.println();

        System.out.printf("%tF", new Date());
        System.out.println();

        System.out.printf("%tT", new Date());
        System.out.println();

        System.out.printf("%tr", new Date());
        System.out.println();

        System.out.printf("%tR", new Date());
        System.out.println();

        System.out.printf("%tY", new Date());
        System.out.println();

        System.out.printf("%ty", new Date());
        System.out.println();

        System.out.printf("%tB", new Date());
        System.out.println();

        System.out.printf("%tN", new Date());
        System.out.println();

        System.out.printf("%tp", new Date());
        System.out.println();

        System.out.printf("%ts", new Date());
        System.out.println();

        System.out.println(1562899690.0/(60*60*24*365) + 1970);

    }
}
