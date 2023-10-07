package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._13_09_2023_Lab;

import java.util.Scanner;

public class _10_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        for (int i=n;i<=10;i++){
            for (int j = 1; j <=10; j++) {
                System.out.printf("%d X %d = %d%n",i,j,(i*j));
            }
            break;
        }
    }
}
