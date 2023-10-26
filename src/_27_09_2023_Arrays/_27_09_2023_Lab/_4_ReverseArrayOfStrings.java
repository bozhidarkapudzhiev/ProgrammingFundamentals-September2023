package _27_09_2023_Arrays._27_09_2023_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _4_ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       String [] elements= scanner.nextLine()
                                .split(" ");
       String [] reversed=new String[elements.length];
       int reversedIdx=0;
      /*  for (int i = elements.length-1; i >=0 ; i--) {
            reversed[reversedIdx]=elements[i];
            reversedIdx+=1;
        }*/
        int j=elements.length-1;
        for (int i=0;i<elements.length/2;i++){
            String leftElement=elements[i];
            String rightElement=elements[j];
            elements[i]=rightElement;
            elements[j]=leftElement;
            j-=1;
        }
        System.out.println(String.join(" ",elements));

       }
    }
