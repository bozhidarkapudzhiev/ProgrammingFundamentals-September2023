package _25_10_2023_ObjectsAndClasses._3_OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine()); //броя на редовете
        List<Person>peopleList=new ArrayList<>();//списък с хора които са въведени

        for (int row = 1; row <=n; row++) {
            String personalData = scanner.nextLine();//"Peter 12".split(" ") ->["Peter","12"]
            String name = personalData.split(" ")[0];//име
            int age = Integer.parseInt(personalData.split(" ")[1]);// възраст

            //проверка  за възрастта
            if (age > 30) {
                Person person = new Person(name, age);//обект от класа Person
                peopleList.add(person);
            }
        }
            //списък от хората над 30 години
            //всеки човек -> отпечатваме
            for (Person person:peopleList) {
                //име - въздраст
                System.out.printf("%s - %d\n",person.getName(),person.getAge());
                }
        }
    }


