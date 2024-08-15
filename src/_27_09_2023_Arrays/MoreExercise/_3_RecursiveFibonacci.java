package _27_09_2023_Arrays.MoreExercise;

import java.util.Scanner;

public class _3_RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        if (n <= 0) {
            System.out.println(0);
        } else {
            System.out.println(getFibonacci(n));
        }
    }

    public static long getFibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }
/*    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        long [] fibonacci= new long[n+1];
        if (n>=0){
            fibonacci[0]=0;
        }if (n>=1){
            fibonacci[1]=1;
        }
        for (int i = 2; i <= n; i++) {
            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
        }
        System.out.println(fibonacci[fibonacci.length-1]);
    }*/
}
