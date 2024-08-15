package _31_10_2023_AssociativeArrays.Example.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;



public class _4_LimitedSizeCacheExample {
    public static void main(String[] args) {
        //Създаване на LinkedHashMap  с ограничен размер на кеша
        int cacheSize = 3;
        LinkedHashMap<String, Integer> cache = new LinkedHashMap<String, Integer>
                (cacheSize, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
                return size() > cacheSize;
            }
        };
        //Добавяне на елементи
        cache.put("Apple", 1);
        cache.put("Banana", 2);
        cache.put("Cherry",3);
        //Добавяне на нов елемент ,което води до премахване на  най-стария
        cache.put("Date",4);
        System.out.println("Cache after adding 'Date': ");
        for(Map.Entry<String,Integer>entry: cache.entrySet()){
            System.out.println("\t"+entry.getKey() + " : " + entry.getValue());
        }
        //Достъп до елементите
        cache.get("Banana");
        cache.put("Elderberry",5);
        System.out.println("Cache after accessing 'Banana' and adding 'Elderberry': ");
        for(Map.Entry<String,Integer>entry: cache.entrySet()){
            System.out.println("\t"+entry.getKey() + " : " + entry.getValue());
        }
    }
}
