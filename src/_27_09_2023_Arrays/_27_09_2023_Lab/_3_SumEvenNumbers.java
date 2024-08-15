package _27_09_2023_Arrays._27_09_2023_Lab;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class _3_SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(value -> Integer.parseInt(value)).toArray();

        int sum = 0;
        for (int i = 0; i < firstArr.length; i++) {
            int element=firstArr[i];
            if (element%2==0){
                sum+=element;
            }
        }
        System.out.println(sum);
    }

}