package _27_09_2023_Arrays._29_09_2023_Exersice;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String [] words=new String[]{"Monday","Test","Parking"};



        //1.for-цикъл ->работим с позицията на  елементите (индекс)
        for (int i = 0; i <= words.length-1; i++) {
            System.out.println(words[i]);

        }
        //2.foreach ->работим само с елемнтите
        for (String word:words){
            System.out.println(word);
        }
    }
}
