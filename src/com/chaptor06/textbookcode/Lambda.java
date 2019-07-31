package com.chaptor06.textbookcode;


import javax.swing.*;
import javax.swing.Timer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;


/**
 * Lambda 表达式的用法 : book P233
 * @version 1.0.1
 * @jjf  2019-07-22  9:17
 */
public class Lambda {
    public static void main(String[] args) {
        bookCode6_6();
    }

    public static void bookCode6_6 (){
        String[] plants = {"Jjf", "jiang", "jian", "Feng", "is", "a", "big", "handsome"};
        System.out.println(Arrays.toString(plants));

        System.out.println("Sorted in dictionary order");
        Arrays.sort(plants);
        System.out.println(Arrays.toString(plants));

        System.out.println("Sorted by length");
        Arrays.sort(plants, (first, second) -> first.length() - second.length()); //Lambda 表达式
        System.out.println(Arrays.toString(plants));

        Timer t = new Timer(2000, event ->
            System.out.println("The time is " + new Date())); //Lambda 表达式
        t.start();

        JOptionPane.showMessageDialog(null, "jjf quit program?");
        System.exit(0);

        /**
         * 初次总结：lambda表达式用法，作为代码块，提供一个执行结果。
         *     即：如果再某个函数调用中，传递某个参数（往往是实现特定接口的实例），只是为了提供该参数所特有的代码块（接口中特有的函数）
         *         则，再这个参数的位置，可以写成lambda表达式的形式。
         */

    }
}
