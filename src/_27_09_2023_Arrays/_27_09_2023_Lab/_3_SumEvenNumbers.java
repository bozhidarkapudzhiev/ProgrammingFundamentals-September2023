package _27_09_2023_Arrays._27_09_2023_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _3_SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int[] number = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e->Integer.parseInt(e))
                .toArray(); ;
             for (int i =0; i < number.length; i++) {
                if (number[i]%2==0){
                    sum+=number[i];
                }
        }
            System.out.println(sum);
            
        }

    }
