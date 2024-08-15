package _31_10_2023_AssociativeArrays.Example.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class _1_BasicOperationsExample {
    public static void main(String[] args) {
        //1.Създаване на TreeMap
        Map<String, Integer> treeMap = new TreeMap<>();
        //2.Добавяне на елементи
        treeMap.put("Cherry", 3);
        treeMap.put("Banana", 2);
        treeMap.put("Date", 4);
        treeMap.put("Apple", 1);

        //4.Извеждане на елементите в сортиран ред
        System.out.println("Initial TreeMap: ");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        //4.Достъп до определен елемент
        int appleCount = treeMap.get("Apple");
        System.out.println("\nApple count: " + appleCount);

        //5.Премахване на елемент от  TreeMap
        treeMap.remove("Banana");

        //6.Извеждане на елементите след премахване
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        //7.Проверка да картата съдържа определен ключ
        boolean containsCherry = treeMap.containsKey("Cherry");
        System.out.println("\nContains 'Cherry': " + containsCherry);

    }
}
