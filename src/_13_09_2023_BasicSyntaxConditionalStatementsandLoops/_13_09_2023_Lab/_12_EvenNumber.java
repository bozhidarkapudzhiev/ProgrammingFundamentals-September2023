package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._13_09_2023_Lab;

import java.util.Scanner;

public class _12_EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());
        while (num%2!=0){
            System.out.println("Please write an even number.");
            num= Integer.parseInt(scanner.nextLine());
        }if (num%2==0){
            System.out.printf("The number is: %d\n",Math.abs(num));
        }
        }
    }
