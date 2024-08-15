package _27_09_2023_Arrays._27_09_2023_Lab;

import java.util.Scanner;

public class _2_PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int[] arrays=new  int [n];
        for (int i = arrays.length-1; i>=0 ; i--) {
            int current=Integer.parseInt(scanner.nextLine());
            arrays[i]=current;
        }
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+" ");
        }
    }
}
