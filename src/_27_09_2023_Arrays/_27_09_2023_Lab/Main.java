package _27_09_2023_Arrays._27_09_2023_Lab;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //създаваме масив и  инициализираме  колко голям  искаме да  бъде той .
        //колко  елеманта ще съдържа масивът ( new int[20])

        Scanner scanner = new Scanner(System.in);
      //  int index=Integer.parseInt(scanner.nextLine());
        //инициализиране на  масив
       //  int []number= new int[50];
         //промяна на елемент в масив
         //number[5]=5;
         //извеждане на елемент от  масива

     /*   for (int i = 0; i <number.length ; i++) {
          number[i]=i*10;
        }

        //traversing == // array traversal // обьождане на масив
      /*  for (int i = 0; i <number.length; i++) {
            System.out.println(number[i]);
        }*/

        // запълване на клетки на  50% /* number.length/2 */
   /*    for (int i = 0; i <number.length/2; i++) {
            System.out.println(number[i]);
        }

        System.out.println(number );

     /*   if (index>=0&& index<=number.length-1){
            System.out.println(number[index]);
        }else {
            System.out.println("Invalid index!");
        }*/
        // проверка  да ли  index <=  на дължината на масива
      //  System.out.println(number[29]);

        //четене  на  масив от конзолата
     /*   int size =Integer.parseInt(scanner.nextLine());
        int [] number=new int[size];
        for (int i=0;i<=number.length;i++){
            int current=Integer.parseInt(scanner.nextLine());
            number[i]=current;
        }
        System.out.println();*/
        //четене на масив от  String  и конвертиране  в Integer

        // какво  е                          <!-- Split()--> ?
       /* String [] elements=scanner.nextLine().split(" ");//  {2} ---> two space
        int []number =new int [elements.length];
        for (int i = 0; i < elements.length; i++) {
            number[i]=Integer.parseInt(elements[i]);

        }
        for (int i = 0; i <number.length ; i++) {
            System.out.println(number[i]);
        }*/

/*
        int[] number= Arrays.stream(scanner.nextLine().split(" " ))
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();
*/

        //обръщане на масив от  int  към String
        /*
                String [] numberAsString =Arrays.stream(number)
                        .mapToObj(e->String.valueOf(e))
                        .toArray(String[]::new);
                        */
        // String.join()


        //for-each
      /*  int[] number={1,2,3,4,5};
        for (int numbers:number){
            System.out.println(numbers);
        }*/



    }
}

