package _04_10_2023_Mathods;

import java.util.Scanner;

public class ExerciseClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* String firstName=scanner.nextLine();
        Integer age=Integer.parseInt(scanner.nextLine());
            sayHelloName(firstName,age);*/
     /*   String name=scanner.nextLine();
        readName(name);*/
}
    public static void  sayHello(){
        System.out.println("Hello World!");
    }
    public static  void sayHelloName(String name,int age){
        String result=String.format("Hello,%s! I'm %d years old.\n",name,age);
        System.out.printf(result);
    }
   /* public static String readName(String name){
        return  name;
    }*/
}
