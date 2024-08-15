package _04_10_2023_Mathods.Exercise;

import java.util.Scanner;

public class _9_GreaterOfTwoValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String variable=scanner.nextLine();
        switch (variable){
            case "int":
                int firstInt=Integer.parseInt(scanner.nextLine());
                int secondInt=Integer.parseInt(scanner.nextLine());
                greaterInt(firstInt,secondInt);
                break;
            case "char":
               char symbolFirst=scanner.nextLine().charAt(0);
               char symbolSecond=scanner.nextLine().charAt(0);
               greaterChar(symbolFirst,symbolSecond);
               break;
            case "string":
                String nameFirst=scanner.nextLine();
                String nameSecond=scanner.nextLine();
                greaterChar(nameFirst,nameSecond);
        }
    }
    public static  int greaterInt( int first,int second){
        int result=0;
        if (first>second){
           result= first;
        }else {
            result= second;
        }
        System.out.println(result);
        return result;

    }
    public static String greaterChar(char symbolFirst, char symbolSecond){
        String result="";
        if ((int) symbolFirst > (int) symbolSecond){
            result= String.valueOf(symbolFirst);
        }else {
            result=String.valueOf(symbolSecond);
        }
        System.out.println(result);
        return result;
    }
    public static String greaterChar(String nameFirst,String nameSecond){
        String result="";
        if (nameFirst.charAt(0)>nameSecond.charAt(0)){
            result=nameFirst;
        }else {
            result=nameSecond;
        }
        System.out.println(result);
        return result;
    }
}
