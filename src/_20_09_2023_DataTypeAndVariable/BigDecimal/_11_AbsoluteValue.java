package _20_09_2023_DataTypeAndVariable.BigDecimal;

import java.math.BigDecimal;
import java.util.Scanner;

public class _11_AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value1=scanner.nextLine();
        String value2=scanner.nextLine();
        BigDecimal a=new BigDecimal(value1);
        BigDecimal b=new BigDecimal(value2);
        BigDecimal result=a.subtract(b);
        System.out.println(result.abs());
        System.out.println();
    }
}
