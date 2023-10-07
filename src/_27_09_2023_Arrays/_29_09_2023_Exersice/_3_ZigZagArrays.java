package _27_09_2023_Arrays._29_09_2023_Exersice;

import java.util.Scanner;

public class _3_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //нечетен ре от конзолата (1,3,5,7,...)
        //първо число -> първи масив , второ число -> втори масив

        //четен ред от конзолата (2,4,6,8,....)
        //първо число -> втори масив, второ число -> първи масив

        //брой  на  редовете
        int rows=Integer.parseInt(scanner.nextLine());
        //съзваваме  два целочисленени масива
        int [] firstArray=new int [rows];
        int [] secondArray=new int [rows];

        // Обхождане  на  масиви
        for (int row =1;row<=rows;row++){
            // получавам  входни данни под формарта на  текст
            String input =scanner.nextLine(); //"2 5"
            //"2 5".split(" ") -> ["2","5"] преобразуване на String  към  int
            String [] numbers=input.split(" ");
            int number1=Integer.parseInt(numbers[0]);//"2" -> parse -> 2
            int number2=Integer.parseInt(numbers[1]);//"5" -> parse -> 5

            /* При нечетен ред числото отива в пъри масив
             * При  четен ред числото отива  в втория масив
             *
             *I-ви ред -> number1 -> firstArray, number2 ->secondArray
             *II-ви ред -> number1 -> secondArray, number2 ->fistArray
             *III-ви ред -> number1 -> firstArray, number2 ->secondArray
             * IV-ви ред -> number1 -> secondArray, number2 ->fistArray
             */

            if (row%2 !=0){
                //нечетен  ред
                //number1 -> firstArray
                firstArray[row-1]=number1;
                //number2 -> secondArray
                secondArray[row-1]=number2;
            }else {
                //четен ред
                //number1 ->secondArray
                secondArray[row-1]=number1;
                //number2 ->firstArray
                firstArray[row-1]=number2;
            }
        }
        //отпечатваме масивите
        for (int number:firstArray) {
            System.out.print(number+" ");
        }
        System.out.println();//сваляме курсора на  нов  ред
        for (int number:secondArray){
            System.out.print(number+" ");
        }
    }
}
