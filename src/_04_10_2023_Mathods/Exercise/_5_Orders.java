package _04_10_2023_Mathods.Exercise;

import java.util.Scanner;

public class _5_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String type=scanner.nextLine();
       int quantity=Integer.parseInt(scanner.nextLine());
       products(type,quantity);
    }
    public static void products(String type, int quantity){
        double price=0;
        switch (type){
            case "coffee":
                price=quantity*1.50;
                break;
            case "water":
                price=quantity*1.00;
                break;
            case "coke":
                price=quantity*1.40;
                break;
            case "snacks":
                price=quantity*2.40;
                break;
        }
        System.out.printf("%.2f",price);
    }


}
