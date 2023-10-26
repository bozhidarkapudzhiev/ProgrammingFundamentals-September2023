package MidExample._18_10_2023;

import java.util.Scanner;

public class _1_GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.входни данни
        double foodInKg=Double.parseDouble(scanner.nextLine());//храна за 1 месец
        //  double foodInKg=Double.parseDouble(scanner.nextLine())*1000;= ->   //2.преобразуване  в грамове

        double hayInKg=Double.parseDouble(scanner.nextLine());//сено  за 1 месец
        double coverInKg=Double.parseDouble(scanner.nextLine());//покривало за 1 месец
        double pigWeight=Double.parseDouble(scanner.nextLine());//килограми на м.свинче

        //2.преобразуване  в грамове
        double foodInGrams=foodInKg*1000;//храна за 1 месец (грамове)
        double hayInGrams=hayInKg*1000;//сено  за месец в(грамове)
        double coverInGrams=coverInKg*1000;//покривало за  1 месец (грамове)
        double pigWeightInGrams=pigWeight*1000;//тегло на м.свинче(грамове


        for (int day = 1; day<=30 ; day++) {
            //всеки ден  м.свинче яде по 300 гр
            //от общото количество изваждаме 300 гр на ден
            foodInGrams-=300;
            //на  всеки втори ден
            if (day % 2 == 0){
                //сено = 5% от останалата храна
                double neededHay=0.05*foodInGrams;
                hayInGrams-=neededHay;
            }
            //на всеки трети ден -> сменя покривалото
            if (day % 3 ==0){
                double coverNeeded = pigWeightInGrams/3; //нужното покривало за смяна -> големимната на м.свинче /3
                coverInGrams-=coverNeeded;

            }
            //проверка дали някой  от консумативите е свършил
            if (foodInGrams<=0 || hayInGrams<=0 || coverInGrams<=0){
                System.out.println("Merry must go to the pet store!");
                return;                                            //прекратяваме цялата програма
            }
        }
        //преминали 30-те дни
        System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",
                foodInGrams/1000,hayInGrams/1000,coverInGrams/1000);// foodInGrams/1000 -> kg (преобразуване  на грам  в килограм)

    }
}
