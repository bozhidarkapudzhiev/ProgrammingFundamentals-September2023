package _27_09_2023_Arrays._29_09_2023_Exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers= new int[20];// default value is equals 0 // инициализиране -> размер на масива (= new int[20]
       // int a=5;
        // Обхождане на масив-а
       /* for (int i = 0; i <numbers[i]; i++) {
            System.out.println(i);
        }*/



       /* numbers[0]=123;//нулевата клетка е равна на стойност 123 //промяна на стойноста в клетката
        System.out.println(numbers[0]);//Извеждане  индекс на позиция 0 в масива numbers //прочитане на стойноста в клетката
*/
        //Излизане от рамера на масива
        //System.out.println(numbers[29]);
        /*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 29 out of bounds for length 20
	at _27_09_2023_Arrays._27_09_2023_Lab.Exercise.Main.main(Main.java:17)*/


        //Ако  бъде въведен индекс принтира тялото на if в противен случай връща тялото на  else
        /*       int index=Integer.parseInt(scanner.nextLine());
        //        if (index>=0 &&  index<=19) {
        //            System.out.println(numbers[index]);
        //        }else {
        //            System.out.println("Invalid index!");
        //        }*/
       // numbers.length= броя клетки  който има масива
/*        for (int i = 0; i < numbers.length; i++) {
          // numbers[i]=i;//задаване  на стойност i-интерацията на индекс-а
            numbers[i]=i*10;
        }*/
        //отпечатване в конзолата
        //Array  traversal -> обхождане на масива
  /*      for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();*/
        for (int i = 0; i < numbers.length/2; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();
    }
}
