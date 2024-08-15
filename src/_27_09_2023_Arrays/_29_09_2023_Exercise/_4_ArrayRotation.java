package _27_09_2023_Arrays._29_09_2023_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _4_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(value -> Integer.parseInt(value)).toArray();
        int rotation = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < rotation; i++) {
            int current = firstArr[0];
            for (int j = 0; j < firstArr.length-1; j++) {
                int nextEl=firstArr[j+1];
                firstArr[j]=nextEl;
            }

            firstArr[firstArr.length-1]=current;

        }
        for (int i = 0; i < firstArr.length; i++) {
            System.out.printf("%d ",firstArr[i]);
        }
    }
}
