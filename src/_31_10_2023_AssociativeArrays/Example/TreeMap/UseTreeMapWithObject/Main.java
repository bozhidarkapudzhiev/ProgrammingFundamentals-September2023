package _31_10_2023_AssociativeArrays.Example.TreeMap.UseTreeMapWithObject;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //1.Създаване на TreeMap с персонализиран Comparator  за сортиране по възраст
        TreeMap<Person,String>treeMap=new TreeMap<>((p1,p2)->Integer.compare(p1.getAge(), p2.age));
        //Добавяне на елемети
        treeMap.put(new Person("Alice",30),"Engineer");
        treeMap.put(new Person("Bob",25),"Artist");
        treeMap.put(new Person("Charlie",35),"Teacher");
        //Извеждане на елементи
        System.out.println("TreeMap sorted by age:");
        for (Map.Entry<Person,String >entry:treeMap.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }

    }
}
