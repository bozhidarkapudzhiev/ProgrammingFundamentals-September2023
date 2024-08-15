package _27_09_2023_Arrays._29_09_2023_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _3_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        /**
         * 1 10 31 20
         * 5 9 81 41
         */

        int [] firstArr=new int [n];
        int [] secondArr=new int [n];
        for (int i = 0; i <n ; i++) {
            int [] arr=Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int firstN=arr[0];
            int secondN=arr[1];
            if (i%2!=0){
                firstArr[i]=firstN;
                secondArr[i]=secondN;
            }else {
              firstArr[i]=secondN;
               secondArr[i]=firstN;
            }
        }
        for (int i = 0; i < secondArr.length; i++) {
            System.out.print(secondArr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < firstArr.length; i++) {
            System.out.print(firstArr[i]+" ");
        }
    }
}
