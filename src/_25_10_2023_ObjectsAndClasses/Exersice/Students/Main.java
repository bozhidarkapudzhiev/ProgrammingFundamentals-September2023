package _25_10_2023_ObjectsAndClasses.Exersice.Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        List<Students>studentsList=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] line=scanner.nextLine().split("\\s+");
            String firstName=line[0];
            String lastName=line[1];
            double grades=Double.parseDouble(line[2]);
            Students students=new Students(firstName,lastName,grades);
            studentsList.add(students);
        }
        studentsList.sort(Comparator.comparingDouble(Students::getGrades));
        for (int i = studentsList.size()-1; i >=0; i--) {
            System.out.println(studentsList.get(i));
        }
    }
}
