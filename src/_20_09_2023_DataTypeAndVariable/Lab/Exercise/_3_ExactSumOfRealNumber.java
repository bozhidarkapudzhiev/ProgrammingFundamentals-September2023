package _20_09_2023_DataTypeAndVariable.Lab.Exercise;

import java.math.BigDecimal;
import java.util.Scanner;

public class _3_ExactSumOfRealNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        BigDecimal sum=new BigDecimal("0");
        for (int i = 1; i <=n ; i++) {
            BigDecimal bigDecimal=new BigDecimal(scanner.nextLine());
            sum=sum.add(bigDecimal);
        }
        System.out.println(sum);

    }
}
