package _04_10_2023_Mathods.Task;

import java.util.Scanner;

public class _7_NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine()); //брой на редове=брой колони
        printTable(n);
    }
    //метод ,който отпечатва таблица
    public static void  printTable(int n){
        for (int row=1;row<=n;row++){
            for (int col=1;col<=n;col++){
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}
