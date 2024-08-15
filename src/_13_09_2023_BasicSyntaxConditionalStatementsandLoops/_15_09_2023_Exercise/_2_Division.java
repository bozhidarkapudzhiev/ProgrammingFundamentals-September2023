package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._15_09_2023_Exercise;

import java.util.Scanner;

public class _2_Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String text = "The number is divisible by ";

        /*divisible : 2, 3, 6, 7, 10.*/
        if (number % 10 == 0) {
            System.out.println(text + 10);
        } else if (number % 7 == 0) {
            System.out.println(text + 7);
        } else if (number % 6 == 0) {
            System.out.println(text + 6);
        } else if (number % 3 == 0) {
            System.out.println(text + 3);
        } else if (number % 2 == 0) {
            System.out.println(text + 2);
        }else {
            System.out.println("Not divisible");
        }
    }
}
