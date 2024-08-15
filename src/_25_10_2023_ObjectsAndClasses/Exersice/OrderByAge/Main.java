package _25_10_2023_ObjectsAndClasses.Exersice.OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<OrderByAge> orderByAges = new ArrayList<>();
        String lines = scanner.nextLine();
        OrderByAge orderByAge=null;
        while (!lines.equals("End")) {
            String[] line = lines.split("\\s+");
            String name = line[0];
            String id = line[1];
            int age = Integer.parseInt(line[2]);
            orderByAge = new OrderByAge(name, id, age);
            orderByAges.add(orderByAge);
            lines = scanner.nextLine();
        }
        orderByAges.sort(Comparator.comparing(OrderByAge::getAgePerson));
        for (int i = 0; i < orderByAges.size(); i++) {
            String line= String.valueOf(orderByAges.get(i));
            System.out.println(line.toString());
        }

        //Stephan with ID: 524244 is 10 years old.
    }
}
