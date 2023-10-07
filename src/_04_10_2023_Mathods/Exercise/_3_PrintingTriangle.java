package _04_10_2023_Mathods.Exercise;

import java.util.Scanner;

public class _3_PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size =Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=size; i++) {
            prinRow(i);
        }
        for (int i = size; i>=1 ; i--) {
            prinRow(i);
        }
    }

    public static void prinRow(int elementsCount){
        for (int i=1;i<=elementsCount;i++ ){
            System.out.printf("%d ",i);
        }
        System.out.println();
    }
}
