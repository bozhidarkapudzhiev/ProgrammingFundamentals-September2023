package _20_09_2023_DataTypeAndVariable.BigDecimal;

import java.math.BigDecimal;

public class _8_CompareTo {
    public static void main(String[] args) {
        BigDecimal num1=new BigDecimal("10.5");
        BigDecimal num2=new BigDecimal("5.5");
        BigDecimal num3=new BigDecimal("10.5");

        System.out.println("Compare num1 and num2: " + num1.compareTo(num2));// return 1 => num1>num2
        System.out.println("Compare num2 and num1: " + num2.compareTo(num1));// return -1 =>num2<num1
        System.out.println("Compare num1 and num3: " + num1.compareTo(num3));// return 0 =>num1==num3
    }
}
