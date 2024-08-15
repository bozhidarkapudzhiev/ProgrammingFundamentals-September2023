package _20_09_2023_DataTypeAndVariable.BigDecimal;

import java.math.BigDecimal;
import java.util.Scanner;

public class _10_Remainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal num1=scanner.nextBigDecimal();
        BigDecimal num2=scanner.nextBigDecimal();
        BigDecimal result=num1.remainder(num2);
        System.out.println("Result: "+result);
    }
}
