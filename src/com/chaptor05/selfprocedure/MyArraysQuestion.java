package com.chaptor05.selfprocedure;


public class MyArraysQuestion {
    private String name = "jjf";
    static Object object;
    public static void main(String[] args) {
        Object[] objects = new Object[5];

        //Object object;
        System.out.println(objects[0]);
        System.out.println(object);

        objects[0] = new Parent();
        objects[1] = new Child();
        objects[2] = new MyArraysQuestion();


        System.out.println(((Parent)objects[0]).getName());
        System.out.println(((Child)objects[1]).getName());
        System.out.println(((MyArraysQuestion)objects[2]).getName());

        Parent[] parents = new Parent[5];
        parents[0] = new Parent();
        parents[1] = new Parent();
        parents[2] = new Parent();

        objects = parents;
        //objects[2] = new Child(); object[2] 可以改为指向其子类
        objects[3] = new Child();
        //objects[4] = new MyArraysQuestion(); //Expection

        System.out.println(((Parent)objects[0]).getName());
        System.out.println(((Parent)objects[1]).getName());
        System.out.println(((Parent)objects[2]).getName());

        System.out.println(((Child)objects[3]).getName());
        //System.out.println(((MyArraysQuestion)objects[4]).getName());//Expection


        MyArraysQuestion[] myArraysQuestions = new MyArraysQuestion[5];
        myArraysQuestions[0] = new MyArraysQuestion();
        myArraysQuestions[1] = new MyArraysQuestion();
        myArraysQuestions[2] = new MyArraysQuestion();

        objects = myArraysQuestions;

        System.out.println(((MyArraysQuestion)objects[0]).getName());
        System.out.println(((MyArraysQuestion)objects[1]).getName());
        System.out.println(((MyArraysQuestion)objects[2]).getName());

        objects = new Object[5];
        objects[0] = new Parent();
        objects[1] = new Child();
        objects[2] = new MyArraysQuestion();

        System.out.println(((Parent)objects[0]).getName());
        System.out.println(((Child)objects[1]).getName());
        System.out.println(((MyArraysQuestion)objects[2]).getName());

    }
    public String getName(){
        return name;
    }

    public static void text1(){
        Parent parent = new Child();

    }
}
class Parent{
    String name = "Parent";
    public String getName(){
        return name;
    }
}
class Child extends Parent{
    String name = "Child";
    public String getName(){
        return name;
    }

}
