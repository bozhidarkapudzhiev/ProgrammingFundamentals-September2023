package _04_10_2023_Mathods.Task;

import java.util.Scanner;

public class _1_SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first=Integer.parseInt(scanner.nextLine());
        int second=Integer.parseInt(scanner.nextLine());
        int three=Integer.parseInt(scanner.nextLine());
        System.out.println(smallestOfThreeNumbers(first,second,three));
    }
    public static int smallestOfThreeNumbers(int first,int second,int three){
        if (first<second && first<three){
            return first;
        }else if (second<first && second< three){
            return second;
        }else {
            return three;
        }
    }
}
