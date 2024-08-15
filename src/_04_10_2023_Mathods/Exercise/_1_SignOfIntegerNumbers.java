package _04_10_2023_Mathods.Exercise;

import java.util.Scanner;

public class _1_SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        singOfInteger(n);
    }

    public static void singOfInteger(int number) {
        if (number > 0) {
            System.out.printf("The number %d is positive.\n", number);
        } else if (number < 0) {
            System.out.printf("The number %d is negative.\n", number);
        } else {
            System.out.printf("The number %d is zero.\n", number);
        }

    }
}
