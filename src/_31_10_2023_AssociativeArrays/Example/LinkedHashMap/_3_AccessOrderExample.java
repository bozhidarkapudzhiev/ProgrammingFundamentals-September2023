package _31_10_2023_AssociativeArrays.Example.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class _3_AccessOrderExample {
    public static void main(String[] args) {
        //1.Създаване на LinkedHashMap с режим на достъп
        Map<String,Integer> linkedHashMap=new LinkedHashMap<>(16,0.75f,true);
        //2.Добавяне на елементи
        linkedHashMap.put("Apple",1);
        linkedHashMap.put("Banana",2);
        linkedHashMap.put("Cherry",3);
        linkedHashMap.put("Date",4);

        //Достъп до някои елементи
        linkedHashMap.get("Apple");
        linkedHashMap.get("Cherry");

        //Итерация и извеждане на елементите в режим на достъп
        for (Map.Entry<String,Integer>entry: linkedHashMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
