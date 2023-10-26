package _11_10_2023_List.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _4_ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer>numbers= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command=scanner.nextLine();
        while (!command.equals("End")){
            /*
            * 1.command=Add {number}
            • 2.command=Insert {number} {index}
            • 3.command=Remove {index}
            • 4.command=Shift left {count}
            • 5.command=Shift right {count}
            */

            command=scanner.nextLine();
            if (command.contains("Add")){
                //1.command="Add 3".split() -> ["Add", "3"]
                int numberToAdd=Integer.parseInt(command.split(" ")[1]);
                numbers.add(numberToAdd);
                //add number at the end
            } else if (command.contains("Insert")) {
                //2.command="Insert 24 1".split("")->["Insert","24","1"]
                //insert number at given index
                int numberToInsert=Integer.parseInt(command.split(" ")[1]);
                int index=Integer.parseInt(command.split(" ")[2]);
                numbers.add(index,numberToInsert);
            }else if(command.equals("Remove")){
                //2.command="Remove 1".split(" ") ->["Remove","1"]
                //remove that index

                int indexToRemove=Integer.parseInt(command.split(" ")[1]);
                numbers.remove((indexToRemove));
            }else if (command.equals("Shift left")){
                //4.command= "Shift left 3".split(" ")-> ["Shift", "left","3"]
                int countShiftLeft=Integer.parseInt(command.split(" ")[2]);

               for (int i=0;i<countShiftLeft;i++){
                   //повтаряме: shift-left :първото число  става последно
                   //{1,23,29,18,43,21,20}
                   //1. взимампървото число -> 1
                   int firstElement=numbers.get(0);
                   //2.премахвам го  -> {23,29,18,43,21,20}
                   numbers.remove(0);
                   //3.поставям го като последно -> {23,29,18,43,21,20,1}
                   numbers.add(firstElement);
               }


            }else if (command.equals("Shift right")){
                //5.command= "Shift right 5".split(" ")-> ["Shift","right","5"]
                //last number becomes first 'çount' times
                int countShiftRight=Integer.parseInt(command.split(" ")[2]);
                //

            }
        }


    }
}
