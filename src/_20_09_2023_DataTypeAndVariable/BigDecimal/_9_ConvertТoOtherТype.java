package _20_09_2023_DataTypeAndVariable.BigDecimal;

import java.math.BigDecimal;
import java.util.Scanner;

public class _9_ConvertТoOtherТype {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal value=scanner.nextBigDecimal();
        int valueInt=value.intValue();/*Преобразуване в  int */
        long valueLong=value.longValue();/*Преобразуване в  long*/
        float valueFloat=value.floatValue();/*Преобразуване в  float*/
        double valueDouble=value.doubleValue();/*Преобразуване в  double*/
        System.out.println("Original value: " + value);//Original value: 2.25
        System.out.println("Value convert to Integer: " + valueInt);//Value convert to Integer: 2
        System.out.println("Value convert to Long: " + valueLong);//Value convert to Long: 2
        System.out.println("Value convert to Float: " + valueFloat);//Value convert to Float: 2.25
        System.out.println("Value convert to Double: " + valueDouble);//Value convert to Double: 2.25
    }
}
