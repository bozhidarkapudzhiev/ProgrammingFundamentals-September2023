package _20_09_2023_DataTypeAndVariable.Lab;

import java.util.Scanner;
public class _10_SpecialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int sumOfDigits = sumDigits(i);

            if (sumOfDigits == 5 || sumOfDigits == 7 || sumOfDigits == 11) {
                System.out.println(i + " -> True");
            } else {
                System.out.println(i + " -> False");
            }
        }
    }

    private static int sumDigits(int number) {
        int sum = 0;

        while (number > 0) {
            sum += number % 10; // Add the last digit of the number to sum
            number /= 10; // Remove the last digit from the number
        }

        return sum;
    }
}