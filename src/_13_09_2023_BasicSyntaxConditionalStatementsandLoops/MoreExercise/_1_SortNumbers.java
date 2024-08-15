package _13_09_2023_BasicSyntaxConditionalStatementsandLoops.MoreExercise;

import java.util.*;
import java.util.stream.Collector;

public class _1_SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int three = Integer.parseInt(scanner.nextLine());
        List<Integer> list = new ArrayList<>();
        list.add(first);
        list.add(second);
        list.add(three);
        Collections.sort(list);
        Collections.reverse(list);
        list.forEach(System.out::println);
        System.out.println();
    }
}

