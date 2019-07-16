package com.chaptor03.text1;

/**
 * 所有浮点数的计算都遵循IEEE 754 规范
 * ·正无穷大
 * ·负无穷大
 * ·NaN
 */
public class Ieee754Standard {
    public static void main(String[] args) throws ArithmeticException{
        /*浮点数计算中除数值为0*/
        System.out.println(0./0.0);
        System.out.println(0/0f);
        System.out.println(0/0d);
        System.out.println(1/0f);
        System.out.println(-1/0f);
        //System.out.println(0/0); //此语句会抛出异常

        /*double数值中的无穷值*/
        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY);


        /*判断一个非数值是否为NaN*/
        if (Double.isNaN(0 / 0.0)) {
            System.out.println("test Double.isNaN() method");
        }


        /*浮点数的计算：
        注意：如果除数值为零，则必须表示成浮点数的形成，不能直接写成0，即不能让其值可能当作整数使用。否则如果
        会抛出异常。被除数可以是任意数。 计算0/0.0或者负数的平方根结果为NaN
        任何NaN都不相等。可以使用Double.isNaN()判断值是否为NaN。


上述程序运行结果：
NaN
NaN
NaN
Infinity
-Infinity
Infinity
-Infinity
test Double.isNaN() method

*/
    }
}
