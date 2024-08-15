package _25_10_2023_ObjectsAndClasses.Lab._6_Student_2_0;

import java.util.List;

public class Students {
    private String firstName;
    private String lastName;
    private int age;
    private String town;

    public Students(String firstName, String lastName, int age, String town) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.town = town;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getTown() {
        return town;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public static boolean isStudentExisting(List<Students> students, String firstName, String lastName) {
        for (Students student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
                return false;
    }

    public String toString(){
        //John Smith is 16 years old
        //Linda Bridge is 17 years old
        return String.format("%s %s is %d years old",getFirstName(),getLastName(),getAge(),getTown());
    }
}
