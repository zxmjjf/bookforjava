package com.chaptor09.collection.mylist;

/**
 * @author jjf
 * @version 1.0.1  2019-08-13
 * 自定义的链表集合接口
 * 方法：isEmpty(), size(), contains(Object), containsAll(MyListADT);
 *      add(Object), addAll(MyListADT), remove(Object), removeAll(MyListADT);
 *      clear()
 *
 */
public interface MyListADT {
    /**
     * 功能：判断集合是否为空
     * @return booleanValue
     */
    boolean isEmpty();

    /**
     * 功能：返回集合元素的个数
     * @return element's sum
     */
    int size();

    /**
     * 功能：判断集合是否含有指定元素
     * @param element
     * @return
     */
    boolean contains(Object element);

    /**
     * 功能：如果此集合包含参数集合，返回true
     * @param otherList
     * @return
     */
    boolean containsAll(MyListADT otherList);

    /**
     * 功能：删除指定元素
     * @param element
     * @return
     */
    boolean remove(Object element);

    /**
     * 删除所有与otherList集合中存在的元素,删除集合中元素的个数可能多于otherList也可能少于otherList
     * @param otherList
     * @return
     */
    boolean removeAll(MyListADT otherList);

    /**
     * 功能：清空集合的所有元素
     */
    void clear();

    /**
     * 功能：判断此集合与指定集合是否相等
     * @param otherList
     * @return
     */
    boolean equalsElement(MyListADT otherList);

}
