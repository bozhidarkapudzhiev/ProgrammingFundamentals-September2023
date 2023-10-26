package MidExample._18_10_2023;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String>items=Arrays.stream(scanner.nextLine()
                        .split(", "))       // разделени със запетая и интервал съхранени в списък
                        .collect(Collectors.toList());//->  преобразуване към toList();
        String command=scanner.nextLine();
        while (!command.equals("Craft!")){       //входни данни: валидна команда или Craft!
            //1.command = "Collect - {item}.split(" - ") -> ["Collect","{item}"]
            //2.command = "Drop - {item}.split(" - ") -> ["Drop","{item}"]
            //3.command = "Combine Item - {item}:{new_item}".split(" - ") -> ["Combine Item","{item}:{new_item}"]
            //4.command = Renew - {item}.split(" - ") -> ["Renew","{item}"]
            String [] commandPart=command.split(" - "); // "Collect","Drop","Combine","Renew"
            String commandName=commandPart[0];
            String item=commandPart[1];
            switch (commandName){
                case "Collect":
                    if(!items.contains(item)){
                        items.add(item);
                    }
                    break;
                case "Drop":
                    items.remove(item);//remove -> 1.проверява дали имаме елемента -> 2.премахваме
                    break;
                case "Combine Item":
                    //item=" {item}:{new_item}.split(":") -> [{"old_item"},"{new_item}"
                    String oldItem=item.split(":")[0];
                    String newItem=item.split(":")[1];
                    if (items.contains(oldItem)){
                        int indexOldItem=items.indexOf(oldItem);//1.взимаме индекса на стария елемемент
                        //.аdd(index,element) -> вмъква елемент ,без да загубим друг елемет
                        //.set(index,element) -> Замества елемент ,като губим предишния елемент в списъка (замества)
                        items.add(indexOldItem+1,newItem);
                    }
                    break;
                case "Renew":
                    if (items.contains(item)){
                        items.remove(item);     //изтрива елемента на дадена позиция
                        items.add(item);        //добавяме изтрития елемент в края на списъка
                    }
                    break;
            }


            command=scanner.nextLine();
        }
        //принтираме  крайния списък
        System.out.println(String.join(", ",items));

    }
}
