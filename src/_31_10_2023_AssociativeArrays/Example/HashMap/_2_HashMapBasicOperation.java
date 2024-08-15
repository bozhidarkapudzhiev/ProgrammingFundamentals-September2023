package _31_10_2023_AssociativeArrays.Example.HashMap;

import java.util.HashMap;
import java.util.Map;

public class _2_HashMapBasicOperation {
    public static void main(String[] args) {
        //Създаване  на HashMap
        Map<String,Integer>hashMap=new HashMap<>();
        //Добавяне на елементи
        hashMap.put("one",1);
        hashMap.put("two",2);
        hashMap.put("three",3);
        //Извличане на стойност по ключ
        Integer value=hashMap.get("two");
        System.out.println("Value for key 'two' : " + value);//Извежда : Value for key 'two': 2
        //Проверка дали съществува ключ
        boolean hasKey=hashMap.containsKey("one");
        System.out.println("Contains key 'one' : " + hasKey);//Извежда: Contains key 'one' : true
        //Премахване на елемент по ключ
        hashMap.remove("three");
        //Итерация през всички  ключове и стойности
        for (Map.Entry<String,Integer>entry: hashMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
