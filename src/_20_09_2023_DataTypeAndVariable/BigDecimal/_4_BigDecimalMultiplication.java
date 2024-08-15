package _20_09_2023_DataTypeAndVariable.BigDecimal;

import java.math.BigDecimal;

public class _4_BigDecimalMultiplication {
    public static void main(String[] args) {
        BigDecimal number1=new BigDecimal("3.5");
        BigDecimal number2=new BigDecimal("2");
        BigDecimal result=number1.multiply(number2);
        System.out.printf("Multiplication: %s",result);
    }
}
