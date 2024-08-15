package _20_09_2023_DataTypeAndVariable.Exercise;

import java.util.Scanner;

public class _2_SumDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int sum=0;
        while (n>0){
            int lastNum=n%10;
            sum+=lastNum;
            n/=10;
        }
        System.out.println(sum);
    }
}
