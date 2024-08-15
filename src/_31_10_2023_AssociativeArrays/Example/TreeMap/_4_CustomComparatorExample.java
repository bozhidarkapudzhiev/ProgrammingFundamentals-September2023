package _31_10_2023_AssociativeArrays.Example.TreeMap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class _4_CustomComparatorExample {
    public static void main(String[] args) {
        //Съзване на TreeMap с персонализиран Comparator за сортиране на дължина на стринговете
        TreeMap<String,Integer>treeMap=new TreeMap<>(Comparator.comparingInt(String::length));
        //Добавяне на елементи
        treeMap.put("Short",1);
        treeMap.put("A very long string",2);
        treeMap.put("Medium",3);
        treeMap.put("LongerString",4);
        //Извеждане на елементите
        for (Map.Entry<String ,Integer>entry: treeMap.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }

    }
}
