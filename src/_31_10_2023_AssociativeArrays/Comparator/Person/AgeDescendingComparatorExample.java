package _31_10_2023_AssociativeArrays.Comparator.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AgeDescendingComparatorExample {
    public static void main(String[] args) {
        List<Person> people=Arrays.asList(
                new Person("Alice",30),
                new Person("Bob",25),
                new Person("Charlie",35),
                new Person("David",22)
        );
        //Сортиране по възраст в низходящ ред
        people.sort(Comparator.comparingInt((Person person)->person.getAge()).reversed());

        //Отпечатване на резултата
        people.forEach(System.out::println);
    }
}
