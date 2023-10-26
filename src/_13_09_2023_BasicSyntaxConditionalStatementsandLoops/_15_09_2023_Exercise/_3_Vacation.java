package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._15_09_2023_Exercise;

import java.util.Scanner;

public class _3_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersOfGroup = Integer.parseInt(scanner.nextLine());
        String groupTypes = scanner.nextLine();
        String daysOfWeek = scanner.nextLine();
        double prices = 0.0;
        double discount = 0;
        double allPriceSum = 0;
        switch (daysOfWeek) {
            case "Friday":
                if (groupTypes.equals("Students")) {
                    prices = 8.45;
                    allPriceSum = numbersOfGroup * prices;
                    if (numbersOfGroup >= 30) {
                        allPriceSum = allPriceSum - (allPriceSum * 15 / 100);
                    }
                } else if (groupTypes.equals("Business")) {
                    prices = 10.90;
                    allPriceSum = numbersOfGroup * prices;
                    if (numbersOfGroup >= 100) {
                        numbersOfGroup -= 10;
                        allPriceSum = numbersOfGroup * prices;
                    }
                } else if (groupTypes.equals("Regular")) {
                    prices = 15;
                    allPriceSum = numbersOfGroup * prices;
                    if (numbersOfGroup >= 10 && numbersOfGroup <= 20) {
                        allPriceSum = allPriceSum - (allPriceSum * 5 / 100);
                    }
                }
                break;
            case "Saturday":
                if (groupTypes.equals("Students")) {
                    prices = 9.80;
                    allPriceSum = numbersOfGroup * prices;
                    if (numbersOfGroup >= 30) {
                        allPriceSum = allPriceSum - (allPriceSum * 15 / 100);
                    }
                } else if (groupTypes.equals("Business")) {
                    prices = 15.60;
                    allPriceSum = numbersOfGroup * prices;
                    if (numbersOfGroup >= 100) {
                        numbersOfGroup -= 10;
                        allPriceSum = numbersOfGroup * prices;
                    }
                } else if (groupTypes.equals("Regular")) {
                    prices = 20;
                    allPriceSum = numbersOfGroup * prices;
                    if (numbersOfGroup >= 10 && numbersOfGroup <= 20) {
                        allPriceSum = allPriceSum - (allPriceSum * 5 / 100);
                    }
                }
                break;
            case "Sunday":
                if (groupTypes.equals("Students")) {
                    prices = 10.46;
                    allPriceSum = numbersOfGroup * prices;
                    if (numbersOfGroup >= 30) {
                        allPriceSum = allPriceSum - (allPriceSum * 15 / 100);
                    }
                } else if (groupTypes.equals("Business")) {
                    prices = 16.00;
                    allPriceSum = numbersOfGroup * prices;
                    if (numbersOfGroup >= 100) {
                        numbersOfGroup -= 10;
                        allPriceSum = numbersOfGroup * prices;
                    }
                } else if (groupTypes.equals("Regular")) {
                    prices = 22.50;
                    allPriceSum = numbersOfGroup * prices;
                    if (numbersOfGroup >= 10 && numbersOfGroup <= 20) {
                        allPriceSum = allPriceSum - (allPriceSum * 5 / 100);
                    }
                    break;
                }
        }
        System.out.printf("Total price: %.2f",allPriceSum);
    }
}
