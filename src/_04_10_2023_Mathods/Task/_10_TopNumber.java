package _04_10_2023_Mathods.Task;

import java.util.Scanner;

public class _10_TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        for (int number=1;number<=n;number++){
            //проверка дали е  Top -число
            //1. сумата от  чифрите да се дели на  8 -> checkSumDigitsInDivisibleBy8
            boolean isValidSumDigit=checkSumDigitsInDivisibleBy8(number);
            //2.съдържа поне една нечетна цифра
            boolean isContainsOddDigit=checkContainsOddDigit(number);
            //топ цифра
            if (isValidSumDigit&&isContainsOddDigit){
                System.out.println();
            }
        }
    }
    //1.метод който проверява дали сумата на цифрите се дели 8;
    //true -> сумата се дали на 8
    //false -> сумата не се дели на 8
    public static boolean checkSumDigitsInDivisibleBy8(int number){
        int sum=0;//сумата от цифра
        while (number>0){
            int lastDigit=number%10;//последната цифра
            sum+=lastDigit;
            number/=10;
        }
        // сумата от цифрите на числата
        if (sum %8 == 0){
            return true;
        }else {
            return false;
        }
    }
    //метод, който  да ми проверява  дали имаме  1 нечетна  цифра  в числото
    //true ->  ако имаме  1 нечетна цифра
    //false -> ако нямаме 1 нечетна цифра
     public static boolean checkContainsOddDigit(int number) {
         while (number > 0) {
             int lastDigit = number % 10;//последната цифра
             if (lastDigit % 2 != 0) {
                 //нечетна цифра -> поне една нечетна
                 return true;
             } else {
                 //четна цифра -> премахваме
                 number /= 10;

             }
         }
         //проверили всички цифри и  никоя не била нечетна
         return false;

     }
}
