package _25_10_2023_ObjectsAndClasses.Lab.Examples;

public class Students {
  private String firstName;
  private String lastName;
  private String hometown;

  private int age;
    public Students(String firstName, String lastName, int age, String hometown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hometown = hometown;
        this.age=age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getDetails(){
        return String.format("%s %s is %d years old.",firstName,lastName,age);
    }
}
