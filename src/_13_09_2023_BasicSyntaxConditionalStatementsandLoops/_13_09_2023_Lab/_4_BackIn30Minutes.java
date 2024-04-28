package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._13_09_2023_Lab;

import java.util.Scanner;

public class _4_BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour=Integer.parseInt(scanner.nextLine());
        int minute=Integer.parseInt(scanner.nextLine());

        minute+=30;

        if (minute>59){
            hour+=1;
            minute-=60;
            if (hour>23){
                hour=0;
            }
        }
        if (minute<10){
            System.out.printf("%d:0%d",hour,minute);
        }else {
            System.out.printf("%d:%d",hour,minute);
        }
    }
}
