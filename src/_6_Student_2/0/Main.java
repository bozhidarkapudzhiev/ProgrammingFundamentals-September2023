package _25_10_2023_ObjectsAndClasses.Lab_6_Student_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<_25_10_2023_ObjectsAndClasses.Lab_6_Student_2.Students>students=new ArrayList<>();// създаване на списък със студенти
        while (true){
            String line=scanner.nextLine();
            if (line.equals("end")){
                break;
            }
            String[]studentArgs=line.split(" ");
            String firstName=studentArgs[0];
            String lastName=studentArgs[1];
            int age=Integer.parseInt(studentArgs[2]);
            String hometown=studentArgs[3];
            _25_10_2023_ObjectsAndClasses.Lab_6_Student_2.Students student=new _25_10_2023_ObjectsAndClasses.Lab_6_Student_2.Students(firstName,lastName,age,hometown);
            students.add(student);
        }
        String filterCity=scanner.nextLine();

        for (_25_10_2023_ObjectsAndClasses.Lab_6_Student_2.Students student : students){
            if (student.getHometown().equals(filterCity)){
                System.out.println(student.getDetails());
            }
        }
    }
}
