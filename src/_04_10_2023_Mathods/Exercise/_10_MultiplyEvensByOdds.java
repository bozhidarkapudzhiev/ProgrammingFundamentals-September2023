package _04_10_2023_Mathods.Exercise;

import java.util.Scanner;

public class _10_MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberStr=scanner.nextLine();
        multiply(numberStr);


    }
    public static int[] multiply(String numberStr){
       String[] splitArray=numberStr.split(" ");
       int [] arrNumber=new int [splitArray.length];
       for (int i=0;i< splitArray.length;i++){
           arrNumber[i]=Integer.parseInt(splitArray[i]);
       }
        return arrNumber;
    }

}
