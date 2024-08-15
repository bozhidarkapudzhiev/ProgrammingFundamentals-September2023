package _31_10_2023_AssociativeArrays.Example.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class _2_BasicOperationExample {
    public static void main(String[] args) {
        //Създаване на LinkedHashMap
        Map<String,Integer> linkedHashMap=new LinkedHashMap<>();
        //Добавяне на елементи
        linkedHashMap.put("Apple",1);
        linkedHashMap.put("Banana",2);
        linkedHashMap.put("Chery",3);
        linkedHashMap.put("Date",4);
        //Извеждане  на елементи в реда на вмъкване
        System.out.println("Initial LinkedHashMap:");
        for (Map.Entry<String,Integer>entry: linkedHashMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        //Премахване на елемент
        linkedHashMap.remove("Banana");
        //Извеждане на елементи след премахване
        System.out.println("\nLinkedHashMap after removing 'Banana':");

        for (Map.Entry<String,Integer>entry:linkedHashMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        //Проверка дали в картата се съдържа определен ключ
        boolean containsCherry=linkedHashMap.containsKey("Cherry");
        System.out.println("\nContains 'Cherry': "+containsCherry);
    }
}
