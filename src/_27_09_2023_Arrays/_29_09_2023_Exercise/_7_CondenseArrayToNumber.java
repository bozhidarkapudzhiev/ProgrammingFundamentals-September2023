package _27_09_2023_Arrays._29_09_2023_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _7_CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int[] condense = new int[array.length - 1];
        int count=array.length;
        while (count> 1) {
            for (int i = 0; i < array.length - 1; i++) {
                int first = array[i];
                int second = array[i + 1];
                int sum = first + second;
                condense[i] = sum;
            }

            if (condense.length >= 1) {
                array = condense;
                condense = new int[array.length - 1];

            }
            count--;

        }
        System.out.println(array[0]);
    }
}