package com.chaptor09.text;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @author jjf
 * @version 1.0.0.1  2019-08-13
 * 描述：测试ArrayList类的sort()方法的用法
 * */
public class Text2 {
    public static void main(String[] args) {
        text1();
        //text2();
    }
    public static void text1(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("jjf1");
        arrayList.add("jjf");
        arrayList.add("jiang");
        arrayList.add("jiangfang");
        arrayList.add("xl");

        ListIterator iterator = arrayList.listIterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.previous());
        System.out.println(iterator.previous());
        System.out.println(iterator.next());


    }

    public static void text2(){
        ArrayList arrayList = new ArrayList();
        arrayList.add("jjf1");
        arrayList.add(2);
        arrayList.add("jjf");
        arrayList.add(new int[]{1, 3, 3});

        System.out.println(arrayList);
        arrayList.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return o1.hashCode() - o2.hashCode();
            }
        });
        System.out.println(arrayList);

        Iterator iterator = arrayList.iterator();
        Iterator iterator1 = arrayList.iterator();

        iterator.next();
        iterator1.next();
        iterator.remove();
    }
}

class Test implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}