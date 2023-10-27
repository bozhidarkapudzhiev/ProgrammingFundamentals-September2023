package _27_09_2023_Arrays._27_09_2023_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _1_DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int day=Integer.parseInt(scanner.nextLine());// прочитаме цяло число
        String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        //създаваме масив от String  с дните от седмицата
        if (day>=1&&day<=7){           // проверяваме дали дали прочетеното число е между 1 и 7
            System.out.println(days[day-1]);//ако  е между  1 и 7 изваждаме  -1  и извеждаме в  конзолата
        }else {
            System.out.println("Invalid day!");//в противен случай печаме съобщение "Invalid day!"
        }



    }
}
