package _31_10_2023_AssociativeArrays.Comparator.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Stoyan", 4.5, 25));
        studentList.add(new Student("Petya", 5.5, 23));
        studentList.add(new Student("Ivan", 6.0, 24));
        studentList.add(new Student("Georgi", 3.5, 20));
        studentList.add(new Student("Gergana", 5.5, 24));
        studentList.add(new Student("Nataly", 5.0, 22));
        studentList.add(new Student("Katya", 4.0, 26));
        studentList.add(new Student("Borislav", 5.2, 21));
        //Сортиране по среден успех
        System.out.println("Списък на студентите по среден успех:\n"+
                "Име на студента:\t"+ "Успех:\t"+"Възраст:");
        studentList.sort(Comparator.comparingDouble(Student::getAverageGrades));
        print(studentList);
        //Сортиране по възраст
        studentList.sort(Comparator.comparingInt(Student::getAge));
        System.out.println("Списък на студентите по възраст:\n"+
                "Име на студента:\t"+ "Успех:\t"+"Възраст:");
        print(studentList);

        //Сортиране по средент успех и  име (по  азбучен ред ) при  равен успех
        studentList.sort(Comparator.comparing(Student::getAverageGrades).thenComparing(Student::getName));
        System.out.println();
        System.out.println("Списък на студентите по среден успех и  име (по  азбучен ред ):\n"+
                "Име на студента:\t"+ "Успех:\t"+"Възраст:");
        studentList.forEach(student -> {
            if (student.name.length()<= 7) {
                System.out.printf("%s\t\t\t\t %.2f\t %d\t\n",
                        student.getName(),
                        student.getAverageGrades(),
                        student.getAge());
            }else {
                System.out.printf("%s\t\t\t %.2f\t %d\t\n",
                        student.getName(),
                        student.getAverageGrades(),
                        student.getAge());
            }
        });
    }

    public static void print(List<Student>studentList){
        studentList.forEach(student -> {
            if (student.name.length()<= 7) {
                System.out.printf("%s\t\t\t\t %.2f\t %d\t\n",
                        student.getName(),
                        student.getAverageGrades(),
                        student.getAge());
            }else {
                System.out.printf("%s\t\t\t %.2f\t %d\t\n",
                        student.getName(),
                        student.getAverageGrades(),
                        student.getAge());
            }
        });
        System.out.println();
    }
}
