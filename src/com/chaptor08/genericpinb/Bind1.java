package com.chaptor08.genericpinb;

/**
 * @author jjf
 * @version 2019-08-03
 * 描述：测试泛型设计的约束和限制
 */
public class Bind1 {
    public static void main(String[] args) {
        //Myclass1<int> myclass1 = new Myclass1<int>();
        Myclass1<Integer> myclass1 = new Myclass1<>();
        Myclass1<String> myclass11 = new Myclass1<>();
        if (myclass1.getClass() == myclass11.getClass()) {
            System.out.println("泛型使用getClass会得到原始类型");
        }
        if (myclass1 instanceof Myclass1) {
            System.out.println("泛型中使用instanceof只能使用原始类型");
        }

        //gMyclass1<String>[] table = new Myclass1<String>[10];
    }
}

/**
 * 泛型类1
 * @param <T>
 */
class Myclass1<T>{
    /*泛型数据*/
    T values;

    /**
     * 查看器方法
     * @return
     */
    public T getValues() {
        return values;
    }

    /**
     * 更改器方法
     * @param values
     */
    public void setValues(T values) {
        this.values = values;
    }
}
