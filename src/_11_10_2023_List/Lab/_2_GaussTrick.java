package _11_10_2023_List.Lab;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _2_GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1 2  3 4 5
        /*1 2 0 3 4 5
                        ->  добавяме изкуствена нула за да стана четен брой в списъка
                        -> само ако  броя на елементите в списъка е нечетен
            1+ 5=6
            2+4=6
            3 +0=3*/
        //Output:6 6 2
        List<Integer> number=Arrays.stream(scanner.nextLine().split(" "))
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());
        List<Integer>result=new ArrayList<>();
        if (number.size()%2!=0){
            int midIdx=number.size()/2;
            number.add(midIdx,0);;
        }
        for (int i = 0; i < number.size()/2; i++) {
            int leftElement=number.get(i);
            int rightElement=number.get(number.size()-i-1);
            result.add(leftElement+rightElement);
        }
        System.out.println(String.join(" ",result.stream()
                .map(e-> String.valueOf(e))
                .toArray(String[]::new)));
    }
}
