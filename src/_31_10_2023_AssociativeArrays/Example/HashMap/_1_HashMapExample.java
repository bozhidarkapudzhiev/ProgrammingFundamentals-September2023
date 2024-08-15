package _31_10_2023_AssociativeArrays.Example.HashMap;

import java.util.HashMap;
import java.util.Map;

public class _1_HashMapExample {
    public static void main(String[] args) {
        Map<String,Integer> hashMap=new HashMap<>();
        hashMap.put("one",1);
        hashMap.put("two",2);
        hashMap.put("three",3);
        int result=hashMap.get("two");
        System.out.println(result);

    }
}
