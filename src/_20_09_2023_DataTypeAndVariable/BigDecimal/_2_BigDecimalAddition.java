package _20_09_2023_DataTypeAndVariable.BigDecimal;

import java.math.BigDecimal;

public class _2_BigDecimalAddition {
    public static void main(String[] args) {
        /**Инициализация на число number1*/
        BigDecimal number1=new BigDecimal("1.5");
        /**Инициализация на число number2*/
        BigDecimal number2=new BigDecimal("2.3");
        /**Инициализация на променлива,
         *която ще съдържа резултата от сбора на
         * number1  и  number2
          */
        BigDecimal result=number1.add(number2);
        System.out.printf("Sum: %s\n",result);

    }
}
