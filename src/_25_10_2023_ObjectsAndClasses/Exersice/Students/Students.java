package _25_10_2023_ObjectsAndClasses.Exersice.Students;

public class Students {
    String firstName;
    String lastName;
    double grades;

    public Students(String firstName, String lastName, double grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
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

    public double getGrades() {
        return grades;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }
    public String toString(){
        //Rocco Erben: 6.00
        return   String.format("%s %s: %.2f",getFirstName(),getLastName(),getGrades());
    }
}
