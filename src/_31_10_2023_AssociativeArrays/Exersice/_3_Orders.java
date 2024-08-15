package _31_10_2023_AssociativeArrays.Exersice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _3_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Double[]> linkedHashMap = new LinkedHashMap<>();
        String lines = scanner.nextLine();
        while (!lines.equals("buy")) {
            String[] line = lines.split("\\s+");
            String productName = line[0];
            double priceForProduct = Double.parseDouble(line[1]);
            int quantity = Integer.parseInt(line[2]);
            if (!linkedHashMap.containsKey(productName)) {
                linkedHashMap.put(productName, new Double[]{priceForProduct, (double) quantity});
            } else {
                Double[] currentValue = linkedHashMap.get(productName);
                double currentPrice = currentValue[0];
                double currentQuantity = currentValue[1];

                //Актуализация на общата стойност и количество
                currentValue[0] = priceForProduct;
                currentValue[1] = currentQuantity + quantity;
                linkedHashMap.put(productName, currentValue);
            }
            lines = scanner.nextLine();
        }
        for (Map.Entry<String, Double[]> entry : linkedHashMap.entrySet()) {
            String productName=entry.getKey();
            Double[] value= entry.getValue();
            double totalPrice=value[0]*value[1];
            System.out.printf("%s -> %.2f\n", productName,totalPrice);
        }
    }
}
