package _27_09_2023_Arrays._29_09_2023_Exercise;

import java.util.Scanner;

public class _2_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstArrays = scanner.nextLine().split("\\s+");
        String[] secondArrays = scanner.nextLine().split("\\s+");
        for (int i = 0; i < secondArrays.length; i++) {
            String elArr2 = secondArrays[i];
            for (int j = 0; j <firstArrays.length; j++) {
                String elArr1 = firstArrays[j];
                if (elArr2.equals(elArr1)) {
                    System.out.print(elArr2 + " ");
                }
            }
        }
    }
}
