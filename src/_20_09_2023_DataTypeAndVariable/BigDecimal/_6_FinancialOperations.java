package _20_09_2023_DataTypeAndVariable.BigDecimal;

import java.math.BigDecimal;

public class _6_FinancialOperations {
    public static void main(String[] args) {
        BigDecimal price=new BigDecimal("19.99");
        BigDecimal taxRate=new BigDecimal("0.20");
        BigDecimal tax=price.multiply(taxRate);
        BigDecimal total=price.add(tax);

        System.out.println("Price: " + price);
        System.out.println("Tax : " + tax);
        System.out.println("Total: " + total);
    }
}
