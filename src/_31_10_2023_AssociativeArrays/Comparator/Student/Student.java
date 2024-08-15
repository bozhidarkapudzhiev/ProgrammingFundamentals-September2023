package _31_10_2023_AssociativeArrays.Comparator.Student;

import java.util.List;

public class Student {
    //Име на студента
    String name;
    //Среден успех
    double averageGrades;
    int  age;

    public Student(String name, double averageGrade ,int age) {
        this.name = name;
        this.averageGrades=averageGrade;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageGrades() {
        return averageGrades;
    }

    public void setAverageGrades(double averageGrades) {
        this.averageGrades = averageGrades;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
