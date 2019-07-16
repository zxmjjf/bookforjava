package com.textbookcode;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 课本P83，代码清单3-7
 * @version 1.0.1 2019-07-12
 * @author myself
 */
public class Code3_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How number do you need to draw?");
        int k = scanner.nextInt();

        System.out.println("What is the highest number you candraw?");
        int n = scanner.nextInt();

        //fill array for numbers with 1, 2, 3....
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; ++i) {
            numbers[i] = i + 1;
        }

        int[] results = new int[k];

        for (int i = 0; i < results.length; ++i) {
            int rand = (int) (Math.random() * n);

            results[i] = numbers[rand];

            numbers[rand] = numbers[n - 1];
            n--;
        }
        Arrays.sort(results);
        for (int element : results) {
            System.out.println(element);
        }
    }
}
