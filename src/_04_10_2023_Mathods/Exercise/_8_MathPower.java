package _04_10_2023_Mathods.Exercise;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _8_MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number=Double.parseDouble(scanner.nextLine());
        double power=Double.parseDouble(scanner.nextLine());
        DecimalFormat df=new DecimalFormat("0.####");
        System.out.println(df.format(pow(number,power)));
    }
    public static double pow(double number,double power){
        double result=1;
        for (int i=0;i<power;i++){
            result*=number;
        }
        return result;
    }
}
