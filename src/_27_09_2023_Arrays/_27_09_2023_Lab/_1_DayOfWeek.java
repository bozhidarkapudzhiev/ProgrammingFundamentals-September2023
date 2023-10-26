package _27_09_2023_Arrays._27_09_2023_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _1_DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days=Integer.parseInt(scanner.nextLine());
        String[] dayOfWeek={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        if (days>=1 && days<=7){
            System.out.println(dayOfWeek[days-1]);
        }else {
            System.out.println("Invalid day!");
        }

    }

}
