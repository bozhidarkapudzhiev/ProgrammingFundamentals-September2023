package _04_10_2023_Mathods.Exercise;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _8_MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double first=Double.parseDouble(scanner.nextLine());
        double second=Double.parseDouble(scanner.nextLine());
        mathPow(first,second);
    }
    public static double mathPow(double first,double second){
        double result=Math.pow(first,second);
        DecimalFormat decimalFormat= new DecimalFormat("#.###");
        System.out.println(decimalFormat.format(result));
        return result;
    }
}
