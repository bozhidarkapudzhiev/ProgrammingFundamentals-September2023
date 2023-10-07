package _04_10_2023_Mathods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //принтира метода с for- цикъла по зададен рамер
        String firstName=scanner.nextLine();
        int years=Integer.parseInt(scanner.nextLine());
            sayHello(firstName,years);// извикване  на метод sayHello()


    }

    //деклариране на метод sayHello();
    public static void sayHello(String name,int years) {
        String result =String.format("Hello, %s! I'm %d years old.%n",name,years);
       // System.out.printf("Hello, %s! I'm %d years old.%n",name,years);
        System.out.println(result);
    }
}
