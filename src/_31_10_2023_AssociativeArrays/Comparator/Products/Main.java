package _31_10_2023_AssociativeArrays.Comparator.Products;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Samsung S22", 1800.00));
        productList.add(new Product("Samsung S23 Utra", 3000.00));
        productList.add(new Product("Samsung S23", 2000.00));//низходящ ред
        productList.add(new Product("Samsung S23 Plus", 2000.00));//низходящ ред
        productList.add(new Product("Samsung S24", 3000.00));
        productList.add(new Product("Samsung S24 Plus", 2600.00));

        //Сортиране на списък във възходящ ред
        productList.sort(Comparator.comparingDouble(Product::getPrice));
        //Отпечатване на списъка
        System.out.println("Продукти във възходящ ред: ");
        productList.forEach(product -> System.out.println(product.getName() + " - " + product.getPrice()));
        System.out.println("Продукти в низходящ ред: ");
        productList.sort(Comparator.comparingDouble(Product::getPrice).reversed());
        productList.forEach(product -> System.out.println(product.getName() + " - " + product.getPrice()));
        System.out.println();
        System.out.println("Продукти във възходящ ред и име в низходящ ред: ");
        productList.sort(Comparator.comparingDouble(Product::getPrice));
        productList.forEach(product -> System.out.println(product.getPrice()+" - "+product.getName()));

        /**
         * 1800.0 - Samsung S22
         * 2000.0 - Samsung S23
         * 2000.0 - Samsung S23 Plus
         * 2600.0 - Samsung S24 Plus
         * 3000.0 - Samsung S23 Utra
         * 3000.0 - Samsung S24
         *
         */
    }
}
