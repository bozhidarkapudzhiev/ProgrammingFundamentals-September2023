package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._13_09_2023_Lab;

import java.util.Scanner;

public class _6_ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String country=scanner.nextLine();
       switch (country){
           case "USA":
           case "England":
               System.out.println("English");
               break;
           case "Spain":
           case "Argentina":
           case"Mexico":
               System.out.println("Spanish");
               break;
           default:
               System.out.println("unknown");
               break;

       }
    }
}
