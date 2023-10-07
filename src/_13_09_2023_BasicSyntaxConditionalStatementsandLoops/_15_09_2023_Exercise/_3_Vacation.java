package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._15_09_2023_Exercise;

import java.util.Scanner;

public class _3_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfGroup=Integer.parseInt(scanner.nextLine());
        String typeOfGroup=scanner.nextLine();
        String dayOfWeek=scanner.nextLine();
        double price=0.0;
        double discount=0;
        double allSum=0;

        switch (typeOfGroup){
            case "Students":
                if (dayOfWeek.equals("Friday")){
                    price=8.45;
                } else if (dayOfWeek.equals("Saturday")) {
                    price=9.80;
                }else if (dayOfWeek.equals("Sunday")){
                    price=10.46;
                }
                if (numberOfGroup>=30){
                    allSum=numberOfGroup*price;
                    discount=allSum*15/100;
                    allSum=allSum-discount;
                }else {
                        allSum=numberOfGroup*price;
                }
                break;
            case "Business":
                if (dayOfWeek.equals("Friday")){
                    price=10.90;
                } else if (dayOfWeek.equals("Saturday")) {
                    price=15.60;
                } else if (dayOfWeek.equals("Sunday")) {
                    price=16.00;
                }
                if (numberOfGroup>=100){
                    numberOfGroup=numberOfGroup-10;
                    allSum=numberOfGroup*price;
                }else {
                    allSum=numberOfGroup*price;
                }
                break;
            case "Regular":
                if (dayOfWeek.equals("Friday")){
                    price=15.00;
                } else if (dayOfWeek.equals("Saturday")) {
                    price=20.00;
                } else if (dayOfWeek.equals("Sunday")) {
                    price=22.50;
                }if (numberOfGroup>=10&&numberOfGroup<=20){
                    allSum=numberOfGroup*price;
                    allSum=allSum-(allSum*5/100);
            }else {
                    allSum=numberOfGroup*price;
            }
                break;
        }




        System.out.printf("Total price: %.2f",allSum);
    }
}
