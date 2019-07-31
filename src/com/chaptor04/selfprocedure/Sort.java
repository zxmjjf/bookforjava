package com.chaptor04.selfprocedure;

import java.awt.*;
import java.util.Arrays;

public class Sort implements Comparable<Sort>{
    int num;
    public static void main(String[] args) {
        int[] ints = {1, 0, 3, 4, 4, 5, 8, 3};
        Arrays.sort(ints);
        Sort[] sorts = new Sort[9];
        sorts[0] = new Sort(0);
        sorts[1] = new Sort(3);
        sorts[2] = new Sort(6);
        sorts[3] = new Sort(8);
        sorts[4] = new Sort(9);
        sorts[5] = new Sort(-3);
        sorts[6] = new Sort(7);
        sorts[7] = new Sort(11);
        sorts[8] = new Sort(91);


        Arrays.sort(sorts);

        System.out.println(Arrays.toString(sorts));

        Toolkit.getDefaultToolkit().beep();
        Toolkit.getDefaultToolkit().beep();

        System.out.println(Arrays.toString(ints));

    }

    Sort(int num) {
        this.num = num;
    }
    public String toString(){
        return num + "";
    }

    @Override
    public int compareTo(Sort o) {
        if (this.num > o.num) {
            return 1;
        } else if (this.num == o.num) {
            return 0;
        }else {
            return -1;
        }
    }
}
