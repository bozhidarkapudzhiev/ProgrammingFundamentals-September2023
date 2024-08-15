package _04_10_2023_Mathods.Task;

import java.util.Scanner;

public class _7_NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        printMatrix(n);
    }
    public static int printMatrix(int n){
        for (int row=0;row<n;row++){
            for (int col=0;col<n;col++){
                System.out.print(n+" ");
            }
            System.out.println();
        }
        return n;
    }
}
