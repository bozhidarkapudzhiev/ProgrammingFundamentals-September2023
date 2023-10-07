package _27_09_2023_Arrays._27_09_2023_Lab;

import java.util.Scanner;

public class _2_PrintNumbersinReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int [] numbers=new int [n];
        for (int i = 0; i < n; i++) {
            numbers[i]=Integer.parseInt(scanner.nextLine());
        }
        for (int i = n-1; i >=0 ; i--) {
            System.out.printf("%d ",numbers[i]);
        }
        System.out.println();

    /* int n=Integer.parseInt(scanner.nextLine());
        int [] numbers=new int [n];
     for (int i = 0; i < n; i++) {
            numbers[i]=Integer.parseInt(scanner.nextLine());
        }*/
        //String.join()
      /*      for (int i = n-1; i >=0 ; i--) {
                System.out.printf("%d ",numbers[i]);
            }
            System.out.println(String.join(" ",
                    Arrays.stream(numbers)
                    .mapToObj(e->String.valueOf(e))
                    .toArray(String[]::new));
    */
    }
}
