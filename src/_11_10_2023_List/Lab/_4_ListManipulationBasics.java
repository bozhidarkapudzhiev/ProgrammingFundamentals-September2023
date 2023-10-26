package _11_10_2023_List.Lab;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class _4_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //четене  на лист от цели числа от  конзолата
      List<Integer> numbersList=Arrays.stream(scanner.nextLine().split(" "))
              .map(e ->Integer.parseInt(e)).collect(Collectors.toList());
      String input=scanner.nextLine();
      while (!input.equals("end")){
          String[] commandArr=input.split(" ");
          String command=commandArr[0];

          switch (command){
              case "Add":
                  int numToAdd=Integer.parseInt(commandArr[1]);
                  numbersList.add(numToAdd);
                  break;
              case "Remove":
                  int numToRemove=Integer.parseInt(commandArr[1]);
                  numbersList.remove(Integer.valueOf(numToRemove));
                  break;
              case "RemoveAt":
                  int indexToRemove=Integer.parseInt(commandArr[1]);
                  numbersList.remove(indexToRemove);
                  break;
              case "Insert":
                  int numToIndert=Integer.parseInt(commandArr[1]);
                  int insertIndex=Integer.parseInt(commandArr[2]);
                  numbersList.add(insertIndex,numToIndert);
                  break;
          }
          input=scanner.nextLine();
      }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]",""));
    }

}
