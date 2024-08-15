package _27_09_2023_Arrays._29_09_2023_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _10_TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleWaiting = Integer.parseInt(scanner.nextLine());
        int[] currentStateOfTheLift = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < currentStateOfTheLift.length; i++) {
            while (currentStateOfTheLift[i] < 4 && peopleWaiting > 0) {
                currentStateOfTheLift[i]++;
                peopleWaiting--;
            }
        }
        boolean hasEmptySpots = Arrays.stream(currentStateOfTheLift).anyMatch(wagon -> wagon < 4);
        if (peopleWaiting == 0 && hasEmptySpots) {
            System.out.println("The lift has empty spots!");
        } else if (peopleWaiting > 0 && !hasEmptySpots) {
            System.out.printf("There isn't enough space! %d people in a queue!\n", peopleWaiting);
        }
        for (int i : currentStateOfTheLift) {
            System.out.printf("%d ", i);
        }
    }
}
