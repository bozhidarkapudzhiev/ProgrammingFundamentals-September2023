package _04_10_2023_Mathods.Task;

import java.util.Scanner;

public class _3_CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String symbolFirst = scanner.nextLine();
        String symbolSecond = scanner.nextLine();
        symbolsPrint(symbolFirst, symbolSecond);

    }

    public static StringBuilder symbolsPrint(String symbolFirst, String symbolSecond) {
        int asciiSymFirst = (int) symbolFirst.charAt(0);
        int asciiSymSecond = (int) symbolSecond.charAt(0);
        StringBuilder builder = new StringBuilder();
        if (asciiSymFirst > asciiSymSecond) {
            int var = (int) asciiSymFirst;
           asciiSymFirst=asciiSymSecond;
          asciiSymSecond = var;
        }
        for (int i = asciiSymFirst + 1; i <= asciiSymSecond - 1; i++) {
            char symbol = (char) i;
            builder.append(symbol).append(" ");
        }


        System.out.println(builder);
        return builder;

    }
}
