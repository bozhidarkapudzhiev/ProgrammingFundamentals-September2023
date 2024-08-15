package _04_10_2023_Mathods.Exercise;

import java.util.Scanner;

public class _5_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        calculateOrders(product, quantity);
    }

    public static double calculateOrders(String product, int quantity) {
        double price = 0.0;
        switch (product) {
            case "coffee":
                price = 1.50;
                break;
            case "water":
                price = 1.0;
                break;
            case "coke":
                price = 1.40;
                break;
            case "snacks":
                price = 2.0;
                break;
        }
        double totalPrice = price * quantity;
        System.out.printf("%.2f\n", totalPrice);
        return totalPrice;
    }
}

