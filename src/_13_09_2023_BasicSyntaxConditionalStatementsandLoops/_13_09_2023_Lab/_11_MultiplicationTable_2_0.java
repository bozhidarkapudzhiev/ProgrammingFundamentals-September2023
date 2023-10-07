package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._13_09_2023_Lab;

import java.util.Scanner;

public class _11_MultiplicationTable_2_0 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int first=Integer.parseInt(scanner.nextLine());
        int second=Integer.parseInt(scanner.nextLine());
        if (second<10){
            for (int i=first;i<=10;i++){
                for (int j=second;j<=10;j++){
                    System.out.printf("%d X %d = %d%n",i,j,(i*j));
                }
                break;

            }
        }else {
            System.out.printf("%d X %d = %d%n",first,second,(first*second));
        }
    }
}
