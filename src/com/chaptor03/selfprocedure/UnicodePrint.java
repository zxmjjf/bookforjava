package com.chaptor03.selfprocedure;

public class UnicodePrint {
    public static void main(String[] args) {
        char ch = '\u0000';
        System.out.println(ch);
        for (int i = 0; i < 5000; ++i) {
            if (i % 60 == 0) {
                System.out.println();
            }
            ch++;
            System.out.print(ch + " ");
        }
    }
}
