package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._13_09_2023_Lab;

import java.util.Scanner;

public class _5_MonthPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        String month="";
        if (n>=1 && n<= 12){
            switch (n){
                case 1:
                    month="January";
                    break;
                case 2:
                    month="February";
                    break;
                case 3:
                    month="March";
                    break;
                case 4:
                    month="April";
                    break;
                case 5:
                    month="May";
                    break;
                case 6:
                    month="June";
                    break;
                case 7:
                    month="July";
                    break;
                case 8:
                    month="August";
                    break;
                case 9:
                    month="September";
                    break;
                case 10:
                    month="October";
                    break;
                case 11:
                    month="November";
                    break;
                case 12:
                    month="December";
                    break;
            }
            System.out.print(month);
        }else {
            System.out.println("Error!");
        }
    }
}
