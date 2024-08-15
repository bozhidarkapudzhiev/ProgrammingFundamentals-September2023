package _04_10_2023_Mathods.Exercise;

import java.util.Scanner;

public class _4_Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command=scanner.nextLine();
        int firstN=Integer.parseInt(scanner.nextLine());
        int secondN=Integer.parseInt(scanner.nextLine());
        switch (command){
            case "add":
                add(firstN,secondN);
                break;
            case "multiply":
                multiply(firstN,secondN);
                break;
            case "subtract":
                subtract(firstN,secondN);
                break;
            case "divide":
                divide(firstN,secondN);
                break;
        }
    }
    public static int add(int first, int second){
        int result=first+second;
        System.out.println(result);
        return result;
    }
    public static  int subtract(int first,int second){
        int result=first-second;
        System.out.println(result);
        return result;
    }
    public static int multiply(int first, int second){
        int result= first*second;
        System.out.println(result);
        return result;
    }
    public static int divide(int first,int second){
        int result=first/second;
        System.out.println(result);
        return result;

    }
}