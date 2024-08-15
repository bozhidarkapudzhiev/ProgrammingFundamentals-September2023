package _27_09_2023_Arrays._27_09_2023_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _5_EvenAndOddSubtraction{
    public static void main(String[] args) {;
        Scanner scanner = new Scanner(System.in);
        int [] firstArr=Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(value -> Integer.parseInt(value)).toArray();

        int sumEven=0;
        int sumOdd=0;
        for (int i = 0; i < firstArr.length; i++) {
            int currentEl=firstArr[i];
            if (currentEl%2==0){
                sumEven+=currentEl;
            }else {
                sumOdd+=currentEl;
            }

        }
        System.out.println(sumEven-sumOdd);
    }
}
