package com.chaptor05.textbookcode;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.Object;
import java.util.Scanner;

/**
 * 课本代码：书籍《java核心技术卷1》P_195
 * @version 1.0 2019-07-21
 * @since version 1.0
 * @author jjf
 * @see <a href="www.horstmann.com/corejava.html">The Core Java home page</a>
 * 功能：打印一个类的信息
 */
public class ReflectionTest {
    public static void main(String[] args) {
        String name;
        if (args.length > 0) {
            name = args[0];
        }else {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter Class Name(e.g. java.util.Date):");
            name = in.next();
        }

        try {
            Class c1 = Class.forName(name);
            Class superc1 = c1.getSuperclass();
            String modifiers = Modifier.toString(c1.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print("class "  + name);
            if (superc1 != null && superc1 != Object.class) {
                System.out.print(" extends " + superc1.getName());
            }

            System.out.print("{\n");
            printConstructors(c1);
            System.out.println();
            printMethods(c1);
            System.out.println();
            printFields(c1);
            System.out.println();
            System.out.println("}");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }

        System.exit(0);
    }

    /**
     * 打印构造方法的签名
     * @param c1 构造器所属的类
     */
    public static void printConstructors(Class c1) {
        Constructor[] constructors = c1.getDeclaredConstructors();

        for (Constructor c : constructors) {
            String name = c1.getName(); /*获得构造方法名字*/
            System.out.print("  ");
            String modifiers = Modifier.toString(c.getModifiers()); /*获得方法的修饰符*/
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(name + "(");

            Class[] parameterTypes = c.getParameterTypes();
            for (int j = 0; j < parameterTypes.length; ++j) {
                if (j > 0) {
                    System.out.print(",");
                    System.out.print(parameterTypes[j].getName());
                }
            }
            System.out.println(");");
        }
    }


    /**
     * 打印类的方法，不打印继承部分的方法
     * @param c1
     */
    public static void printMethods(Class c1) {
        Method[] methods = c1.getDeclaredMethods();

        for (Method m : methods){
            Class retType = m.getReturnType();
            String name = m.getName();

            System.out.print("  ");
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(retType.getName() + " " + name + "(");

            Class[] paramType = m.getParameterTypes();
            for (int j = 0; j < paramType.length; ++j) {
                if (j > 0) {
                    System.out.print(", ");
                    System.out.print(paramType[j].getName());
                }
            }
            System.out.println(");");
        }
    }


    /**
     * 打印类的数据域
     * @param c1
     */
    public static void printFields(Class c1) {
        Field[] fields = c1.getFields();

        for (Field f : fields) {
            Class type = f.getType();
            String name = f.getName();
            System.out.print("  ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.println(type.getName() + " " + name + ";");
        }
    }
}
