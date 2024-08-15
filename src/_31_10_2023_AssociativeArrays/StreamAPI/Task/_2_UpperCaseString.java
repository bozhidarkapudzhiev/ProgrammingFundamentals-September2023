package _31_10_2023_AssociativeArrays.StreamAPI.Task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _2_UpperCaseString {
    public static void main(String[] args) {
        List<String> word= Arrays.asList("hello","word","java","stream","api").stream()
                .map(String::toUpperCase).collect(Collectors.toList());
        /*List<String>wordsToUpperCase=word.stream().map(String::toUpperCase).collect(Collectors.toList());*/
        word.forEach(words->System.out.print(words+" "));
    }
}
