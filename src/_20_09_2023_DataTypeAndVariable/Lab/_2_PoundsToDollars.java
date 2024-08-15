package _20_09_2023_DataTypeAndVariable.Lab;

import java.util.Scanner;

public class _2_PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double britishPound=Double.parseDouble(scanner.nextLine());
        double dollars=britishPound*1.36;
        System.out.printf("%.3f",dollars);
    }
}
