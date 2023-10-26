package _04_10_2023_Mathods.Exercise;

import java.util.Scanner;

public class _6_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width=Integer.parseInt(scanner.nextLine());
        int height=Integer.parseInt(scanner.nextLine());
        System.out.println(calculateArea(width,height));

    }
    public  static int calculateArea(int width,int height){
        return width*height;
    }

}
