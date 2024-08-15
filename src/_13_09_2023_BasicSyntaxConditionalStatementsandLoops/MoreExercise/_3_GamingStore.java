package _13_09_2023_BasicSyntaxConditionalStatementsandLoops.MoreExercise;

import java.util.Scanner;

public class _3_GamingStore {
    public static void main(String[] args) {
           /*OutFall 4	$39.99
        CS: OG	$15.99
        Zplinter Zell	$19.99
        Honored 2	$59.99
        RoverWatch	$29.99
        RoverWatch Origins Edition	$39.99
      */
        Scanner scanner = new Scanner(System.in);
        double budgetForPriceGame = Double.parseDouble(scanner.nextLine());
        String gameNames = scanner.nextLine();
        double priceForGames;
        double totalForAllGame=0.0;
        while (budgetForPriceGame >= 0 && !gameNames.equals("Game Time")) {
            switch (gameNames) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    priceForGames = 39.99;
                    break;
                case "CS: OG":
                    priceForGames = 15.99;
                    break;
                case "Zplinter Zell":
                    priceForGames = 19.99;
                    break;
                case "Honored 2":
                    priceForGames = 59.99;
                    break;
                case "RoverWatch":
                    priceForGames = 29.99;
                    break;
                default:
                    System.out.println("Not Found");
                    gameNames = scanner.nextLine();
                    continue;
            } if (budgetForPriceGame<priceForGames) {
                System.out.println("Too Expensive");
            }else {
            totalForAllGame+=priceForGames;
            budgetForPriceGame-=priceForGames;
            System.out.printf("Bought %s\n",gameNames);
            }
            gameNames=scanner.nextLine();
        }
        if (budgetForPriceGame>0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f\n", totalForAllGame, budgetForPriceGame);
        }else {
            System.out.println("Out of money!");
        }
    }
}




