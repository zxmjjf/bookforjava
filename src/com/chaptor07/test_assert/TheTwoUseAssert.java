package com.chaptor07.test_assert;

import java.util.Scanner;

public class TheTwoUseAssert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();


        assert a > 0 : "a 小于 0";
        //printValue(a);
    }

    public static void printValue(int value) {
        System.out.println("this values is " + value);
    }
}
