package _31_10_2023_AssociativeArrays.Example.TreeMap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class _3_CustomComparatorExample {
    public static void main(String[] args) {
        //1.Създаване на TreeMap  с персонализиран Comparator
        TreeMap<String,Integer>treeMap=new TreeMap<>(Comparator.reverseOrder());
        //2.Добавяне на елементи
        treeMap.put("Apple",1);
        treeMap.put("Banana",2);
        treeMap.put("Chery",3);
        treeMap.put("Date",4);
        //3.Извеждане на елементите в сортиран ред по обратен ред
        System.out.println("TreeMap with custom comparator: ");
        for (Map.Entry<String,Integer>entry: treeMap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
