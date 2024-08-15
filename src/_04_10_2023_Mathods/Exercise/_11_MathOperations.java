package _04_10_2023_Mathods.Exercise;

import java.util.Scanner;

public class _11_MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        String op = scanner.nextLine();
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.println(mathOperation(num1,op,num2));
    }

    public static int mathOperation(int num1, String operation, int num2) {
        int result = 0;
        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result=num1*num2;
                break;
            case "/":
                result=num1/num2;
                break;
        }
        return result;
    }
}
