package _04_10_2023_Mathods.Exercise;

import java.util.Scanner;

public class _1_SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // int number=Integer.parseInt(scanner.nextLine());
        printSing(Integer.parseInt(scanner.nextLine()));
    }
    public static  void printSing(int number){
        if (number==0){
            System.out.printf("The number %d is zero.",number);
        } else if (number==Math.abs(number)) {
            System.out.printf("The number %d is positive.%n",number);
        }else {
            System.out.printf("The number %d is negative.",number);
        }
    }
}
