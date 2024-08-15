package _31_10_2023_AssociativeArrays.Exersice;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class _1_CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split("\\s+");
        LinkedHashMap<String, Integer> charactersCount = new LinkedHashMap<>();
        for (int i = 0; i < text.length; i++) {
            String[] currentEl=text[i].split("");
            for (int j = 0; j <currentEl.length ; j++) {
                String el=currentEl[j];
                if (charactersCount.containsKey(el)){
                    charactersCount.put(currentEl[j],charactersCount.get(el)+1);
                }else {
                    charactersCount.put(el,1);
                }
            }
        }
        for (Map.Entry<String,Integer>entry: charactersCount.entrySet()){
            System.out.printf("%s -> %d\n",entry.getKey(),entry.getValue());
        }
    }
}
