package _27_09_2023_Arrays.MoreExercise;

import java.util.Scanner;

public class _2_PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[n][];

        for (int row = 0; row < n; row++) {
            array[row] = new int[row + 1];
            for (int col = 0; col <= row; col++) {
                if (col == 0 || col == row) {
                    array[row][col] = 1;
                } else {
                    array[row][col] = array[row - 1][col - 1] + array[row - 1][col];
                }
            }
        }


        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
    }
}