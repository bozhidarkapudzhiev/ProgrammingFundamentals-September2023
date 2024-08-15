package _13_09_2023_BasicSyntaxConditionalStatementsandLoops.MoreExercise;

import java.util.Scanner;

public class _4_ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text=scanner.nextLine();
        StringBuilder reverse= new StringBuilder();
        for (int i = text.length()-1; i >=0 ; i--) {
            char symbol=text.charAt(i);
            reverse.append(symbol);
        }
        System.out.println(reverse);

    }
}
