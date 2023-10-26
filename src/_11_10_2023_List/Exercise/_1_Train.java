package _11_10_2023_List.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _1_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer>wagons= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity=Integer.parseInt(scanner.nextLine());//максимума във всеки вагано
        String command=scanner.nextLine();
        while (!command.equals("end")){
            //валидна команда
            if (command.equals("Add")){
                //1. "Аdd"= {count}
                int count= Integer.parseInt(command.split(" ")[1]);//броя на  хората в новия вагон
                wagons.add(count);
            }else {
                //2.command={"count"}
                int passengersCount=Integer.parseInt(command);//Брой на хората който  да  добавя в  някой вагон
                for (int wagon = 0; wagon <=wagons.size()-1 ; wagon++) {
                    int passengersPerWagon=wagons.get(wagon);
                    if (passengersPerWagon+passengersCount<=maxCapacity){
                        wagons.set(wagon,passengersPerWagon+passengersCount);
                        break;
                    }
                }
            }
        }
    }
}
