package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._13_09_2023_Lab;

import java.util.Scanner;

public class _3_PassedOrFailed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double grade=Double.parseDouble(scanner.nextLine());
       if (grade>=3.00){
           System.out.println("Passed!");
       }else {
           System.out.println("Failed!");
       }
    }
}
