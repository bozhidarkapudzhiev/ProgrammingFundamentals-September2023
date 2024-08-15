package _20_09_2023_DataTypeAndVariable.MoreExercise;

import java.util.Scanner;

public class _3_FloatingEquality {
    private static final double EPSILON = 0.000001;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1=Double.parseDouble(scanner.nextLine());
        double number2=Double.parseDouble(scanner.nextLine());
        if (areEqual(number1,number2)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }//-4.999999
    // -4.999998
    public static boolean areEqual(double a,double b){
        return Math.abs(a - b) < EPSILON;
    }
}
