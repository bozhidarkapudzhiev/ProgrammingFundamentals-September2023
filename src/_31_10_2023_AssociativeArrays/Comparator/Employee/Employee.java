package _31_10_2023_AssociativeArrays.Comparator.Employee;

import java.time.LocalDate;

public class Employee {
    String name;
    LocalDate birthDate;

    public Employee(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return  name+" - "+birthDate;
    }
}
