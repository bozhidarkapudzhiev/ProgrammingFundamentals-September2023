package _20_09_2023_DataTypeAndVariable.Lab;

import java.util.Scanner;

public class _12_RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= Integer.parseInt(scanner.nextLine());
        int allNumbers=0;
        int currentNumber=0;
        boolean isEqualsSpecialNumbers=false;
        for (int i=1;i<=n;i++) {
            currentNumber = i;
            while (i > 0) {
                allNumbers += i % 10;
                i = i / 10;
            }
            isEqualsSpecialNumbers = (currentNumber == 5) || (currentNumber == 7) || currentNumber == 11;
            if (isEqualsSpecialNumbers==true){
                System.out.printf("%d -> True\n", currentNumber);
            }else {
                System.out.printf("%d -> False\n",currentNumber);
            }

            allNumbers = 0;
            i = currentNumber;
        }
    }
}
