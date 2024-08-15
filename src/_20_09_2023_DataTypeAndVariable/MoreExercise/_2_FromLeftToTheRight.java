package _20_09_2023_DataTypeAndVariable.MoreExercise;

import java.util.Scanner;

public class _2_FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] numbers = input.split(" ");
            long leftNumber = Long.parseLong(numbers[0]);
            long rightNumber = Long.parseLong(numbers[1]);

            if (leftNumber > rightNumber) {
                System.out.println(sumOfDigits(Math.abs(leftNumber)));
            } else {
                System.out.println(sumOfDigits(Math.abs(rightNumber)));
            }
        }
    }

    private static int sumOfDigits(long number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}