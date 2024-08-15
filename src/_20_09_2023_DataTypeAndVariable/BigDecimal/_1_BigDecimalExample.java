package _20_09_2023_DataTypeAndVariable.BigDecimal;

import java.math.BigDecimal;

public class _1_BigDecimalExample {
    public static void main(String[] args) {
        /**Създаване на BigDecimal от число*/
        /*	Когато създаваме BigDecimal от число с плаваща запетая,
            като new BigDecimal(0.1), може да има проблеми с точността.*/
        BigDecimal decimalFromDouble=new BigDecimal(0.1);


        /**Създаване на BigDecimal от низ*/
        /*	За предпочитане е да създаваме BigDecimal от низ,
        като new BigDecimal("0.1"), за да избегнем неточности.*/
        BigDecimal decimalFromString=new BigDecimal("0.1");


        /** Извеждане на BigDecimal стойности*/
        System.out.println("From double: " + decimalFromDouble);//From double: 0.1000000000000000055511151231257827021181583404541015625
        System.out.println("From string: " + decimalFromString);//From string: 0.1
    }
}
