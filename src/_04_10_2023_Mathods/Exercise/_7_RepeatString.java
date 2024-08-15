package _04_10_2023_Mathods.Exercise;

import java.util.Scanner;

public class _7_RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line=scanner.nextLine();
        int count=Integer.parseInt(scanner.nextLine());
        repeatedString(line,count);
    }
    public static String repeatedString(String world,int count){
        StringBuilder builder=new StringBuilder("");
        for (int i = 0; i < count; i++) {
            builder.append(world);
        }
        System.out.println(builder);
        return String.format("%s",builder);
    }
}
