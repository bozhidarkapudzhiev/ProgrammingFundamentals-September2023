package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._15_09_2023_Exercise;

import java.util.Scanner;

public class _9_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**Прочитане  на броя на поръчките*/
        int countOrders = Integer.parseInt(scanner.nextLine());
        /**Обща цена на поръчката*/
        double totalPriceOrders = 0.0;
        for (int i = 0; i < countOrders; i++) {
            /**единична цена на капсулите*/
            double priceForCapsule = Double.parseDouble(scanner.nextLine());
            /**брой дни*/
            int numbersOfDay = Integer.parseInt(scanner.nextLine());
            /**брой капсули*/
            int numbersOfCapsule = Integer.parseInt(scanner.nextLine());
            /**Сумиране не единична проръчка*/
            double sumPrice = numbersOfDay * numbersOfCapsule * priceForCapsule;
            /**добавяне на суматана единичната поръчка към общата цена*/
            totalPriceOrders += sumPrice;
            /**Отпечатване на сумата за дадена поръчка*/
            System.out.printf("The price for the coffee is: $%.2f%n", sumPrice);
        }
        /**Отпечатване на крайната цена*/
        /* Total: $367.20*/
        System.out.printf("Total: $%.2f\n", totalPriceOrders);


    }
}
