package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._13_09_2023_Lab;

import java.util.Scanner;

public class _9_SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int num=1;
        int sum=0;
        for (int i = 0; i <n ; i++){
            System.out.println(num);
            sum+=num;
            num+=2;
        }
        System.out.printf("Sum: %d",sum);
         }
}

