package _27_09_2023_Arrays._29_09_2023_Exersice;

import java.util.Arrays;
import java.util.Scanner;

public class _8_MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []number= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int  magicSum=Integer.parseInt(scanner.nextLine());
        //1.обхождаме всички числа от масива
        for (int index=0;index<=number.length-1;index++){
            int cutterNumber=number[index];
            //обхождам всички след него
            for (int i=index+1;i<=number.length-1;i++){ //всички числа след моето
                int nextNumber=number[i];//числото след моето
                // currentNumber   nextNumber
                if (cutterNumber+nextNumber==magicSum){
                    System.out.println(cutterNumber+" "+nextNumber);
                }

            }
        }
    }
}
