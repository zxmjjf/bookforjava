package com.chaptor03.text1;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int num = 100;
        int[] a = new int[num];
        int[] b = {1,2,3,4,5,6,8,9};
        int[] c = {2, 3, 9, 4, 2, 1, 6, 8, 2, 0};

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        a = new int[]{1, 3, 3};
        System.out.println(Arrays.toString(a));

        int[] acopy = Arrays.copyOf(a, 2);
        System.out.println(Arrays.toString(acopy));

        System.out.println(Arrays.toString(c));
        //Arrays.parallelSort(c);
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));


    }
}
