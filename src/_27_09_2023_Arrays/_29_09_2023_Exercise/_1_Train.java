package _27_09_2023_Arrays._29_09_2023_Exercise;

import java.util.Scanner;

public class _1_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int[]train=new int[n];
        int sumPeopleOfTrain=0;
        for (int i = 0; i < n; i++) {
            int countPeople=Integer.parseInt(scanner.nextLine());
            train[i]=countPeople;
            sumPeopleOfTrain+=countPeople;
        }
        for (int i = 0; i < train.length; i++) {
            System.out.printf("%d ",train[i]);
        }
        System.out.printf("\n%d\n",sumPeopleOfTrain);
    }
}
