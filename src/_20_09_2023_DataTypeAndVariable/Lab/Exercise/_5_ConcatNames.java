package _20_09_2023_DataTypeAndVariable.Lab.Exercise;

import java.util.Scanner;

public class _5_ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName=scanner.nextLine();
        String lastName=scanner.nextLine();
        String concat=scanner.nextLine();
        System.out.printf("%s%s%s",firstName,concat,lastName);
    }
}
