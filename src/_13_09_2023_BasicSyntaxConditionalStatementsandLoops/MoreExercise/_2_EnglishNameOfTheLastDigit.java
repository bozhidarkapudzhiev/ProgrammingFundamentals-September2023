package _13_09_2023_BasicSyntaxConditionalStatementsandLoops.MoreExercise;

import java.util.Scanner;

public class _2_EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        int lastDigit=number%10;
        String nameOfLastNumber="";
        switch (lastDigit){
            case 1:
                nameOfLastNumber="one";
                break;
            case 2:
                nameOfLastNumber="two";
                break;
            case 3:
                nameOfLastNumber="three";
                break;
            case 4:
                nameOfLastNumber="four";
                break;
            case 5:
                nameOfLastNumber="five";
                break;
            case 6:
                nameOfLastNumber="six";
                break;
            case 7:
                nameOfLastNumber="seven";
                break;
            case 8:
                nameOfLastNumber="even";
                break;
            case 9:
                nameOfLastNumber="nine";
                break;
        }
        System.out.println(nameOfLastNumber);
    }
}
