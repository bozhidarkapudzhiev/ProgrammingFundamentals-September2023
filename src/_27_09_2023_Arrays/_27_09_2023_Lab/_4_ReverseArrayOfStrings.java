package _27_09_2023_Arrays._27_09_2023_Lab;

import java.util.Scanner;

public class _4_ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String []elements=scanner.nextLine().split(" ");
       /* String []reversed=new String[elements.length];
        int reversedIndex=0;
        for (int i=elements.length-1;i>=0;i--){
            reversed[reversedIndex]=elements[i];
            reversedIndex+=1;
        }
        System.out.println(String.join(" ",reversed));*/

        //Решение без втори масив:
        // 6 5 4 3 2 1
        //1st iteration -> 0 and 5
        //2st iteration -> 1 and 4
        //3st iteration -> 2 and 3

        int j=elements.length-1;
        for (int i=0;i<elements.length/2;i++){
            String leftElements=elements[i];
            String rightElements=elements[j];
            elements[i]=rightElements;
            elements[j]=leftElements;
            j-=1;
        }
        System.out.println(String.join(" ",elements));
    }
}
