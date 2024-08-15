package _31_10_2023_AssociativeArrays.Comparator.Person;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Person {

  String name;
  int age;

  List<Double> grades=new ArrayList<>();
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return getName()+ " - " +getAge();
    }
}
