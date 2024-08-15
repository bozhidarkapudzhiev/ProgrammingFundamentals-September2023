package _20_09_2023_DataTypeAndVariable.Exercise;

import java.util.Scanner;

public class _4_SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int sum=0;
        for (int i = 0; i < n; i++) {
            String symbol= scanner.nextLine();
             int ascii= symbol.charAt(0);
             sum+=ascii;

        }
        System.out.println("The sum equals: "+sum);
    }
}
