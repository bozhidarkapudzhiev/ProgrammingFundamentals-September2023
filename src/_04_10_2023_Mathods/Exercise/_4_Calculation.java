package _04_10_2023_Mathods.Exercise;

import java.util.Scanner;

public class _4_Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command=scanner.nextLine();
        int n1=Integer.parseInt(scanner.nextLine());
        int n2=Integer.parseInt(scanner.nextLine());
        switch (command){
            case "add":
                System.out.println(add(n1,n2));
                break;
            case "multiply":
                System.out.println(multiply(n1,n2));
                break;
            case "subtract":
                System.out.println(subtract(n1,n2));
                break;
            case "divide":
                System.out.println(divide(n1,n2));
        }
    }
   public static int add(int n1,int n2){
        return n1+n2;
   }
   public static int multiply(int n1,int n2){
        return n1*n2;
   }
   public static int subtract(int n1,int n2){
        return n1-n2;
    }
    public static int divide(int n1,int n2){
        return n1/n2;
    }
}