package _31_10_2023_AssociativeArrays.Example.HashMap;

import java.util.HashMap;
import java.util.Map;

public class _3_HashMapWorkWithNullValuesAndKeys {
    public static void main(String[] args) {
        Map<String,Integer> hashMap=new HashMap<>();
        //Добавяне на null ключ и null стойност
        hashMap.put(null,100);
        hashMap.put("nullValue",null);
        //Извличане на стойност по null ключ
        Integer nullKeyValue=hashMap.get(null);
        System.out.println("Value for null key: " + nullKeyValue);
        //Извежда : Value for null key: 100
        //Извличане на стойност по null стойност
        Integer nullValue=hashMap.get("nullValue");
        System.out.println("Value for key 'nullValue': " + nullValue);// Извежда: Value for key 'nullValue' : null
    }
}
