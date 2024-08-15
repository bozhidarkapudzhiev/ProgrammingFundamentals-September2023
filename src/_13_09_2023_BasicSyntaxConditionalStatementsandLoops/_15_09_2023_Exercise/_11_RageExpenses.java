package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._15_09_2023_Exercise;

import java.util.Scanner;

public class _11_RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**брой на загубените игри*/
        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        /**цена на слушалките*/
        double priceHeadset = Double.parseDouble(scanner.nextLine());
        /**цена на мишката*/
        double priceMouse = Double.parseDouble(scanner.nextLine());
        /**цена на клавиатурата*/
        double priceKeyboard = Double.parseDouble(scanner.nextLine());
        /**дисплейна цена*/
        double priceDisplay = Double.parseDouble(scanner.nextLine());

        /**броячи за всеки изхвърлен  елемент**/
        int countHeadset = 0; //бр. слушалки
        int countMouse = 0; //бр. мишки
        int countKeyboard = 0; //бр. калвиатури
        int countDisplay = 0; //бр. монитори

        for (int lostGame = 1; lostGame <= lostGamesCount; lostGame++) {
            if (lostGame% 2 == 0) {
                /**всяка втора игра -> слушалки*/
                countHeadset++;
            }
            if (lostGame%3==0){
                /**всяка трета игра -> мишка*/
                countMouse++;
            }
            if (lostGame % 6 == 0) {
                /**всяка шеста игра*/
                countKeyboard++;
            }
            if (lostGame % 12 == 0) {
                /**всяка дваннадесета игра -> монитор*/
                countDisplay++;
            }

        }

        //крайна сума = сума за слушалки (бр. слушалки * цена за 1 слушалки)
        // + сума за мишки  (бр. мишки * цена за 1 мишка)
        // + сума за клавиатури (бр. клавиатури * цена за 1 клавиатура)
        // + сума за монитори   (бр. монитори * цена за 1 монитор)
        double totalPrice = (countHeadset * priceHeadset) +
                            (countMouse * priceMouse) +
                            (countKeyboard * priceKeyboard) +
                            (countDisplay * priceDisplay);

        System.out.printf("Rage expenses: %.2f lv.", totalPrice);
    }
}
