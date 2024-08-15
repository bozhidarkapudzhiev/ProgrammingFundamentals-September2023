package _20_09_2023_DataTypeAndVariable.Lab;

import java.util.Scanner;

public class _4_TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town=scanner.nextLine();
        int population=Integer.parseInt(scanner.nextLine());
        short area=Short.parseShort(scanner.nextLine());
        System.out.printf("Town %s has population of %d and area %d square km.\n",town,population,area);
        /**Town Sofia has population of 1286383 and area 492 square km.*/
    }
}
