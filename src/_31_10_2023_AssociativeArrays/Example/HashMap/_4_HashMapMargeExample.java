package _31_10_2023_AssociativeArrays.Example.HashMap;

import java.util.HashMap;
import java.util.Map;

public class _4_HashMapMargeExample {
    public static void main(String[] args) {
        //Създаване на  HashMap
        Map<String,Integer>hashMap=new HashMap<>();
        //Добавяне на елементи
        hashMap.put("a",1);
        hashMap.put("b",2);
        //Сливане на стойности
        hashMap.merge("a",3,Integer::sum);
        hashMap.merge("c",4,Integer::sum);
        //Итерация и извеждане на елементи
        for (Map.Entry<String,Integer>entry: hashMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
