package _11_10_2023_List.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _2_ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list= Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String lines =scanner.nextLine();
        while (!lines.equals("end")){
            list(list, lines);
            lines=scanner.nextLine();

        }
        for (Integer integer : list) {
            System.out.printf("%d ",integer);
        }

    }

    public static List<Integer>list(List<Integer>list,String lines){
        String[] line=lines.split("\\s+");
        String command=line[0];
        int numbers=Integer.parseInt(line[1]);
        switch (command){
            case "Delete":
                for (int i = 0; i < list.size(); i++) {
                    int currentNum=list.get(i);
                    if (currentNum==numbers){
                        list.remove(list.get(i));
                    }

                }

                break;
            case "Insert":
                numbers=Integer.parseInt(line[1]);
                int position=Integer.parseInt(line[2]);
                list.add(position,numbers);
                break;
        }

        return new ArrayList<>(list.size());
    }

}
