package _20_09_2023_DataTypeAndVariable.Exercise;

import java.util.Scanner;

public class _9_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // начален добив
        int startYield = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int totalSpice=0;
        /**Ден 1 извличаме 111 подправки, а в края на смяната работниците консумират 26, оставяйки 85. Добивът спада с 10 до 101.
         На ден 2 извличаме 101 подправки, работниците консумират 26, оставяйки 75.
         Общият им брой е 160, а доходността е спаднала до 91.
         Тъй като очакваният добив е по-малък от 100, ние изоставяме източника. Работниците взимат още 26, оставяйки 134.
         Мината работи от 2 дни.
*/

        while (startYield >= 100) {
            totalSpice+=startYield-26;
            startYield-=10;
            count++;
        }

        if (totalSpice>=26){
            totalSpice-=26;
        }
        System.out.println(count);
        System.out.println(totalSpice);
    }
}
