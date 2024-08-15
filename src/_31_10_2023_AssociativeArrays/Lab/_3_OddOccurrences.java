package _31_10_2023_AssociativeArrays.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class _3_OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = Arrays.stream(scanner.nextLine().split("\\s"))
                .map(String::toLowerCase)
                .toArray(String[]::new);
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (linkedHashMap.containsKey(word)) {
                linkedHashMap.put(word, linkedHashMap.getOrDefault(word, 0) + 1);
            } else {
                linkedHashMap.put(word, 1);
            }
        }
        LinkedHashMap<String, Integer> filterMap=linkedHashMap.entrySet()
                .stream()
                .filter(entry ->entry.getValue()%2!=0)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,(e1,e2) ->e1,LinkedHashMap::new
                ));
        List<String> oddOccurrences = filterMap.keySet()
                .stream()
                .collect(Collectors.toList());
        System.out.println(String.join(", ", oddOccurrences));
    }
}
