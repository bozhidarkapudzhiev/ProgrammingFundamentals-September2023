package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._15_09_2023_Exercise;

import java.util.Scanner;

public class _10_PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         /**Прочитане на число с плаваща запетая , която указва бюджета */
        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        /**Прочитане на броя студенти,цяло число */
        int countOfStudent = Integer.parseInt(scanner.nextLine());
        /**Прочитане на цената за един меч*/
        double priceOfLightsabers = Double.parseDouble(scanner.nextLine());
        /**Прочитане  на цената за една роба*/
        double priceOfRobes = Double.parseDouble(scanner.nextLine());
        /**Прочитане на цената за един колан*/
        double priceOfBelts = Double.parseDouble(scanner.nextLine());


        /**цена на мечовете с 10 % повече*/
        double sumPriceLightsabers = Math.ceil(countOfStudent+0.10*countOfStudent)*priceOfLightsabers;
        /**цена на роба*/
        double sumRobes=countOfStudent*priceOfRobes;
        /**цена на коланите*/
        double sumBelts=(countOfStudent-countOfStudent/6)*priceOfBelts;

        double allPrice =(sumPriceLightsabers+sumRobes+sumBelts);

        if (amountOfMoney >= allPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.\n", allPrice);
        } else {
            double neededMoney = allPrice - amountOfMoney;
            System.out.printf("George Lucas will need %.2flv more.\n", neededMoney);
        }
    }
}
