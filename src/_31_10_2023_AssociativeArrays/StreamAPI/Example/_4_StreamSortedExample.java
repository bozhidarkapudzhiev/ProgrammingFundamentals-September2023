package _31_10_2023_AssociativeArrays.StreamAPI.Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _4_StreamSortedExample {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("David","Charlie","Alice","Bob","Georgi","An","Peter","Joe","Dragomir","Stoyan");
        List<String>sortedListName=names.stream()
                .filter(name->name.length()>=3&&name.length()<=5)
                .sorted()
                .collect(Collectors.toList());
        //Вариант 1: Отпечатване на имена
         /*for (String name:sortedListName) {
                    System.out.println(name);
                }*/
        //Вариант 2: Отпечатване на имена
        sortedListName.forEach(System.out::println);
    }
}
