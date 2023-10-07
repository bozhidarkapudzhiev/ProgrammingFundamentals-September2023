package _20_09_2023_DataTypeAndVariable.Lab;

import java.util.Scanner;

public class _8_LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbol = scanner.next().charAt(0);
             if (symbol >= 'A' && symbol <= 'Z')
                System.out.println("upper-case");

            else if (symbol >= 'a' && symbol <= 'z')
                System.out.println("lower-case");
    }
}