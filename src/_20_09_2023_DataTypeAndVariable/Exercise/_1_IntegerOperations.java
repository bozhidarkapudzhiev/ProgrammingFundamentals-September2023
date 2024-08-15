package _20_09_2023_DataTypeAndVariable.Exercise;

import java.util.Scanner;

public class _1_IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first=Integer.parseInt(scanner.nextLine());
        int second=Integer.parseInt(scanner.nextLine());
        int three=Integer.parseInt(scanner.nextLine());
        int four=Integer.parseInt(scanner.nextLine());
        first+=second;
        first/=three;
        first*=four;
        System.out.println(first);


    }
}
