package _25_10_2023_ObjectsAndClasses.Lab._1_Dice;

import java.util.Scanner;

public class mainDice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dice dice=new Dice(3);//определяме стойноста -> колко страни ще има

        //dice.setSides(6);
        System.out.println(dice.getSides());
        dice.setSides(6);//променяме стойността
        System.out.println(dice.getSides());
    }
}
