package _27_09_2023_Arrays._27_09_2023_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _7_CondenseArraytoNumber1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]firstSeq= Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e->Integer.parseInt(e))
                .toArray();

        int[] temp=new int [firstSeq.length];
        for (int i = 0; i < firstSeq.length; i++) {
            temp[i]=firstSeq[i];
        }
        for (int i = 0; i < firstSeq.length-1; i++) {
            int []current =new int[temp.length-1];
            for (int j = 0; j <= current.length-1; j++) {
                current[j]=temp[j]+temp[j+1];
            }
            temp=current;
        }
        System.out.println(temp[0]);


    }
}
