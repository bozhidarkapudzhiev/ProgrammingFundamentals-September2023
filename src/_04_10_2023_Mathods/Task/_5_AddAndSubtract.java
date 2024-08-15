package _04_10_2023_Mathods.Task;

import java.util.Scanner;

public class _5_AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int three = Integer.parseInt(scanner.nextLine());
        int result = 0;
        result = calculateFirstToNumbers(first, second);
        result = substractsCalculate(result, three);
        System.out.println(result);
    }

    public static int calculateFirstToNumbers(int first, int second) {
        first = first + second;
        return first;
    }

    public static int substractsCalculate(int sum, int three) {
        return sum - three;
    }
}
