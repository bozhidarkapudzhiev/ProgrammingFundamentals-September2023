package _25_10_2023_ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainStudents_2_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<_5_Students> students = new ArrayList<>();
        String line;
        while (true) {
            line = scanner.nextLine();
            if (line.equals("end")) {
                break;
            }

            String[] studentArgs = line.split(" ");
            String firstName = studentArgs[0];
            String lastName = studentArgs[1];
            int age = Integer.parseInt(studentArgs[2]);
            String hometown = studentArgs[3];
            _5_Students student = new _5_Students(firstName, lastName, age, hometown);
            students.add(student);

        }
        String filterCity=scanner.nextLine();
        for (_5_Students student:students) {
            if (student.getHomeTown().equals(filterCity)){
                System.out.println(student.getDetails());
            }
        }
    }
}
