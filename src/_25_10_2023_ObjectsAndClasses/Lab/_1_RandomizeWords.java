package _25_10_2023_ObjectsAndClasses.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class _1_RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");
        Random random = new Random();
        for (int i=0;i<words.length;i++){
          int randomIndex=random.nextInt(words.length);
          String temp=words[i];
          words[i]=words[randomIndex];
          words[randomIndex]=temp;
        }
        for (String word:words) {
            System.out.println(word);
        }
    }
}

