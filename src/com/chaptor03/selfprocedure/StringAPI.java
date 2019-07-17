package com.chaptor03.selfprocedure;

public class StringAPI {
    public static void main(String[] args) {
        String string = "jiang jian feng";
        String string1 = "姜剑锋蹋蹋沱";

        //codePointAt()
        /**
         *  由于String类型是由char类型序列构成，而char类型由16进制的Unicode编码，所以
         *  一个char类型可能由一个或一对代码单元组成，简称一个码点，一个码点一定对应一个
         *  String类型的字符或一个char类型的字符。
         *  lenth()方法返回的是一个字符串中的字符单元的数目，不是实际的码点数，而一个码点数可能
         *  由一个或两个字符单元构成。
         *
         */
        //对应于确定实际码点数的方法为
        System.out.println(string1.length());
        System.out.println(string1.codePointCount(0, 6));
        System.out.println((char)string.codePointAt(7));//

        //offsetByCodePoints
        System.out.println(string.offsetByCodePoints(2,2));

        StringBuilder builder = new StringBuilder("jjf");
        builder.append("zxm");
        string = builder.toString();
        System.out.println(string);
        builder.appendCodePoint(65555);
        builder.appendCodePoint(59996);
        builder.appendCodePoint(59997);
        builder.appendCodePoint(59998);
        builder.appendCodePoint(59999);

        builder.appendCodePoint(60000);
        builder.appendCodePoint(60001);
        builder.appendCodePoint(60002);
        builder.appendCodePoint(60003);
        builder.appendCodePoint(60004);

        string = builder.toString();
        System.out.println(string);
        System.out.println(string.codePointCount(0, string.length()));
        System.out.println(string.length());
        for (int i = 0; i < string.length(); ++i) {
            System.out.println(string.charAt(i));
        }


    }
}
