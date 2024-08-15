package _31_10_2023_AssociativeArrays.Example.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class _1_LinkedHashMapExample {
    public static void main(String[] args) {
        //1.Създаване на LinkedHashMap
        Map<String,Integer> linkedHashMap=new LinkedHashMap<>();
        //2.Добавяне на елементи
        linkedHashMap.put("one",1);
        linkedHashMap.put("two",2);
        linkedHashMap.put("three",3);
        linkedHashMap.put("four",4);
        //3.Итерация през елементите и извеждане на резултатите
        for (Map.Entry<String,Integer>entry: linkedHashMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        //4.Извеждане на ключовете на инсерция
        System.out.println("Key in insertion order: " + linkedHashMap.keySet());
        //5.Премахване на елемент
        linkedHashMap.remove("two");
        //6.Итерация след премахване на елемент
        for (Map.Entry<String,Integer>entry:linkedHashMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
