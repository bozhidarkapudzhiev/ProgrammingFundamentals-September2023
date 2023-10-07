package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._15_09_2023_Exercise;

import java.util.Scanner;

public class test_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command=scanner.nextLine();
        double sum=0;
        while(!command.equals("Start")){
            double coins=Double.parseDouble(command);
            if (coins!=0.1&&coins!=0.2&&coins!=0.5&&coins!=1.0&&coins!=2.0){
                System.out.printf("Cannot accept %.2f\n",coins);
            }else {
               sum+=coins;
            }
            command=scanner.nextLine();
        }
        double priceProduct=0;
        sum=sum-priceProduct;
        String product=scanner.nextLine();
        while (!product.equals("End")){
            switch (product){
                case "Nuts":
                    priceProduct=2;
                    sum=sum-priceProduct;
                    break;
                case "Water":
                    priceProduct=0.7;
                    sum=sum-priceProduct;
                    break;
                case "Crisps":
                    priceProduct=1.50;
                    sum=sum-priceProduct;
                    break;
                case "Soda":
                    priceProduct=0.80;
                    sum=sum-priceProduct;
                    break;
                case "Coca-Cola":
                    priceProduct=1.00;
                    sum=sum-priceProduct;
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            product=scanner.nextLine();
        System.out.printf("Change: %.2f",sum);
        }
    }
}
