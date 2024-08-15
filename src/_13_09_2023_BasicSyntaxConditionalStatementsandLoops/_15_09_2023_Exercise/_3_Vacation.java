package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._15_09_2023_Exercise;

import java.util.Scanner;

public class _3_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersOfGroup=Integer.parseInt(scanner.nextLine());
        String group = scanner.nextLine();
        String day = scanner.nextLine();
        double price=0.0;
        double totalPrice=0.0;
        switch (group) {
            case "Students":
                if (day.equals("Friday")){
                    price=8.45;
                } else if (day.equals("Saturday")) {
                    price=9.80;
                }else if (day.equals("Sunday")){
                    price=10.46;
                }
                if (numbersOfGroup>=30){
                    totalPrice=(price*numbersOfGroup);
                    totalPrice=totalPrice-(totalPrice*0.15);
                }else {
                    totalPrice=price*numbersOfGroup;
                }
                break;
            case "Business":
                if (day.equals("Friday")){
                    price=10.90;
                } else if (day.equals("Saturday")) {
                    price=15.60;
                } else if (day.equals("Sunday")) {
                    price=16.00;
                }
                if (numbersOfGroup>=100){
                    numbersOfGroup=numbersOfGroup-10;
                }
                totalPrice=price*numbersOfGroup;
                break;
            case "Regular":
                if (day.equals("Friday")){
                    price=15.00;
                }else if (day.equals("Saturday")){
                    price=20.00;
                } else if (day.equals("Sunday")) {
                    price=22.50;
                }
                if (numbersOfGroup>10 && numbersOfGroup<20){
                    totalPrice=price*numbersOfGroup;
                    totalPrice=totalPrice-(totalPrice*0.05);
                }else {
                    totalPrice = price * numbersOfGroup;
                }
                break;
        }

        System.out.printf("Total price: %.2f\n",totalPrice);
    }
}
