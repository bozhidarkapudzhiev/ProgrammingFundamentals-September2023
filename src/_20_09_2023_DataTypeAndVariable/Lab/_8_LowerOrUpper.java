package _20_09_2023_DataTypeAndVariable.Lab;

import java.util.Scanner;

public class _8_LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbol = scanner.nextLine().charAt(0);

        int ascii = (int) symbol;
        if (ascii < 97) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }
    }
}