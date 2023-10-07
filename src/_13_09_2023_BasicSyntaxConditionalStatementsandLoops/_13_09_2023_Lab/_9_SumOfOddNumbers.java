package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._13_09_2023_Lab;

import java.util.Scanner;

public class _9_SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int number=1;
        for (int i = 1; i <=n; i++) {
            sum+=number;
            System.out.println(number);
            number+=2;
        }
        System.out.println("Sum: "+sum);
    }
}

