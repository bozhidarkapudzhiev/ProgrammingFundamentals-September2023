package _20_09_2023_DataTypeAndVariable.Lab;

import java.util.Scanner;

public class _5_ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        String firstN=scanner.nextLine();
        String lastN=scanner.nextLine();
        String concatenation=scanner.nextLine();
        sb.append(firstN.concat(concatenation.concat(lastN)));
        System.out.println(sb);
        }
}
