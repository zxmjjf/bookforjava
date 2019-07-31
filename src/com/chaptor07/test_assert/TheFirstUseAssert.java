package com.chaptor07.test_assert;

import java.util.Scanner;

/**
 * 描述：测试断言失败的情况
 */

public class TheFirstUseAssert {
    /**
     * 程序入口
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        /*断言 a 的值大于0*/
        assert a > 0: a;
        printValues(a);
    }


    /**
     * 为这个方法的参数使用断言
     * @param values the values must be more than zero
     */
    public static void printValues(int values) {
        System.out.println("the values is " + values);
    }
}
