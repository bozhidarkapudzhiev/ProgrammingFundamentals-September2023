package _31_10_2023_AssociativeArrays.StreamAPI.Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _3_StreamMapExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<String> upperCaseNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        upperCaseNames.forEach(System.out::println);
    }
}
