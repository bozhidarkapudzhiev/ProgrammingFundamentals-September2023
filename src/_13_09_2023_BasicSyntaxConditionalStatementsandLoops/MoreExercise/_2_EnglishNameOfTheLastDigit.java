package _13_09_2023_BasicSyntaxConditionalStatementsandLoops.MoreExercise;

import java.util.Scanner;

public class _2_EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        returnLastDigitName(n%10);
    }

    public static int returnLastDigitName( int n) {
        String lastNumberName="";
        switch (n) {
            case 0:
                lastNumberName="zero";
                break;
            case 1:
                lastNumberName = "one";
                break;
            case 2:
                lastNumberName = "two";
                break;
            case 3:
                lastNumberName = "three";
                break;
            case 4:
                lastNumberName = "four";
                break;
            case 5:
                lastNumberName = "five";
                break;
            case 6:
                lastNumberName = "six";
                break;
            case 7:
                lastNumberName = "seven";
                break;
            case 8:
                lastNumberName = "eight";
                break;
            case 9:
                lastNumberName = "nine";
                break;
        }
        System.out.println(lastNumberName);
        return n;
    }
}
