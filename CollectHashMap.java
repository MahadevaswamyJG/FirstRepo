package OO_Demo;

import java.util.HashMap;
import java.util.TreeMap;;

public class CollectHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
        TreeMap<Integer,Integer> treemap = new TreeMap<>();
        treemap.put(1,100);
        treemap.put(3, 200);
        treemap.put(2, 300);

        hashmap.put("a",100);
        hashmap.put("b", 200);
        hashmap.put("c", 300);
        System.out.println(hashmap);
        System.out.println(treemap);
        System.out.println(hashmap.size());
    }
}
