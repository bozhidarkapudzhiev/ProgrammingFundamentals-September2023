package _31_10_2023_AssociativeArrays.Example.TreeMap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class _2_NavigationExample {
    public static void main(String[] args) {
        //1.Създаване на  TreeMap
        TreeMap<String,Integer>treeMap=new TreeMap<>();
        //2.Добавяне на елементи
        treeMap.put("Apple",1);
        treeMap.put("Banana",2);
        treeMap.put("Cherry",3);
        treeMap.put("Date",4);
        treeMap.put("Elderberry",5);
        //3.Първи и последен ключ
        System.out.println("First key: " + treeMap.firstKey());
        System.out.println("Last key: " + treeMap.lastKey());
        //4.Поддръжане на  подкарти
        NavigableMap<String,Integer>headMap=treeMap.headMap("Cherry",true);
        System.out.println("\nHeadMap up to 'Cherry' inclusive: " + headMap);

        NavigableMap<String,Integer>tailMap=treeMap.tailMap("Cherry",true);
        System.out.println("TailMap from 'Cherry' inclusive: " + tailMap);

        NavigableMap<String,Integer>subMap=treeMap.subMap("Banana",true,"Date",true);
        System.out.println("SubMap from 'Banana' to 'Date' inclusive: " + subMap);
    }
}
