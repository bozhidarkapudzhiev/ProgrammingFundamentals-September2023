package _20_09_2023_DataTypeAndVariable.Lab;

import java.util.Scanner;

public class _7_ReversedChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] arrays=  new  String[3];
        StringBuilder sb=new StringBuilder();
        for (int  i=arrays.length-1;i>=0;i--){
            String symbol=scanner.nextLine();
           arrays[i]=symbol;
        }
        for (int i = 0; i < arrays.length; i++) {
            sb.append(arrays[i].concat(" "));
        }
        System.out.println(sb);
        }
    }