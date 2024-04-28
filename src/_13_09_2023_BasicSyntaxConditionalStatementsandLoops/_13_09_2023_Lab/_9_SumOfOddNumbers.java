package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._13_09_2023_Lab;

import java.util.Scanner;

public class _9_SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =Integer.parseInt(scanner.nextLine());
        int count=1 ;
        int sum=0;
        while (count<=n){
            System.out.println(count);
            n++;
            sum+=count;
            count+=2;
        }
        System.out.printf("Sum: %d\n",sum);
    }
}

