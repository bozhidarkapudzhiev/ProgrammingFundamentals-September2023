package _04_10_2023_Mathods.Task;

import java.util.Scanner;

public class _1_SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber=Integer.parseInt(scanner.nextLine());
        int secondNumber=Integer.parseInt(scanner.nextLine());
        int thirdNumber=Integer.parseInt(scanner.nextLine());

        printSmallestNumber(firstNumber,secondNumber,thirdNumber);
    }

    //нов метод
    //метод който отпечватва  наи-малкото от трите въведени числа
    public  static  void printSmallestNumber(int n1,int n2, int n3){
        // първото число е най  малко
        if(n1<n2 && n1<n3){
            //първото число е най-малко
            System.out.println(n1);
        }else  if (n2<n1 && n2<n3){
            //второто число е най-малко
            System.out.println(n2);
        }else {
            //третото число е най-малко
            System.out.println(n3);
        }
        // II-ри вариант
       /// System.out.println(Math.min(Math.min(n1,n2),n3));
    }
}
