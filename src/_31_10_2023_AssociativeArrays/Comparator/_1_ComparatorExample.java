package _31_10_2023_AssociativeArrays.Comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _1_ComparatorExample {
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(5,3,8,1,9,2,4,7,8);
        //Използване на Comparator  за сортиране
        numbers.sort(Comparator.reverseOrder());
        //Отпечатване на резултата
        numbers.forEach(number-> System.out.print(number+" "));
    }
}
