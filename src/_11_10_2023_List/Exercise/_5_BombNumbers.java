package _11_10_2023_List.Exercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _5_BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new java.util.ArrayList<>(Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).toList());
        List<Integer> bombInfo = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).toList();
          int bombNumber = bombInfo.get(0);
             int bombPower = bombInfo.get(1);

             while (list.contains(bombNumber)) {
                 int index = list.indexOf(bombNumber);
                 int start = Math.max(0, index - bombPower);
                 int end = Math.min(list.size() - 1, index + bombPower);
     
                 for (int i = end; i >= start; i--) {
                     list.remove(i);
                 }
             }

             int sum = list.stream().mapToInt(Integer::intValue).sum();
             System.out.println(sum);












    }
}
