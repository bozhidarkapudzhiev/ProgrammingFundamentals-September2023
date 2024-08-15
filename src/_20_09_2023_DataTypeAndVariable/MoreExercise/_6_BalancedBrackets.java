package _20_09_2023_DataTypeAndVariable.MoreExercise;

import java.util.Scanner;

public class _6_BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();
        String parentheses = "";
        StringBuilder builder = new StringBuilder();

        /*You must print "BALANCED" if the parentheses are balanced and "UNBALANCED" otherwise.*/
        while (length > 1) {
            if (line.equals("(")) {
                builder.append(line);
                line = scanner.nextLine();
                length--;
                while (!line.equals(")")) {
                    ;
                    builder.append(line);
                    line = scanner.nextLine();
                    parentheses = "BALANCED";

                }
            }/*else{
                parentheses = "UNBALANCED";*/
            length--;
            line = scanner.nextLine();


        }
        System.out.println(parentheses);
    }
}