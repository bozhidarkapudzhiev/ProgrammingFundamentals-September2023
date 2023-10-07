package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._15_09_2023_Exercise;

import java.util.Scanner;

public class _9_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfOrders=Integer.parseInt(scanner.nextLine());
        double allPrice=0;
        double total=0;
        for (int i=1;i<=numberOfOrders;i++){
            double pricePerCapsule=Double.parseDouble(scanner.nextLine());
            int dayInMount=Integer.parseInt(scanner.nextLine());
            int capsuleCount=Integer.parseInt(scanner.nextLine());
            allPrice=(dayInMount*capsuleCount)*pricePerCapsule;
            System.out.printf("The price for the coffee is: $%.2f\n",allPrice);
            total+=allPrice;
        }
        System.out.printf("Total: $%.2f",total);
    }
}
