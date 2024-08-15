package _20_09_2023_DataTypeAndVariable.Lab;

import java.util.Scanner;

public class _9_CenturiesToMinutes {
    public static void main(String[] args) {
   /*     1 centuries = 100 years = 36524 days = 876581 hours = 52594877 minutes*/
        /**1 век =100 години
         * 100 години * 365 дни = 36524 дни
         * 36524 дни * 24 часа = 876581 часа
         * 876581 часа * 60 минути = 52594877 минути
         *
         */
        Scanner scanner = new Scanner(System.in);
        int  centuries=Integer.parseInt(scanner.nextLine());
        double years=100*centuries;
        double day=  365.2422 *years;
        double hours=24*day;
        double minutes=60*hours;
        System.out.printf("%d centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes",centuries,years,day,hours,minutes);
    }
}
