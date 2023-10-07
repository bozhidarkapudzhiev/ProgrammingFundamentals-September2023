package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._15_09_2023_Exercise;

import java.util.Scanner;

public class _7_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        double sumMoney = 0;

        while (!command.equals("Start")) {
            double money = Double.parseDouble(command);
            if (money == 0.1 || money == 0.2 || money == 0.5 || money == 1 || money == 2) {
                sumMoney += money;
            } else {
                System.out.printf("Cannot accept %.2f\n", money);
            }
            command = scanner.nextLine();
        }
        double productPrice = 0;
        String product = scanner.nextLine();
        String nameProduct = "";
        while (!product.equals("End")) {
            boolean isProduct = product.equals("Nuts") || product.equals("Water") || product.equals("Crisps") || product.equals("Soda") || product.equals("Coke");
            switch (product) {
                case "Nuts":
                    nameProduct = "Nuts";
                    productPrice = 2.0;
                    break;
                case "Water":
                    nameProduct = "Water";
                    productPrice = 0.70;
                    break;
                case "Crisps":
                    nameProduct = "Crisps";
                    productPrice = 1.50;
                    break;
                case "Soda":
                    nameProduct = "Soda";
                    productPrice = 0.80;
                    break;
                case "Coke":
                    nameProduct = "Coke";
                    productPrice = 1.0;
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            if (isProduct) {
                if (sumMoney >= productPrice) {
                    sumMoney = sumMoney - productPrice;
                    System.out.printf("Purchased %s\n", nameProduct);
                    product = scanner.nextLine();
                } else if (sumMoney < productPrice) {
                    if (product.equals("End")) {
                        System.out.printf("Change: %.2f", sumMoney);
                        break;
                    }
                    System.out.println("Sorry, not enough money");
                    product = scanner.nextLine();

                } else {
                    product = scanner.nextLine();

                }
            }else {
                product=scanner.nextLine();
            }

        }
        System.out.printf("Change: %.2f", sumMoney);
    }
}