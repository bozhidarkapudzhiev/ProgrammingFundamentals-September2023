package _20_09_2023_DataTypeAndVariable.MoreExercise;

import java.util.Scanner;

public class _5_DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int offsetAlphabetical=Integer.parseInt(scanner.nextLine());
        int length=Integer.parseInt(scanner.nextLine());
        StringBuilder builder=new StringBuilder();
        while (length>0) {
            String symbol = scanner.nextLine();
            int ascii = symbol.charAt(0) + offsetAlphabetical;
            char currentSym = (char) ascii;
            builder.append(currentSym);
            length--;
        }
        System.out.println(builder);
    }
}
