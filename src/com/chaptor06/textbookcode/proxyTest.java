package com.chaptor06.textbookcode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Random;

/**
 * This programm demonstrates the use of proxies
 * 课本代码：P261
 * 代码清单6_10
 */

public class proxyTest {
    public static void main(String[] args) {
        Object[] elements = new Object[1000];

        for (int i = 0; i < elements.length; ++i) {
            MyClass value1 = new MyClass(i + 1);
            //Integer value = i + 1;
            //InvocationHandler handler = new TraceHandler(value);
            InvocationHandler handler = new TraceHandler(value1);
            Object proxy = Proxy.newProxyInstance(null, new Class[]{Comparable.class}, handler);
            elements[i] = proxy;
        }

        Integer key = new Random().nextInt(elements.length) + 1;

        int result = Arrays.binarySearch(elements, key);
        if (result >= 0) {
            System.out.println(elements[result]);
            //为啥代理类的实例elements[result] 是一个整数？？？
        }
    }
}

class TraceHandler implements InvocationHandler {

    private Object target;

    public TraceHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        System.out.print(target);
        System.out.print("." + method.getName() + "(");

        if (args != null) {
            for (int i = 0; i < args.length; ++i) {
                System.out.print(args[i]);
                if (i < args.length - 1) {
                    System.out.print(", ");

                }
            }
        }
        System.out.println(")");


        return method.invoke(target, args);
    }
}

class MyClass implements Comparable{
    int value;
    MyClass(int value){
        this.value = value;
    }
    public String  toString(){
        return value + "";
    }

    @Override
    public int compareTo(Object o) {
        return value - Integer.parseInt(o.toString());
    }
}
