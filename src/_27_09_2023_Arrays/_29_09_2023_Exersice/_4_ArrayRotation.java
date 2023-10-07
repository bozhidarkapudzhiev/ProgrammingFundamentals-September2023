package _27_09_2023_Arrays._29_09_2023_Exersice;

import java.util.Arrays;
import java.util.Scanner;

public class _4_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      //1.входни данни
        int[]numbers=Arrays.stream(scanner.nextLine()  //"51 47 32 61 21"
                        .split(" "))     //["51","47","32","61""21"]
                        .mapToInt(Integer::parseInt)    //[51,47,32,61,21]
                        .toArray();
      //2.брой ротации
        int rotations=Integer.parseInt(scanner.nextLine());
        for (int rotation = 1; rotation <=rotations ; rotation++) {
            //3.ротация на  масива
                //1.взимаме първия елемент
            int firstElement=numbers[0];//51
                //2.преместване на елементите наляво (копираме)
                //!!!!!! без промяна  на  последната позиция !!!!!!!!!
            //[51,47,32,61,21] -> //[47,32,61,21,51]
            //Обхождаме от първата без последния  елемент
            for (int index=0;index<numbers.length-1;index++){
                numbers[index]=numbers[index+1];
            }
                //3.поставяме  първия  елемент на последно мяство
            numbers[numbers.length-1]=firstElement;
        }

        //приключили с ротациите -> принтираме елементите
        for (int number:numbers) {
            System.out.print(number+" ");
        }
    }
}
