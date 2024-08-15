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
        List<Double>list=Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble).collect(Collectors.toList());
        equalsNumbers(list);
    }
    public static  double equalsNumbers(List<Double>list){
        //3 3 6 1	12 1	3 3 6 1  6 6 1  12 1
        for (int i=1;i<list.size(); i++){
            double current=list.get(i);
            double previous=list.get(i-1);
            if (current==previous){
                list.remove(previous);
               double condense=list.set(i-1,current+previous);
                i-=1;
            }
        }
        return list.size();

    }
}
