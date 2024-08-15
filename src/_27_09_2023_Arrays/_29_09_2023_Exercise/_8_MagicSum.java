package _27_09_2023_Arrays._29_09_2023_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _8_MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrays = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int numbers = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arrays.length ; i++) {
            for (int j = i+1; j < arrays.length; j++) {
                int first=arrays[i];
                int second=arrays[j];
                int sum =first+second;
                if (sum== numbers){
                    System.out.println(first+ " "+second);
                }
            }
        }
    }
}
