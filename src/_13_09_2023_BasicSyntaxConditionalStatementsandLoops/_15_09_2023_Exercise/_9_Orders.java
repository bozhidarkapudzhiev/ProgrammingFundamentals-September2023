package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._15_09_2023_Exercise;

import java.util.Scanner;

public class _9_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberОfОrders=Integer.parseInt(scanner.nextLine());
        double totalPrice=0;
        for (int i=1;i<=numberОfОrders;i++){
            double pricePerCapsule=Double.parseDouble(scanner.nextLine());
            int days=Integer.parseInt(scanner.nextLine());
            int numberOfCapsules=Integer.parseInt(scanner.nextLine());

            double sum=pricePerCapsule*days*numberOfCapsules;
            totalPrice+=sum;
            System.out.printf("The price for the coffee is: $%.2f\n",sum);
        }
        System.out.printf("Total: $%.2f",totalPrice);
    }
}
