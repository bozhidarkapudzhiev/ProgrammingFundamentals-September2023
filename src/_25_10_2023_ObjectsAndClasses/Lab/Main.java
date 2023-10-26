package _25_10_2023_ObjectsAndClasses.Lab;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        LocalDate localDate1=LocalDate.of(2023,10,25);// инстанция (localDate1) на класа LocalDate -> instance(Инстанциране)
        LocalDate localDate2=LocalDate.of(2023,5,10);// инстанция (localDate) на класа LocalDate -> instance(Инстанциране)
        /Клас/  ->  /обект/      ->     /инстанция на обекта/

        */
      /*  List<Integer>num=new ArrayList<>();
        int result=Math.abs(-123);
        System.out.println(result);//връща абсолютната стойност*/

        //1.Random Words -> Random  думи
        int n=Integer.parseInt(scanner.nextLine());
        BigInteger result=BigInteger.valueOf(1);
        for (int i=1;i<=n;i++){
            result=result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);


    }
}
