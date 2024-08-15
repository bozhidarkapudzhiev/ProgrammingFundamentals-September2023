package _20_09_2023_DataTypeAndVariable.Exercise;

import java.util.Scanner;

public class _5_PrintPartOfASCIITable {
    public static void main(String[] args) {
        /**60
         65
         < = > ? @ A
         */
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder= new StringBuilder();
        int startIndex=Integer.parseInt(scanner.nextLine());
        int endIndex=Integer.parseInt(scanner.nextLine());

        for (int i = startIndex; i <=endIndex ; i++) {
            int ascii=(char) i;
            String symbol=String.valueOf((char) ascii);
            builder.append(symbol.concat(" "));
        }
        System.out.println(builder);
    }

}
