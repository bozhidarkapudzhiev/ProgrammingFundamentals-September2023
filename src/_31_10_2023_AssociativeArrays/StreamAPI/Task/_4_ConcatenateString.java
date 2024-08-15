package _31_10_2023_AssociativeArrays.StreamAPI.Task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _4_ConcatenateString {
    public static void main(String[] args) {
        List<String> wordList= Arrays.asList("This","is","a","stream","API","example");
        String words=wordList.stream().collect(Collectors.joining(" ")); ;
        System.out.println(words);
    }
}
