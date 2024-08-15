package _04_10_2023_Mathods.Task;

import java.util.Scanner;

public class _8_FactorialDivision {

}
   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int k=Integer.parseInt(scanner.nextLine());
        *//*findFactSum(n);
        findFactSum(k);*//*
        long first=findFactSum(n);
        long second=findFactSum(k);
        long result=first/second;
        System.out.printf("%.2f",result);

    }
    public static long findFactSum(double number) {
        double sum=0.0;
        double fact = 1;//стойността на  факториел
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
            sum+=fact;
        }

        return sum;
    }

}
*/