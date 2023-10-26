package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._15_09_2023_Exercise;

import java.util.Scanner;

public class _5_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username=scanner.nextLine();
        String password="";
        //1.обръщане на стринг отзад напред и записване в променливата password
        for (int i = 0; i <=username.length()-1; i++) {
            password=username.charAt(i)+password;
        }
        String passScan=scanner.nextLine();
        int count=1;
        while (count<=4) {
            if (passScan.equals(password)) {
                System.out.printf("User %s logged in.", username);
                break;
            } else if (!passScan.equals(password)) {
                if (count == 4) {
                    System.out.printf("User %s blocked!", username);
                    break;
                } else {
                    count++;
                    System.out.println("Incorrect password. Try again.");
                    passScan = scanner.nextLine();
                }
            }
        }
    }
}