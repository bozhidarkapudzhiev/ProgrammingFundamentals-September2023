package _13_09_2023_BasicSyntaxConditionalStatementsandLoops.MoreExercise;

import java.util.Scanner;

public class _1_SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first=0;
        int second=0;
        int third=0;

        for (int i=1;i<=3;i++){
            int n=Integer.parseInt(scanner.nextLine());
            if (i==1){
                first=n;
            } else if (i==2) {
                if (n>first){
                    second=first;
                    first=n;
                }else {
                    second=n;
                }
            }else {
                if (n>first){
                    third=second;
                    second=first;
                    first=n;
                }else if (n>second){
                    third=second;
                    second=n;
                }else {
                    third=n;
                }
            }
        }
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}
