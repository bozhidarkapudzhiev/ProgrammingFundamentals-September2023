package _11_10_2023_List.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _4_ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String lines = scanner.nextLine();
        while (!lines.equals("End")) {
            String[] line = lines.split("\\s+");
            String command = "";
            int numbers = 0;
            int position=0;
            if (line.length <= 2) {
                command = line[0];
                numbers = Integer.parseInt(line[1]);
            }else {
                if(!line[0].equals("Insert")&&!line[0].equals("Remove")&&!line[0].equals("Add")){
                command=line[0].concat(" ".concat(line[1]));
                numbers=Integer.parseInt(line[2]);
                }else {
                    command=line[0];
                    numbers=Integer.parseInt(line[1]);
                    position=Integer.parseInt(line[2]);
                }
            }
            switch (command) {
                //•	Add {number} - add number at the end
                case "Add":
                    add(list, numbers);
                    break;
                //•	Remove {index} - remove that index
                case "Remove":
                    remove(list, numbers);
                    break;
                //•	Shift left {count} - first number becomes last 'count' times
                case "Shift left":
                    shiftLeft(list,numbers);
                    break;
                //•	Insert {number} {index} - insert number at given index
                case "Insert":
                    insert(list,numbers,position);
                    break;
                //•	Shift right {count} - last number becomes first 'count' times
                case "Shift right":
                    shiftRight(list,numbers);
                    break;

                //
            }
            lines = scanner.nextLine();

        }
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

    }

    public static List<Integer> add(List<Integer> list, int numbers) {
        list.add(numbers);
        return list;
    }

    public static List<Integer> remove(List<Integer> list, int numbers) {
       try{
           list.remove(numbers);
       }catch (IndexOutOfBoundsException e){
           System.out.println("Invalid index");
       }

        return list;
    }

    public static List<Integer> shiftLeft(List<Integer> list, int number) {
        for (int i = 0; i < number; i++) {
            int firstElement = list.get(0);
            list.add(firstElement);
            list.remove(list.get(0));
        }
        return list;
    }
    public static List<Integer>insert(List<Integer>list,int number,int position){
        //•	Insert {number} {index}  Въведете номер в даден индекс
        try{
            list.add(position,number);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }
        return list;
    }
    public static List<Integer>shiftRight(List<Integer> list,int number){

        int listSize=list.size();

    for (int i=0;i<number;i++){
        int lastNumber= list.get(list.size()-1);
        list.add(0,lastNumber);
        list.remove(list.size()-1);
    }
        return list;
    }

}
//43 20 5 1 23 29 18