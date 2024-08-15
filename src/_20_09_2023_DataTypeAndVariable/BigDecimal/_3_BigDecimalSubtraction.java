package _20_09_2023_DataTypeAndVariable.BigDecimal;

import java.math.BigDecimal;

public class _3_BigDecimalSubtraction {
    public static void main(String[] args) {
        /**Инициализация на променлива number1*/
        BigDecimal number1=new BigDecimal("5.8");
        /**Инициализация на променлива number2*/
        BigDecimal number2=new BigDecimal("3.2");
        /**Инициализация на променлива result ,
         * която ичислява резултата от изваждане на второто число от първоо,
         * чрез метода subtract()  на класа BigDecimal
         */
        BigDecimal result=number1.subtract(number2);
        /**Отпечатване на резултата*/
        System.out.printf("Difference: %s\n",result);

    }
}
