package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._15_09_2023_Exercise;

import java.util.Scanner;

public class _10_PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget=Double.parseDouble(scanner.nextLine());
        int students=Integer.parseInt(scanner.nextLine());
        double priceLightsabers=Double.parseDouble(scanner.nextLine());
        double priceRobes=Double.parseDouble(scanner.nextLine());
        double priceOfBelts=Double.parseDouble(scanner.nextLine());
        priceLightsabers=(priceLightsabers+(priceLightsabers*10/100));
        int freeBelts=0;
        for (int i =1;i<=students;i++){
            if (i%6==0){
                freeBelts+=1;
            }
        }
        priceLightsabers*=students;
        priceRobes*=students;
        priceOfBelts*=students;
        priceOfBelts=priceOfBelts-freeBelts;
        double allPrice=Math.ceil(priceLightsabers+priceRobes+priceOfBelts);
        if (budget>=allPrice){
            System.out.printf("The money is enough - it would cost %.2flv.",allPrice);
        }else {
            budget=budget-allPrice;
            System.out.printf("George Lucas will need %.2flv more.",Math.abs(budget));
        }
    }
}
