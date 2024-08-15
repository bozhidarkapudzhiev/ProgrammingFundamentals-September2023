package _11_10_2023_List.Lab;

import com.sun.source.tree.IfTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _5_ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String lines = scanner.nextLine();

        while (!lines.equals("end")) {
            String[] line = lines.split("\\s+");
            String command = line[0];
            if (!command.equals("Contains") && !command.equals("Filter")) {
                command = line[0].concat(" ".concat(line[1]));
            }
            switch (command) {
                case "Contains":
                    int number = Integer.parseInt(line[1]);
                    contains(integerList, line[0], number);
                    break;
                case "Print even":
                case "Print odd":
                    printEvenOrOdd(integerList, lines);
                    break;
                case "Get sum":
                    getSum(integerList, lines);
                    break;
                case "Filter":
                    filter(integerList, line[1], Integer.parseInt(line[2]));
                    break;
            }
            lines = scanner.nextLine();
            }

        }


    public static void contains(List<Integer> integerList, String line, int number) {
        if (integerList.contains(number)) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }

    public static void printEvenOrOdd(List<Integer> integerList, String line) {
        List<Integer> evenNumbers = new ArrayList<>();
        if (line.equals("Print even")) {
            for (int i = 0; i < integerList.size(); i++) {
                if (integerList.get(i) % 2 == 0) {
                    int current = integerList.get(i);
                    evenNumbers.add(current);
                }
            }
        } else if (line.equals("Print odd")) {
            for (int i = 0; i < integerList.size(); i++) {
                if (integerList.get(i) % 2 != 0) {
                    int current = integerList.get(i);
                    evenNumbers.add(current);
                }
            }
        }
        for (int i = 0; i < evenNumbers.size(); i++) {
            System.out.print(evenNumbers.get(i) + " ");
        }
        System.out.println();

    }

    public static int getSum(List<Integer> integerList, String line) {
        int sum = 0;
        for (int i = 0; i < integerList.size(); i++) {
            sum += integerList.get(i);
        }
        System.out.println(sum);
        return sum;
    }

    //Filter >= 43
    //Filter < 100
    public static void filter(List<Integer> integerList, String condition, int number) {
        List<Integer> filteredList = new ArrayList<>();
        switch (condition) {
            case ">":
                for (int num : integerList) {
                    if (num > number) {
                        filteredList.add(num);
                    }
                }
                break;
            case ">=":
                for (int num : integerList) {
                    if (num >= number) {
                        filteredList.add(num);
                    }
                }
                break;
            case "<":
                for (int num : integerList) {
                    if (num < number) {
                        filteredList.add(num);
                    }
                }
                break;
            case "<=":
                for (int num : integerList) {
                    if (num <= number) {
                        filteredList.add(num);
                    }
                }
                break;
        }
        for (int num : filteredList) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


