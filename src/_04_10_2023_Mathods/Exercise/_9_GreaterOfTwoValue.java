package _04_10_2023_Mathods.Exercise;

import java.util.Scanner;

public class _9_GreaterOfTwoValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input =scanner.nextLine();

        if ( input.equals("int")){
            int first=Integer.parseInt(scanner.nextLine());
            int second =Integer.parseInt(scanner.nextLine());
            scannerGreaterANumber(first,second);
        } else if (input.equals("char")) {
            String first=scanner.nextLine();
            String second=scanner.nextLine();
            scannerGreaterChar(first,second);
        }else if(input.equals("string")){
            String firstStr=scanner.nextLine();
            String secondStr=scanner.nextLine();
            scannerString(firstStr,secondStr);
        }


    }

    public static void scannerGreaterANumber(int first,int second){
       if (first>second){
           System.out.println(first);
       }else if (second>first){
           System.out.println(second);
       }
    }
    public static void scannerGreaterChar(String first,String second){
        if (first.charAt(0)>second.charAt(0)){
            System.out.println(first);
        }else {
            System.out.println(second);
        }


    }
    public static void scannerString(String first,String second) {

        char[] firstArray = first.toCharArray();

        char firstElement=firstArray[0];

        char[] secondArray = second.toCharArray();

        char secondElement=secondArray[0];

        if (firstElement>secondElement){
            for (char strFirst:firstArray){
                System.out.print(strFirst);
            }
        }else if (firstElement<secondElement){
            for (char strSecond:secondArray){
                System.out.print(strSecond);
            }
        }
    }
}
