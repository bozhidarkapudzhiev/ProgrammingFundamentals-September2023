package _25_10_2023_ObjectsAndClasses.Lab._5_Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Students>students=new ArrayList<>();// създаване на списък със студенти
        while (true){ //== while(!"end")
            String line=scanner.nextLine();
            if (line.equals("end")){
                break;
            }
            String[]studentArgs=line.split(" ");
            String firstName=studentArgs[0];
            String lastName=studentArgs[1];
            int age=Integer.parseInt(studentArgs[2]);
            String hometown=studentArgs[3];
            Students student=new Students(firstName,lastName,age,hometown);//създава инстанция на класа Student
            students.add(student);
        }
        String filterCity=scanner.nextLine();

        for (Students student : students){
            if (student.getHometown().equals(filterCity)){
                System.out.println(student.getDetails());
            }
        }
    }
}
