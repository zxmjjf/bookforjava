package com.chaptor03.selfprocedure;

public class ForXunHuan {
    public static void main(String[] args) {
        int a = 0;
        for (double i = 0; i != 10; i += 0.1) {
            ++a;
            System.out.print("  " + i);
            if (a > 1000) {
                System.out.print("无限循环");
                System.exit(0);
            }
        }
    }
}
