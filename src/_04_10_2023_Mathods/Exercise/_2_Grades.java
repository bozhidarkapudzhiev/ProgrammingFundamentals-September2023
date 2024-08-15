package _04_10_2023_Mathods.Exercise;

import java.util.Scanner;

public class _2_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double gradeScan=Double.parseDouble(scanner.nextLine());
        grades(gradeScan);
    }
    public static String grades(double grade){
        String gradeWords="";
        if (grade>=2.00 && grade<=2.99){
            gradeWords="Fail";
        }else if (grade>=3.00 && grade<=3.49){
            gradeWords="Poor";
        }else if (grade>=3.50 &&grade<=4.49){
            gradeWords="Good";
        }else if (grade>=4.50 && grade<=5.49){
            gradeWords="Very good";
        }else if (grade>=5.50 && grade<=6.00){
            gradeWords="Excellent";
        }
        System.out.printf("%s",gradeWords);
        return  gradeWords;
    }
}
