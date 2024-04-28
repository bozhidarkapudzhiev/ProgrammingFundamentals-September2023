package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._13_09_2023_Lab;

import java.util.Scanner;

public class _6_ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country=scanner.nextLine();
        String speakLanguage="";
        switch (country){
            case "England":
            case "USA":
                speakLanguage="English";
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                speakLanguage="Spanish";
                break;
            default:
                speakLanguage="unknown";
        }
        System.out.println(speakLanguage);
   }
}
