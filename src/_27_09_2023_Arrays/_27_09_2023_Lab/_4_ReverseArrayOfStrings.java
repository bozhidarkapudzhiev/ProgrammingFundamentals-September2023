package _27_09_2023_Arrays._27_09_2023_Lab;
import java.util.Scanner;

public class _4_ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine()
                .split("\\s+");
        int j = elements.length - 1;
        for (int i = 0; i < elements.length / 2; i++) {
            String leftElement = elements[i];
            String rightElement = elements[j];
            elements[i] = rightElement;
            elements[j] = leftElement;
            j -= 1;
        }
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i]+" ");
        }
    }
}

