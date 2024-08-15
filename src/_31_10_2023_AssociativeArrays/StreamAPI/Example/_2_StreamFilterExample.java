package _31_10_2023_AssociativeArrays.StreamAPI.Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _2_StreamFilterExample {
    public static void main(String[] args) {
        //Създаване на списък от низове ,съдържащи имена
        List<String> names= Arrays.asList("Alice","Bob","Charlie","David");
        //Филтриране на списък с имена които започват с 'A'
        List<String>filterNames=names.stream().filter(name-> name.startsWith("A")).collect(Collectors.toList());
        //Отпечатване на имената започващи със символ 'A'
        filterNames.forEach(System.out::println);
        /*System.out.println(filterNames);*/
    }
}
