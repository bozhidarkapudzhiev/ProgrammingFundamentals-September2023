package _04_10_2023_Mathods.Task;

import java.util.Scanner;

public class _4_PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        boolean isLengthValid= isLength(line);
        boolean hasOnlyLetterAndDigit=hasOnlyLetterAndDigit(line);
        boolean hasTwoDigit= hasAtLeastTwoDigits(line);

        if (isLengthValid&&hasOnlyLetterAndDigit&&hasTwoDigit){
            System.out.println("Password is valid");
        }
    }

    public static boolean isLength(String line) {
        if (line.length() >= 6 && line.length() <= 10) {
            return true;
        } else {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
    }

    public static boolean hasAtLeastTwoDigits(String line) {
        int count = 0;
        for (char c : line.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }

        }
        if (count >= 2) {
            return true;
        } else {
            System.out.println("Password must have at least 2 digits");
            return false;
        }
    }
            public static boolean hasOnlyLetterAndDigit (String line){
                for (char c : line.toCharArray()) {
                    if (!Character.isLetterOrDigit(c)) {
                        System.out.println("Password must consist only of letters and digits");
                        return false;
                    }
                }
                return true;
            }
        }

