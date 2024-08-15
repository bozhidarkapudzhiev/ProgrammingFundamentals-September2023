package _20_09_2023_DataTypeAndVariable.Exercise;

import java.util.Scanner;

public class _7_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int capacityTank=255;
        int sumLiters=0;


        for (int i = 0; i < n; i++) {
            int litersOfWater=Integer.parseInt(scanner.nextLine());
               if (sumLiters+litersOfWater<=capacityTank){
                   sumLiters+=litersOfWater;
               }else {
                   System.out.println("Insufficient capacity!");
               }
            }
        System.out.println(sumLiters);
    }
}
