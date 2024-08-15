package _25_10_2023_ObjectsAndClasses.Lab._5_Students;

public class Students {
    private String  firstName;
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

    @Override
    public String toString() {
        return String.format("%s %s is %d years old",getFirstName(),getLastName(),getAge());
    }
}
