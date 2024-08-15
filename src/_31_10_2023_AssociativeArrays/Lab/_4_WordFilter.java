package _31_10_2023_AssociativeArrays.Lab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _4_WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(word -> word.length() % 2 == 0).collect(Collectors.toList());
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }


    }
}
