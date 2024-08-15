package _11_10_2023_List.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _3_MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listFirst = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> listSecond = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        mergingList(listFirst, listSecond);
    }

    public static void mergingList(List<Integer> first, List<Integer> second) {
        List<Integer> result = new ArrayList<>();
        while (!first.isEmpty()&& !second.isEmpty()){
            result.add(first.get(0));
            result.add(second.get(0));
            first.remove(0);
            second.remove(0);
        }if (!first.isEmpty()){
            while (!first.isEmpty()){
                result.add(first.get(0));
                first.remove(0);
            }
        }else if (!second.isEmpty()){
            while (!second.isEmpty()){
                result.add(second.get(0));
                second.remove(0);
            }
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i)+" ");
        }
    }
}