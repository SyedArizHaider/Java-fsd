package pck1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map {

	public static void main(String[] args) {
        //  HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple", 1);
        hashMap.put("banana", 2);
        hashMap.put("cherry", 3);
        System.out.println("HashMap: " + hashMap);

        //  LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("apple", 1);
        linkedHashMap.put("banana", 2);
        linkedHashMap.put("cherry", 3);
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("apple", 1);
        treeMap.put("banana", 2);
        treeMap.put("cherry", 3);
        System.out.println("TreeMap: " + treeMap);
    }
}
