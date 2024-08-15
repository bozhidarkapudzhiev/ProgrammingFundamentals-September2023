package _20_09_2023_DataTypeAndVariable.MoreExercise;

import java.util.Scanner;

public class _1_DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            if (isBoolean(input)) {
                System.out.printf("%s is boolean type\n", input);
            } else if (isInteger(input)) {
                System.out.printf("%s is integer type\n", input);
            } else if (isDouble(input)) {
                System.out.printf("%s is floating point type\n", input);
            } else if (input.length() == 1) {
                System.out.printf("%s is character type\n", input);
            } else {
                System.out.printf("%s is string type\n", input);
            }
            input = scanner.nextLine();
        }
    }

    private static boolean isBoolean(String str) {
        return str.equalsIgnoreCase("true") ||
                str.equalsIgnoreCase("false");
    }

    private static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
