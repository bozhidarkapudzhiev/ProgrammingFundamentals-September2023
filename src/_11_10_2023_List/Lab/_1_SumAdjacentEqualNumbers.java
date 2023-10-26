package _11_10_2023_List.Lab;

import java.text.DecimalFormat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _1_SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double>numbers= new ArrayList<>(Arrays.stream(scanner.nextLine().split(" "))
                .map(e -> Double.parseDouble(e))
                .collect(Collectors.toList()));
        //Input :
        /* 3 3 6 1
        * 8 2 2 4 8 16
        * 5 4 2 1 1 4
        * 0.1 0.1 5 -5
        * */
        for (int i = 0; i < numbers.size()-1; i++) {
            double currentElement=numbers.get(i);
            double rightElement=numbers.get(i+1);
            if (currentElement==rightElement){
                double newElement=currentElement+rightElement;
               numbers.remove(i+1);
                numbers.set(i,newElement);
                i=-1;
            }
        }
        for (double num :numbers) {
            System.out.print(new DecimalFormat("0.###").format(num)+" ");
        }
        System.out.println();
    }
}
