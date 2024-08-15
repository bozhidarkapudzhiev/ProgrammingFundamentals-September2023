package _31_10_2023_AssociativeArrays.StreamAPI.Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _1_StreamExample {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Alice","Bob","Charlie","David");
        //Създаване  на поток от списък
        Stream<String>stream=names.stream();
        //Печатане на имената
        stream.forEach(System.out::println);
    }
}
