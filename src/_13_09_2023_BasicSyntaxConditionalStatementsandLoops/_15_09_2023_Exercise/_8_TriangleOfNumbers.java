package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._15_09_2023_Exercise;

import java.util.Scanner;

public class _8_TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int n=Integer.parseInt(scanner.nextLine());
       for (int i=1;i<=n;i++){
           for (int j=1;j<=i;j++){
               System.out.print(i+" ");
           }
           System.out.println();
       }
    }
}
