package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._13_09_2023_Lab;

import java.util.Scanner;

public class _11_MultiplicationTable_2_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumbers = Integer.parseInt(scanner.nextLine());
        int secondNumbers = Integer.parseInt(scanner.nextLine());
        if (secondNumbers < 10) {
            for (int i = secondNumbers; secondNumbers <= 10; secondNumbers++) {
                System.out.printf("%d X %d = %d%n", firstNumbers, secondNumbers, (firstNumbers * secondNumbers));
            }
        }else {
            System.out.printf("%d X %d = %d%n", firstNumbers, secondNumbers, (firstNumbers * secondNumbers));
        }
    }
}
