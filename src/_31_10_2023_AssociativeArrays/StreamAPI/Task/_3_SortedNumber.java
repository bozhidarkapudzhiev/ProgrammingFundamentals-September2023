package _31_10_2023_AssociativeArrays.StreamAPI.Task;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _3_SortedNumber {
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(5,3,8,1,9,2,4,7,6).stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        numbers.forEach(number-> System.out.print(number+" "));
    }
}
