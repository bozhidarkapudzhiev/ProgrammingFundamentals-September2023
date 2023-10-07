package _04_10_2023_Mathods.Exercise;

import java.util.Scanner;

public class _3_PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        printingTriangle(n);
    }
    public static void printingTriangle(int n){
        for (int i = 1; i <=n; i++) {
            for (int j=1;j<i;j++){
                System.out.print(j+" ");
            }
            System.out.println(i);
        }
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-1;j--){
                System.out.print(j+" ");
            }
            System.out.println(i);
        }

        System.out.println();
    }
}
