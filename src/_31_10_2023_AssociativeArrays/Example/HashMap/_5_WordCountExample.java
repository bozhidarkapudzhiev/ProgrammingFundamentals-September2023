package _31_10_2023_AssociativeArrays.Example.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _5_WordCountExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       //Инициализация на текст
        //"this is a test this is only test"
        String text=scanner.nextLine();
       //Създаване на HashMap за съхранение на думите и техния брой
        Map<String,Integer> wordHashMapCount=new HashMap<>();
        //Разделяне на текста на думи
        String[] words=text.split("\\s+");
        //Преброяване на думите
        for(String word:words){
         wordHashMapCount.put(word,wordHashMapCount.getOrDefault(word,0)+1);
            /**
             * if (wordCountMap.containsKey(word)) {
             *     // Ако думата съществува в картата, увеличаваме броя ѝ с 1
             *     wordCountMap.put(word, wordCountMap.get(word) + 1);
             * } else {
             *     // Ако думата не съществува в картата, я добавяме със стойност 1
             *     wordCountMap.put(word, 1);
             * }
             */
        }
        //Итерация и извеждане на резултите
        for (Map.Entry<String,Integer>entry: wordHashMapCount.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
