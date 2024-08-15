package _04_10_2023_Mathods.Exercise;

import java.util.Scanner;

public class _3_PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        printTriangle(n);
    }
    private static int printTriangle(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.printf("%d ",j);
            }
            System.out.println();
        }
        for (int i=n;i>1;i--){
            for (int j=1;j<=i-1;j++){
                System.out.printf("%d ",j);
            }
            System.out.println();
        }
        return n;
    }
}
