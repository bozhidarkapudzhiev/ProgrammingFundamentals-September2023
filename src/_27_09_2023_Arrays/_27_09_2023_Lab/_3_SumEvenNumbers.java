package _27_09_2023_Arrays._27_09_2023_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _3_SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[]numbers=Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int event=0;
        for (int i=0;i<numbers.length;i++){

            if (numbers[i]%2==0){
                event+=numbers[i];
            }
        }
        System.out.println(event);
    }

}