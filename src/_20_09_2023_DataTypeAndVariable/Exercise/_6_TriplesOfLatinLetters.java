package _20_09_2023_DataTypeAndVariable.Exercise;

import java.util.Scanner;

public class _6_TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        printTriples(n);

    }

    public static void printTriples(int n) {
        for (char first='a';first<'a'+n;first++) {
            for (char second='a';second<'a'+n;second++){
                for ( char third='a';third<'a'+n;third++){
                    System.out.printf("%c%c%c\n",first,second,third);
                }
            }
        }
    }
}


