package _20_09_2023_DataTypeAndVariable.Lab.Exercise;

import java.util.Scanner;

public class _6_CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=3;
        String concat="";
        for (int i=1;i<=n;i++){
            char ch=scanner.next().charAt(0);
            concat+=ch;

        }
        System.out.println(concat);
    }
}
