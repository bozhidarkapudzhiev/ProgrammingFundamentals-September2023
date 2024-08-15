package _04_10_2023_Mathods.Exercise;

import java.util.Scanner;

public class _6_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height=Integer.parseInt(scanner.nextLine());
        int weight=Integer.parseInt(scanner.nextLine());
        calculateRectancleArea(height,weight);
    }
    public static int calculateRectancleArea(int height,int weight){
        int result=height*weight;
        System.out.println(result);
        return result;
    }
}
