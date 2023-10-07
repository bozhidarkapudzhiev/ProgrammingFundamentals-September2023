package _27_09_2023_Arrays._27_09_2023_Lab;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      //  int size=Integer.parseInt(scanner.nextLine());
        //int []numbers=new int[20];
          /*  if (index>=0&&index<=numbers.length-1){
                System.out.println(numbers[index]);
            }else {
                System.out.println("Invalid index");
            }*/
        /*    for (int i=0;i<numbers.length/2;i++){
                numbers[i]=i*10;

            }*/
        /*    for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
            System.out.println();*/

        /*String[] elements=scanner.nextLine().split(" ");
        int []numbers=new int[elements.length];
        for (int i=0;i<elements.length;i++){
            numbers[i]=Integer.parseInt(elements[i]);
        }
        System.out.println();*/

        // 10 20 30 40
        //Обръщане на  числа от тип String към int
        /*
             int[] number= Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(e->Integer.parseInt(e))
                        .toArray();
              for (int i=0;i<number.length;i++){
                  System.out.print(number[i]+" ");
              }
        */

        //Обръщане на  числа от тип  int към String
       /*     int[] number= Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(e->Integer.parseInt(e))
                    .toArray();
        String [] numbersAsString=Arrays.stream(number)
                    .mapToObj(e->String.valueOf(e))
                    .toArray(String[]::new);
        for (String numbers:numbersAsString){
            System.out.print(numbers+" ");
        }*/


    }

}
