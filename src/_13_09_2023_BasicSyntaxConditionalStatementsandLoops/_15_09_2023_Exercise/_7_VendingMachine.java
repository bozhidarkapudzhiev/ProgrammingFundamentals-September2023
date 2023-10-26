package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._15_09_2023_Exercise;

import java.util.Scanner;

public class _7_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command=scanner.nextLine();
        double sum=0;
        while (!command.equals("Start")){
          double money=Double.parseDouble(command);//конвертиране на  String към int
      if (money==0.1 || money==0.2 || money==0.5 || money==1.00 || money==2.0){
                sum+=money;
            }else {
                System.out.printf("Cannot accept %.2f\n",money);
            }
            command=scanner.nextLine();
        }
        String product=scanner.nextLine();
        while (!product.equals("End")){
            double price=0.0;
            switch (product){
                case "Nuts":
                    price=2.0;
                    break;
                case "Water":
                    price=0.70;
                    break;
                case "Crisps":
                    price=1.50;
                    break;
                case "Soda":
                    price=0.80;
                    break;
                case "Coke":
                    price=1.00;
                    break;
                default:
                    System.out.println("Invalid product");
                    product=scanner.nextLine();
                    continue;
                    /*Ключовата continue дума се използва за прекратяване на текущата итерация в
                    for цикъл (или while цикъл) и продължава към следващата итерация.*/
            }
            if (price<=sum){
                System.out.printf("Purchased %s\n",product);
                sum-=price;
                product=scanner.nextLine();
            }else if (price>sum && sum>0){
                System.out.println("Sorry, not enough money");
                product=scanner.nextLine();
            }
        }
        System.out.printf("Change: %.2f\n",sum);

    }
}