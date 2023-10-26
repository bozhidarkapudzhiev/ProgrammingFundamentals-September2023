package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._13_09_2023_Lab;

import java.util.Scanner;

public class _7__TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String days = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int ticket = 0;
        switch (days){
            case "Weekday":
                if (age>=0&&age<=18){
                    ticket=12;
                } else if (age>18 &&age<=64) {
                    ticket=18;
                }else if (age>64 && age<=122){
                    ticket=12;
                }
                break;
            case "Weekend":
                if (age>=0 && age<=18) {
                    ticket = 15;
                }else if (age>18 && age<=64){
                    ticket=20;
                }else if (age>64 && age<=122){
                    ticket=15;
                }
                break;
            case "Holiday":
                if (age>=0 && age<=18){
                    ticket=5;
                }else if(age>18 && age<=64){
                    ticket=12;
                }else if (age>64 && age<=122){
                    ticket=10;
                }
                break;
        }
        if (age>=0&& age<=122){
            System.out.printf("%d$",ticket);
        }else {
            System.out.println("Error!");
        }
    }
}
