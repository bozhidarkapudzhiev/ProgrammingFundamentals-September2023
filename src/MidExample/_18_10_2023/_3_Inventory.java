package MidExample._18_10_2023;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _3_Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String>items=Arrays.stream(scanner.nextLine()
                        .split(" "))
                        .collect(Collectors.toList());
        String command=scanner.nextLine();//входни данни -> валидни командата  или Craft!
        while (!command.equals("Craft!")){
            //1.command="Collect - {item}" .split(" - ") ->["Collect","{item}"]
            //2.command="Drop - {item}".split(" - ") ->["Drop","{item}"]
            //3.command="Combine Items - {item}:{new_item}".split(" - ") ->["Combine","Item","{item}"]
            //4.command="Renew - {item}".split(" - ") ->["Renew","{item}"]
            String [] commandParts=command.split(" - ");
            String commandName=commandParts[0];//"Collect","Drop","Combine Items","Renew"
            String item=commandParts[1];//
            switch (commandName){
                case "Collect":
                    if (!items.contains(item)){
                        items.add(item);
                    }
                    break;
                case "Drop":
                    items.remove(item);
                    //1.проверява дали има елемента->2.премехваме елемента , в противен случай го пропускаме
                    break;
                case "Combine Items":
                   // items - {old_item}:{new_item}".split(" - ") ->["Drop","{item}"]
                   String oldItem=item.split(":")[0];
                   String newItem=item.split(":")[1];
                   if (items.contains(oldItem)){
                       int indexOldItem=items.indexOf(oldItem);
                       //add(index.element) -> вмъква ,да не фубим елемент
                       //set(index,element) ->  замества ,губим елемент на дадения индекс
                       items.add(indexOldItem + 1,newItem); //add(index.element) -> вмъква ,да не фубим елемент
                   }
                    break;
                case "Renew":
                    if (items.contains(item)){//проверяваме дали съществува  съответни   item
                        items.remove(item);// ако съществува го изтриваме
                        items.add(item);//и го добавяме в края на  списъка
                    }
                    break;
            }

            command=scanner.nextLine();
        }
        //принтираме крайния списък
        System.out.println(String.join(", ",items));
    }
}
