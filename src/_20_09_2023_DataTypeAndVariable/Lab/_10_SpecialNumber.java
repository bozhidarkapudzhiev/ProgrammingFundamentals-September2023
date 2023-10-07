package _20_09_2023_DataTypeAndVariable.Lab;

import java.util.Scanner;

public class _10_SpecialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=n ; i++) {
            int sum=0;
            int num=i;
            for (int j=0;j<=i;j++){
                sum+=num%10;
                num/=10;
            }
            if (sum%5==0||sum%7==0||sum%11==0){
                System.out.printf("%d -> True\n",i);
            }else{
                System.out.printf("%d -> False\n",i);
            }
        }
    }
}
