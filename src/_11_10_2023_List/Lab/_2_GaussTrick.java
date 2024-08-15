package _11_10_2023_List.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class _2_GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
       gaussTrick(list);
    }

    public static void gaussTrick(List<Integer> list) {
     List<Integer>resultList=new ArrayList<>();
     int size=list.size();
        for (int i = 0; i <size/2; i++) {
          int sum=list.get(i)+list.get(size-1-i);
          resultList.add(sum);
        }
        if (size%2!=0){
            resultList.add(list.get(size/2));
        }
       for (int i=0;i<resultList.size();i++){
           System.out.print(resultList.get(i));
           if (i<resultList.size()-1){
               System.out.print(" ");
           }
       }
    }
}
