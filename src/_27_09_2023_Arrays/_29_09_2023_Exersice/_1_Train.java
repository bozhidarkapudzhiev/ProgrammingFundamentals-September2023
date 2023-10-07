package _27_09_2023_Arrays._29_09_2023_Exersice;

import java.util.Arrays;
import java.util.Scanner;

public class _1_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int []numberOfPassengersInACarriage=new  int [n];
        int totalNumberOfPassengers=0;
        for (int i = 0; i < n; i++) {
            numberOfPassengersInACarriage[i]=Integer.parseInt(scanner.nextLine());
            System.out.print(numberOfPassengersInACarriage[i]+" ");
            totalNumberOfPassengers+=numberOfPassengersInACarriage[i];
        }
        System.out.println();
        System.out.println(totalNumberOfPassengers);

    }
}
