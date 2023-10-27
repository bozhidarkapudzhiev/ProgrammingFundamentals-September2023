package _27_09_2023_Arrays._27_09_2023_Lab;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class _3_SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        BigInteger result=BigInteger.valueOf(1);
        for (int i = 1; i <=n; i++) {
            result=result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);
    }

}