package _11_10_2023_List.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _2_ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //
        List<Integer>numbers= Arrays.stream(scanner.nextLine()//"1 2 3 4 5 6"
                .split(" "))               //"1" "2" 3" 4" "5" "5" "5" "6"
                .map(Integer::parseInt)         //{1, 2, 3, 4, 5, 5, 5, 6}
                .collect(Collectors.toList());   //{1, 2, 3, 4, 5, 5, 5, 6}

        String command=scanner.nextLine();
         // repeat:  въвеждаме  команда
        // stop:  command=="end"
        //continue: command!="end"
        while(!command.equals("end")){
             //1.command="Delete 4".split(" ") -> ["Delete","4"]
            int numberForDelete=Integer.parseInt(command.split(" ")[1]);//число което ще премахвам
            //премехвам всички  елементи който са равни на numberForDelete
            numbers.removeAll(Arrays.asList(numberForDelete));
            if (command.contains("Delete")){
                //1. command="Delete 4"
            }else if(command.equals("Insert")){
                //2.command="Insert 2 0".split{" "}->["Insert","2","0"]
                int element=Integer.parseInt(command.split(" ")[1]);//елеметът , който трябва да вмъкна
                int position=Integer.parseInt(command.split(" ")[2]);//индекс за
                //вмъквам дадения елемент на дадената позиция
                numbers.add(position,element);
            }
            command=scanner.nextLine();
        }
        // списък с числа -> печатане-> {3,4,5,6}
        for (int number:numbers ) {
            System.out.print(number+" ");
        }
    }
}
