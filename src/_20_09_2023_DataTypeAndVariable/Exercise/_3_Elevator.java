package _20_09_2023_DataTypeAndVariable.Exercise;

import java.util.Scanner;

public class _3_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people=Integer.parseInt(scanner.nextLine());
        int course=Integer.parseInt(scanner.nextLine());
        int result=(int) Math.ceil((double) people/course);
        System.out.println(result);
    }
}
