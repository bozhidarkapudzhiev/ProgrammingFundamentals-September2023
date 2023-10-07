package _04_10_2023_Mathods.Task;

import java.util.Scanner;

public class _5_AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber=Integer.parseInt(scanner.nextLine());
        int secondNumber=Integer.parseInt(scanner.nextLine());
        int thirdNumber=Integer.parseInt(scanner.nextLine());
        //Math.min()
        //(firstNumber-secondNumber)-thirdNumber
        int sum=sum(firstNumber,secondNumber);//сумата  на  първите две числа (firstNumber+secondNumber)
        int diff=subtract(sum,thirdNumber);
        System.out.println(diff);
    }
    //метод,който намира и  връща сумата на 2 числа
    public static int sum(int n1,int n2) {
        int sum = n1 + n2;
        return sum;
    }
    //метод , който намира и връща разлика на 2 числа
    public static int  subtract(int n1,int n2){
        return  n1-n2;
    }
}
