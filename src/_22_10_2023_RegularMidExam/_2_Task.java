package _22_10_2023_RegularMidExam;

import java.util.*;
import java.util.stream.Collectors;

public class _2_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> contacts = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String [] commands = scanner.nextLine().split(", ");

        while (!commands[0].equals("Report")) {

        }

    }
}