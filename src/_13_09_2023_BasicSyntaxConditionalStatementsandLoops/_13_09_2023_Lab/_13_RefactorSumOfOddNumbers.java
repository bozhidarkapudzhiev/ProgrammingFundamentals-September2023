package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._13_09_2023_Lab;

import java.util.Scanner;

public class _13_RefactorSumOfOddNumbers {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=Integer.parseInt(sc.nextLine());
     int sum=0;
     for (int i=1;i<=n;i++){
         System.out.println(i);
         sum=sum+i;
     }
        System.out.printf("Sum: %d%n",sum);
    }
}
