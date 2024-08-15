package _25_10_2023_ObjectsAndClasses.Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class _3_BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        BigInteger fact = factorial(n);
        System.out.println(fact);
    }

    private static BigInteger factorial(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(n).multiply(factorial(n - 1));
        }
    }
}
   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        BigInteger fact=new BigInteger("1");
        for (int i=1;i<=n;i++){
            fact=fact.multiply(BigInteger.valueOf(i));

        }
        System.out.println(fact);

    }*/

