package com.chaptor09.text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * 测试java API 的 ArrayList
 */
public class Text1 {
    public static void main(String[] args) {
        text1();
    }

    private static void text1(){
        /**使用非泛型的ArrayList*/
        ArrayList arrayList = new ArrayList();

        /**测试add()方法*/
        arrayList.add(2);
        arrayList.add("jjf");
        arrayList.add(new InClass(1));

        /**元素结构类似于*/
        Object[] arrays1 = new Object[3];
        arrays1[0] = 2;
        arrays1[1] = "jjf";
        arrays1[2] = new InClass(1);
        System.out.println(Arrays.toString(arrays1));

        /** toString()方法：返回的是集合元素的数组输出，即类似于Arrays.toString()*/
        System.out.println(arrayList);

        /**toArray()方法：返回Object[]类型的数组*/
        Object[] arrays = arrayList.toArray();
        System.out.println(arrays);

        /**get()方法*/
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));

        /**clone()方法：此方法已经进一步深拷贝*/
        ArrayList arrayList1 = (ArrayList)arrayList.clone();
        System.out.println(arrayList1);
        arrayList1.set(2, new InClass(2));
        System.out.println(arrayList);
        System.out.println(arrayList1);

        /**测试迭代器Iterator*/
        Iterator iterator = arrayList.iterator();
        /*Iterator的forEachRemaining方法类似于foreach循环*/
        iterator.forEachRemaining(object -> System.out.println(object));
        iterator = arrayList.iterator();
        System.out.println(iterator.next());
        iterator.remove();
        //iterator.remove(); //Execption
        System.out.println(arrayList);

        /**arraylist1实现了Iterator，可以使用for each循环*/
        for (Object object : arrayList1) {
            System.out.println(object);
        }

        iterator.next();
        //arrayList.add(2, "jjf1");
        iterator.remove();
        System.out.println(arrayList);





        System.out.println();
    }

    public  static class InClass{
        public int number;
        InClass(int number){
            this.number = number;
        }

        @Override
        public String toString() {
            return "self value " + number;
        }
    }
}
