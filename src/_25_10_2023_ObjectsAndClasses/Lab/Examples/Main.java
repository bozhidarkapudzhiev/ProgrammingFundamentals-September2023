package _25_10_2023_ObjectsAndClasses.Lab.Examples;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Students>students=new ArrayList<>();

        while (true){
            String line=scanner.nextLine();

            if (line.equals("end")){
                break;
            }
            String[] studentsArgs=line.split(" ");
            String firstName=studentsArgs[0];
            String lastName=studentsArgs[1];
            int age=Integer.parseInt(studentsArgs[2]);
            String hometown=studentsArgs[3];

            Students student=new Students(firstName,lastName,age,hometown);
            students.add(student);
        }
        String filterCity=scanner.nextLine();
        for (Students student:students) {
            if (student.getDetails().equals(filterCity)){
                System.out.println(student.getDetails());
            }
        }
    }
}