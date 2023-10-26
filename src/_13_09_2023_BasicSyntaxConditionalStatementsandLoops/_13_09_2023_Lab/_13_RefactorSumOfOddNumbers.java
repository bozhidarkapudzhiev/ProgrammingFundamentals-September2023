package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._13_09_2023_Lab;

import java.util.Scanner;

public class _13_RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int add=1;
        int sum=0;
        for (int i=1;i<= n;i++){
            System.out.println(add);
            sum=sum+add;
            add+=2;

        }
        System.out.printf("Sum: %d%n",sum);}
}
