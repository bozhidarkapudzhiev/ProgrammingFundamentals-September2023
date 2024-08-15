package _31_10_2023_AssociativeArrays.Example.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _5_WordFrequencyExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //this is a text test this is a simple text
        System.out.println("Enter a text: ");
        String text=scanner.nextLine();
        //Създаване на LinkedHashMap  за съхранение на думите  и техния брой
        LinkedHashMap<String,Integer>wordCountMap=new LinkedHashMap<>();
        String [] words=text.split("\\s+");
        //Преброяване на  думите
        for (String word:words){
            wordCountMap.put(word,wordCountMap.getOrDefault(word,0)+1);
        }
        //Итерация и извеждане на  резултите
        for (Map.Entry<String,Integer>entry: wordCountMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
