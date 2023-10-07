package _13_09_2023_BasicSyntaxConditionalStatementsandLoops.MoreExercise;

import java.util.Scanner;

public class _3_GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // баланс с който ще раполагам
        double currentBalance = Double.parseDouble(scanner.nextLine());
        double buyGame = 0;
        //сканиране на името на играта
        String validGame = scanner.nextLine();
        String nameGames = "";
        //обща цена  на игрите
        double allPriceGame = 0.0;
        //цена за една игра
        double priceGame = 0.0;
        while (!validGame.equals("Game Time")) {
            switch (validGame) {
                case "OutFall 4":
                    nameGames = "OutFall 4";
                    priceGame = 39.99;
                    allPriceGame = allPriceGame + priceGame;
                    buyGame = currentBalance - priceGame;
                    break;
                case "CS: OG":
                    nameGames = "CS: OG";
                    priceGame = 15.99;
                    allPriceGame = allPriceGame + priceGame;
                    buyGame = currentBalance - priceGame;
                    break;
                case "Zplinter Zell":
                    nameGames = "Zplinter Zell";
                    priceGame = 19.99;
                    allPriceGame = allPriceGame + priceGame;
                    buyGame = currentBalance - priceGame;
                    break;
                case "Honored 2":
                    nameGames = "Honered 2";
                    priceGame = 59.99;
                    allPriceGame = allPriceGame + priceGame;
                    buyGame = currentBalance - priceGame;
                    break;
                case "RoverWatch":
                    nameGames = "RoverWatch";
                    priceGame = 29.99;
                    allPriceGame = allPriceGame + priceGame;
                    buyGame = currentBalance - priceGame;
                    break;
                case "RoverWatch Origins Edition":
                    nameGames = "RoverWatch Origins Edition";
                    priceGame = 39.99;
                    allPriceGame = allPriceGame + priceGame;
                    buyGame = currentBalance - priceGame;
                    break;
                default:
                    nameGames = "Not Found";
                    System.out.println(nameGames);
                    break;
            }
            if (currentBalance > buyGame && currentBalance > 0) {
                System.out.printf("Bought %s\n", validGame);
            } else if (currentBalance < buyGame) {
                System.out.print("Too Expensive");
            } else if (currentBalance <= 0) {
                System.out.print("Out of money!");
                break;
            }
            validGame=scanner.nextLine();

        }
        currentBalance=currentBalance-allPriceGame;
        System.out.printf("Total spent: $%.2f.Remaining: $%.2f",allPriceGame,currentBalance);

    }
}



