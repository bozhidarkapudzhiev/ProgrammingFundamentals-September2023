package MidExample._18_10_2023;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _2_ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.прочитане на списък с продукти
        List<String>productsList= Arrays.stream(scanner.nextLine() //"Tomatoes!Potatoes!Bread
                        .split("!"))                      //["Tomatoes","Potatoes","Bread"] //масив от текст
                .collect(Collectors.toList());         //   {"Tomatoes","Potatoes","Bread"}//списък  с текс-ове
        String command=scanner.nextLine();                     //входни данни: валидни  данни или Go Shopping
        while (!command.equals("Go Shopping!")){
            //1.command="Urgent {product}".split() -> ["Urgent","product"]
            //2.command="Unnecessary{product}.split() -> ["Unnecessary","product"]
            //3.command="Correct{product}{newProduct}.split() -> ["Correct","{product}","{newProduct}"]
            //4.command="Rearrange{product}.split() -> ["Urgent","{product}"]

            String [] commandPart=command.split(" ");
            String commandName=commandPart[0];//"Urgent",Unnecessary","Correct","Rearrange" -> взимаме елемент на 0 позиция
            String product=commandPart[1];//-> взимаме елемент на 1 позиция

            switch (commandName){
                case "Urgent":
                    //1.command="Urgent {product}".split() -> ["Urgent","product"]
                    //add the item at the start of the list. If the item already exists, skip this command.
                    if (!productsList.contains(product)){
                        productsList.add(0,product);//добавяме  елемента на  нулева позиция елемент ->
                                                            // добавя на определено място в списъка
                    }
                    break;
                case "Unnecessary":
                    //2.command="Unnecessary{product}.split() -> ["Unnecessary","product"]
                   /* - remove the item with the given name, only if it exists in the list. Otherwise skip
                    this command*/
                    if (productsList.contains(product)){
                        productsList.remove(product);
                    }

                    break;
                case "Correct":
                    //3.command="Correct{product}{newProduct}.split() -> ["Correct","{product}","{newProduct}"]
                    //if the item with the given old name exists, change its name with the
                    //new one. If it doesn't exist, skip this command.
                    String newProduct=commandPart[2];
                    if (productsList.contains(product)){
                        int indexProduct=productsList.indexOf(product);//взимам  индекс на продукт който трябва да заместя
                        productsList.remove(product);//премахваме  продукта
                        productsList.add(indexProduct,newProduct);//добавяме новия продукт на мястото на премахнатия по-горе
                        //  productsList.set(indexProduct,newProduct); == productsList.add(indexProduct,newProduct);
                    }
                    break;
                case"Rearrange":
                    //4.command="Rearrange{product}.split() -> ["Urgent","{product}"]
                    if (productsList.contains(product)){
                        productsList.remove(product);
                        productsList.add(product);//добавя на последно място в списъка

                    }
                    break;
            }
            command=scanner.nextLine();
        }
        //отпечатваме  продукти  в списъка разделени с (, )    ["Tomatoes","Potatoes","Bread"]

        //работи за всички типове списъци
        System.out.println(productsList.toString()               //["Tomatoes,Potatoes,Bread"]
                .replace("[", "")            //"Tomatoes,Potatoes,Bread]"
                .replace( "]", ""));         //"Tomatoes,Potatoes,Bread"


        //лист от текстове  -> само String.join
        // System.out.println(String.join(", ",productsList));//работи само  за списък от текстове
    }
}
