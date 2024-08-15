package _27_09_2023_Arrays._27_09_2023_Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _1_DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int daysNumber= Integer.parseInt(scanner.nextLine());
        String[] weeks= {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (daysNumber>=1 && daysNumber<=7){
            System.out.println(weeks[daysNumber-1]);
        }else{
            System.out.println("Invalid day!");
        }
    }
}
