package _27_09_2023_Arrays._29_09_2023_Exersice;

import java.util.Arrays;
import java.util.Scanner;

public class _2_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.входни данни

        String firstRow=scanner.nextLine();//"Hey hello 2 4 "
        String secondRow=scanner.nextLine();//"10 hey 4 hello"
        String [] firstArrays=firstRow.split(" ");//["Hey","hello","2","4"]
        String [] secondArray=secondRow.split(" ");//["10","hey","4","hello"]

        // за  всеки елемент на  втория масив -> обхождаме втория масив дали има съвпадение с пърия масив
        for (String el2: secondArray){                 //["10","hey","4","hello"]
            for (String el1:firstArrays){             //["Hey","hello","2","4"]
                if (el2.equals(el1)){
                    System.out.print(el2+" ");
                }
            }
        }

    }
}
