package ss12_java_collection_framework.thuc_hanh.su_dung_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {


        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("Luật", 19);
        stringIntegerMap.put("min", 99);
        stringIntegerMap.put("pi", 15);
        stringIntegerMap.put("tien", 11);
        System.out.println("Display entries in HashMap");
        System.out.println(stringIntegerMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>();
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        treeMap.put("abcde ", 100);
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));

    }
}