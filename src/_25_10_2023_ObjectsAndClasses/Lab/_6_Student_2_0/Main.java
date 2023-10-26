package _25_10_2023_ObjectsAndClasses.Lab._6_Student_2_0;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Students> students = new ArrayList<>();// създаване на списък със студенти
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("end")) {
                break;
            }
            String[] studentArgs = line.split(" ");
            String firstName = studentArgs[0];
            String lastName = studentArgs[1];
            int age = Integer.parseInt(studentArgs[2]);
            String hometown = studentArgs[3];

            Students student=findStudent(students,firstName,lastName);
            if (student!=null){
                student.setAge(age);
                student.setHometown(hometown);
            }else {
                students.add(new Students(firstName,lastName,age,hometown));

            }

/*         boolean exists = false;
    for (Students student : students) {
                if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                    student.setAge(age);
                    student.setHometown(hometown);
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                Students student = new Students(firstName, lastName, age, hometown);
                students.add(student);
            }*/ //
        }

        String filterCity = scanner.nextLine();

        for (Students student : students) {
            if (student.getHometown().equals(filterCity)) {
                System.out.println(student.getDetails());
            }
        }
    }

    public static Students findStudent(List<Students> students, String firstName, String lastName) {
        for (Students student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
            return student;
            }
        }
        return  null;
    }
}


