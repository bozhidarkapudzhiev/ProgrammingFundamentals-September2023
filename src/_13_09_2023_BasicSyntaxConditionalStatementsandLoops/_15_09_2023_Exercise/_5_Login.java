package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._15_09_2023_Exercise;

import java.util.Scanner;

public class _5_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = "";
        for (int i = 0; i <= username.length() - 1; i++) {
            password = username.charAt(i) + password;
        }
        String encodingPass = scanner.nextLine();
        int count=0;
        while (!encodingPass.equals(password)){
            count++;
            if (count==4) {
                System.out.printf("User %s blocked!", username);
                break;
            }

            System.out.println("Incorrect password. Try again.");
            encodingPass=scanner.nextLine();

        }if (encodingPass.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}