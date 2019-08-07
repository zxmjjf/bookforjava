package com.chaptor08.generic;

/**
 * @author jjf
 * @version 2019-08-02
 * 描述：泛型方法的的参数解析
 */
public class GenericMethod {
    public static void main(String[] args) {
        System.out.println(getMiddle("jjf", "jjf1", "jjf2", "jjf3", "jjf4", "jjf5", "jjf6"));
        System.out.println(getMiddle(3.14, 2, 0, "jjf", new TestA()));

    }

    public static <T extends Comparable> T getMiddle(T... a) {
        T[] b = a;
        for (T e : b) {
            System.out.println(e);
        }
        return b[b.length / 2];

    }

}
class TestA implements Comparable{
    @Override
    public String toString() {
        return "TestA";
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

