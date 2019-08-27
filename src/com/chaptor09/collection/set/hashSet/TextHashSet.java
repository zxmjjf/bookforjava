package com.chaptor09.collection.set.hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TextHashSet {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String string = scanner.next();
            System.out.println(string);
        }
        System.out.println("end");
        /*try (Scanner scanner = new Scanner(System.in)) {
            String string;
            while (scanner.hasNext()) {
                string = scanner.next();
                System.out.println(string);
            }
        }*/

    }
}
