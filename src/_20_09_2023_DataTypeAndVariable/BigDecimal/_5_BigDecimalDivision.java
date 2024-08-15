package _20_09_2023_DataTypeAndVariable.BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class _5_BigDecimalDivision {
    public static void main(String[] args) {
        BigDecimal number1=new BigDecimal("7.0");
        BigDecimal number2=new BigDecimal("2.0");
        BigDecimal result=number1.divide(number2,2, RoundingMode.HALF_UP);
        System.out.println("Quotient: " + result);
    }
}
