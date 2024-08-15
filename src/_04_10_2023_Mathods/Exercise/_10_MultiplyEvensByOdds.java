package _04_10_2023_Mathods.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _10_MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //12345=	54 ->  Сумата  на четните  числа по сумата на нечетните числа
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(multiplyEvenByOdds(n));
    }

    public static int multiplyEvenByOdds(int numbers) {
        int even = 0;
        int odd = 0;
        while (numbers != 0) {
            int lastNumber = numbers % 10;
            if (lastNumber % 2 != 0) {
                odd += lastNumber;
            } else {
                even += lastNumber;
            }
            numbers = numbers / 10;
        }
        int sum = even * odd;
        return Math.abs(sum) ;
    }
}
