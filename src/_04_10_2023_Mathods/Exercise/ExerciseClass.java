package _04_10_2023_Mathods.Exercise;

import java.util.Scanner;

public class ExerciseClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* String name =scanner.nextLine();
       Integer age=Integer.parseInt(scanner.nextLine());
       sayHello(name,age );*/
    /*    System.out.println((readFullName(scanner)));*/
    double number=Double.parseDouble(scanner.nextLine());
    double power=Double.parseDouble(scanner.nextLine());
        System.out.println(pow(number,power));

    }
    public static  double pow(double number,double power){
        double result =1;
        for (int i = 0; i < power; i++) {
            result*=power;
        }
        return result;
    }

   /* public static void sayHello(String name,int age) {
        String result=String.format("Hello ,%s!I'm %d years old.%n",name,age);
        System.out.print(result);
    }*/
  /*  public static String readFullName(Scanner scanner){
        String firstName=scanner.nextLine();
        String lastName=scanner.nextLine();
        return  String.format("%s %s",firstName,lastName);

    }*/
}
