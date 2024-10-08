package _31_10_2023_AssociativeArrays.Example.TreeMap.UseTreeMapWithObject;

public class Person {
    String name;
    int age;
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
        return getName()+" " +getAge();
    }
}
