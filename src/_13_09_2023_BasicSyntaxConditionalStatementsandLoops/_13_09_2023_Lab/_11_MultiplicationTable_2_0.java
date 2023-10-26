package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._13_09_2023_Lab;

import java.util.Scanner;

public class _11_MultiplicationTable_2_0 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int first=Integer.parseInt(scanner.nextLine());
        int second=Integer.parseInt(scanner.nextLine());
       if (second<=10){
           for (int i = second; i <=10; i++) {
               System.out.printf("%d X %d = %d%n",first,i,(first*i));
           }
       }else {
           System.out.printf("%d X %d = %d%n",first,second,(first*second));
       }

    }
}
