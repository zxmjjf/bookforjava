package com.chaptor09.collection.mylist;

public class MyArrayList<T> implements MyListADT {
    private int capacity;
    T[] arrays;

    MyArrayList(){
        capacity = 0;
        arrays = null;
    }

    MyArrayList(int capacity) {
        arrays = (T[]) new Object[capacity];
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean contains(Object element) {
        return false;
    }

    @Override
    public boolean containsAll(MyListADT otherList) {
        return false;
    }

    @Override
    public boolean remove(Object element) {
        return false;
    }

    @Override
    public boolean removeAll(MyListADT otherList) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean equalsElement(MyListADT otherList) {
        return false;
    }

}
