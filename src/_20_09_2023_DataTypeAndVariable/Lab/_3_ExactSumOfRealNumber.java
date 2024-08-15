package _20_09_2023_DataTypeAndVariable.Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class _3_ExactSumOfRealNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =Integer.parseInt(scanner.nextLine());
        BigDecimal sum=new BigDecimal("0");
        for (int i = 0; i < n; i++) {
           BigDecimal bigDecimal=scanner.nextBigDecimal();
           sum=sum.add(bigDecimal);
        }
        System.out.println(sum);
    }
}
