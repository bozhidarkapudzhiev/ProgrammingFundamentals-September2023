package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._15_09_2023_Exercise;

import javax.management.MBeanRegistration;
import java.util.Scanner;

public class _7_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double moneySum = 0.0;
        while (!input.equals("Start")) {
            // 0.1, 0.2, 0.5, 1 и 2.
            double money = Double.parseDouble(input);
            if (money == 0.1 || money == 0.2 || money == 0.5 || money == 1.0 || money == 2.0) {
                moneySum += money;
                input = scanner.nextLine();
            } else {
                System.out.printf("Cannot accept %.2f\n", money);
                input = scanner.nextLine();
            }
        }
        String product = scanner.nextLine();
        while (!product.equals("End")) {
            double priceProduct = 0.0;
            switch (product) {
                case "Nuts":
                    priceProduct = 2.0;
                    break;
                case "Water":
                    priceProduct = 0.70;
                    break;
                case "Crisps":
                    priceProduct = 1.50;
                    break;
                case "Soda":
                    priceProduct = 0.80;
                    break;
                case "Coke":
                    priceProduct = 1.0;
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            if (moneySum >= priceProduct) {
                if (product.equals("Nuts") ||
                        product.equals("Water") ||
                        product.equals("Crisps") ||
                        product.equals("Soda") ||
                        product.equals("Coke")) {
                    System.out.printf("Purchased %s\n", product);
                    moneySum -= priceProduct;
                }
            } else {
                if (priceProduct > moneySum) {
                    System.out.println("Sorry, not enough money");
                }
            }
            product=scanner.nextLine();
        }
            System.out.printf("Change: %.2f\n", moneySum);
    }
}
