package _04_10_2023_Mathods.Task;

import java.util.Scanner;

public class _6_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text=scanner.nextLine();
        printMiddleCharacters(text);

    }
    //метод който принтира средния символ
     public  static void printMiddleCharacters(String text){
        //нечетна  дължина -> 1 среден символ
         // четна дълна -> 2 средни символа
         int length=text.length();
         if (length%2 !=0){
             int indexOfMiddleCharacters=length/2;
             //позиция на средния символ на нечетен борй символи
             System.out.println(text.charAt(indexOfMiddleCharacters));

         }else {
             int indexFirstMiddleCharacters=length/2-1;
             int indexSecondMiddleCharacters=length/2;
             System.out.print(text.charAt(indexFirstMiddleCharacters));
             System.out.print(text.charAt(indexSecondMiddleCharacters));

         }

     }
}
