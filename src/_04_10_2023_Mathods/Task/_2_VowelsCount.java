package _04_10_2023_Mathods.Task;

import java.util.Scanner;

public class _2_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text=scanner.nextLine().toLowerCase();
        //гласни букви:А , а ,Е , е , I , i , O , o , U , u
        printCountVowels(text);
    }
    //метод който принтира броя на  гласните букви  в даден  текст
    public static void printCountVowels(String text){
        int count=0;//броят на гласните букви
        //"desislava" -> toCharArray(); -> ['d','e','s','i','s','' a'---
        for (char letter:text.toCharArray()) {
            if (letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'){
                count++;
            }
        }
        // обходили сме всички символи -> брой на гласните букви
        System.out.println(count);

    }
}
