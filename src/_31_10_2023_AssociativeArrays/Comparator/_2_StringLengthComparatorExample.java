package _31_10_2023_AssociativeArrays.Comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _2_StringLengthComparatorExample {
    public static void main(String[] args) {
        List<String>words= Arrays.asList("apple","banana","pear","kiwi","orange");
        //Сортиране по дължина ма низа (възходящ ред) и азбучен ред
        words.sort(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));

        //Отпечатване на резултата
        words.forEach(word-> System.out.print(word+" "));
    }
}
