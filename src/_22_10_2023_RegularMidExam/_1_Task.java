package _22_10_2023_RegularMidExam;

import java.util.Scanner;

public class _1_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            double budget=Double.parseDouble(scanner.nextLine());
            //бюджет=50
            int students=Integer.parseInt(scanner.nextLine());
            //брой студенти=2
            double priceForFlour=Double.parseDouble(scanner.nextLine());
            //цена на 1бр брашно =1.0
            // всеки 5 пакет е безплатен
            double priceSingleEgg=Double.parseDouble(scanner.nextLine());
            //цена за 1бр яйце=0.10
            double priceForSingleApron=Double.parseDouble(scanner.nextLine());
            //цена за 1бр престилка=10.00 + 20%/100 //изход закръглено до  цяло число нагоре
        priceForSingleApron=priceForSingleApron*students;
        double addApron=priceForSingleApron+((priceForSingleApron*20)/100);
        priceSingleEgg=(priceSingleEgg*10*students);
        priceForFlour=priceForFlour*students;
        double allSum=addApron+priceSingleEgg+priceForFlour;
        /*for (int i = 0; i < students; i++) {
            if (students==5){

            }*/
        }
        }



