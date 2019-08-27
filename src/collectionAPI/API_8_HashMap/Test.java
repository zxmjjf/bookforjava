package collectionAPI.API_8_HashMap;

import com.chaptor04.selfprocedure.Sort;

import java.util.*;

/**
 * HashMap 与 LinkedHashMap 的区别
 */
public class Test {
    public static void main(String[] args) {
        test3();
    }

    /**
     * 测试：HashMap 与 LinkedHashMap 的区别
     */
    private static void test1(){
        HashMap<String, Integer> hashMap = new HashMap<>();
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);

        hashMap.put("144-25-5464", 22);
        hashMap.put("567-24-2546", 19);
        hashMap.put("157-62-7935", 55);
        hashMap.put("456-62-5527", 43);

        linkedHashMap.put("144-25-5464", 22);
        linkedHashMap.put("567-24-2546", 19);
        linkedHashMap.put("157-62-7935", 55);
        linkedHashMap.put("456-62-5527", 43);
        //linkedHashMap.put("144-25-5464", 22);
        //linkedHashMap.put("144-25-5464", 25);

        System.out.println(linkedHashMap.get("144-25-5464"));

        Iterator iterator = hashMap.keySet().iterator();
        Iterator iterator1 = linkedHashMap.keySet().iterator();

        System.out.println(hashMap);
        System.out.println(linkedHashMap);

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + "       " + iterator1.next());
        }

        iterator1 = linkedHashMap.keySet().iterator();
        for (int i = 0; i < 2; ++i) {
            System.out.println(iterator1.next());
        }
        System.out.println(linkedHashMap);
    }

    /**
     * 测试： HashMap 与 WeakHashMap 的区别
     */
    private static void test2(){
        HashMap<MyClass, Integer> hashMap  = new HashMap<>();
        WeakHashMap<MyClass, Integer> weakHashMap = new WeakHashMap<>();

        /** 添加映射，键的引用丢失  */
        hashMap.put(new MyClass(01), 81);
        hashMap.put(new MyClass(02), 82);
        hashMap.put(new MyClass(03), 83);
        hashMap.put(new MyClass(04), 84);
        weakHashMap.put(new MyClass(01), 81);
        weakHashMap.put(new MyClass(02), 82);
        weakHashMap.put(new MyClass(03), 83);
        weakHashMap.put(new MyClass(04), 84);

        WeakHashMap<String, Integer> hashMap1 = new WeakHashMap<>();
        HashMap<String , Integer> hashMap2 = new HashMap<>();
        hashMap1.put(new String("jjf"), 1);
        hashMap1.put(new String("jjf1"), 2);
        String string = new String("jjf2");
        hashMap1.put(string, 3);

        hashMap1.put("jjf3", 4);
        hashMap1.put(new String("jjf4"), 2);


        hashMap2.put(new String("jjf"), 1);
        hashMap2.put(new String("jjf1"), 2);
        hashMap2.put("jjf2", 3);
        hashMap2.put("jjf3", 4);
        hashMap2.put(new String("jjf4"), 2);

        System.out.println(hashMap1);
        System.out.println(hashMap2);
        System.gc();
        System.out.println(hashMap1);
        System.out.println(hashMap2);

    }


    /**
     * 测试：子视图和主视图的关联性
     */
    private static void test3(){
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        Random random = new Random(100);
        for (int i = 0; i < 30; ++i) {
            int base = random.nextInt(100);
            treeMap.put(base, "jjf" + base);
        }
        System.out.println(treeMap);

        SortedMap<Integer, String> stringSortedMap = treeMap.subMap(30, 60);
        System.out.println(stringSortedMap);

        stringSortedMap.remove(31);
        System.out.println(treeMap);

        /*TreeMap treeMap1 = treeMap;
        treeMap1.put("jjf", "jjf呀");
        System.out.println(treeMap1);*/

        Map map = Collections.checkedMap(treeMap, Integer.class, String.class);
        map.put(6, "jjf呀");
        System.out.println(map);

    }

}

class MyClass{
    int num;

    MyClass(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return num + "";
    }
}
