package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._13_09_2023_Lab;

import java.util.Scanner;

public class _10_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int n=Integer.parseInt(scanner.nextLine());
       for (int i=1;i<=10;i++){
           System.out.printf("%d X %d = %d%n",n,i,(n*i));
       }
    }
}
