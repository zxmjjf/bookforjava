package collectionAPI.API_7_TreeMap;

import java.util.*;

public class TreeMapOfMethodTest {
    static TreeMap<Integer, String> map = new TreeMap<>();
    static HashMap<Integer, String> map1 = new HashMap<>();

    public static void main(String[] args) {
        Random random = new Random();
        int base;
        for (int i = 0; i < 20; ++i) {
            base = random.nextInt(250);
            map.put(base, "jjf" + base);
            map1.put(base, "zxm" + base);
        }

        System.out.println(map);
        System.out.println(map1);

        System.out.println(map.get(1));

        Map.Entry<Integer, String> entry = new Map.Entry<Integer, String>() {
            int key = 22;
            String value = "jjf22";
            @Override
            public Integer getKey() {
                return key;
            }

            @Override
            public String getValue() {
                return value;
            }

            @Override
            public String setValue(String value) {
                this.value = value;
                return this.value;
            }
        };

        System.out.println(entry);

        /** forEach() */
        map.forEach((key, value) -> System.out.println(key + "->" + value));

    }
}
