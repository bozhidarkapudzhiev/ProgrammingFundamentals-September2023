package _20_09_2023_DataTypeAndVariable.Lab;

import java.util.Scanner;

public class _6_CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length=3;
        StringBuilder  concatenation=new StringBuilder();
        for (int i = 0; i < length; i++) {
            String symbol=scanner.nextLine();
            concatenation.append(symbol);
        }
        System.out.println(concatenation);

    }
}
