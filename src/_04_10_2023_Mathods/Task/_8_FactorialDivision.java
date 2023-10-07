package _04_10_2023_Mathods.Task;

import java.util.Scanner;

public class _8_FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber=Integer.parseInt(scanner.nextLine());
        int secondNumber=Integer.parseInt(scanner.nextLine());
        //факториела на  първото число (firstNumber)
            long factFirstNumber=calculateFactorial(firstNumber);
        //факториела на  второто число (secondNumber)
            long factSecond=calculateFactorial(secondNumber);
       // факториела  на  първото трябва  да разделя  на  второто число -> %.2f
            double result= factFirstNumber*1.0/factSecond;
        System.out.printf("%.2f",result);

    }
        //метод който връща  резулта(факториел на дадено число)
        //!!!! изчисления факториел може да бъде много голямо число
    public  static long calculateFactorial(int number) {
        //number=8
        //8!=1*2*3*4*5*6*7*8
        long fact=1;//стойността на  факториел
        for (int i=1;i<= number;i++){
            fact=fact*i;
        }
        return fact;
    }
}
