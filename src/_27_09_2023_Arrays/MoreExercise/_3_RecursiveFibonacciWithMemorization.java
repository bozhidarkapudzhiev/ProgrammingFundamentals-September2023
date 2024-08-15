package _27_09_2023_Arrays.MoreExercise;

import java.util.Scanner;

public class _3_RecursiveFibonacciWithMemorization {
    private static long [] memo;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        if (n<=0){
            System.out.println(0);
        }else{
            memo=new  long[n+1];
            memo[1]=1;
            if (n>1){
                memo[2]=1;
            }
            System.out.println(getFibonacci(n));
        }
    }
    public static int getFibonacci(int n){
        if (memo[n]!=0){
            return (int) memo[n];
        }
        memo[n]=getFibonacci(n-1)+getFibonacci(n-2);
        return (int) memo[n];
    }
}
