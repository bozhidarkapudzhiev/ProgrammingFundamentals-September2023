package _25_10_2023_ObjectsAndClasses.Lab;

public class _5_Students {

        private String firstName;
        private String lastName;
        int age;
    private String homeTown;


    public _5_Students(String firstName, String lastName, int age, String homeTown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeTown = homeTown;
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

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDetails(){
        return String.format("%s %s is %d years old",
        this.firstName,this.lastName,this.age);
    }

}
