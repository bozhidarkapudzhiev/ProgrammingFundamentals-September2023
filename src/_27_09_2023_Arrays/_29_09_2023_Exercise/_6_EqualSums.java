package _27_09_2023_Arrays._29_09_2023_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _6_EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        /**Вариант 1:*/
      /*  boolean found = false;
        int sumRight = 0;
        for (int num : array) {
            sumRight += num;
        }

        int sumLeft = 0;
        for (int i = 0; i < array.length; i++) {
            // Изваждаме текущия елемент от sumRight
            sumRight -= array[i];

            // Проверка дали sumLeft е равна на sumRight
            if (sumLeft == sumRight) {
                System.out.println(i);
                found = true;
                break;
            }

            // Добавяме текущия елемент към sumLeft
            sumLeft += array[i];
        }

        if (!found) {
            System.out.println("no");
        }

*/
        /**Вариант 2:*/

        /*
        //int totalSum=Arrays.stream(array).sum();
         int leftSum=0;
        for (int i = 0; i < array.length; i++) {
         //Сумиране на дясната страна е общата сума  минус текущата сума на лявата страна  минус текущия елемент
            int rightSum=totalSum-leftSum-array[i];

            if (leftSum==rightSum){
                System.out.println(i);
                return;
                //Намерен е индекс,прекратяваме изпълнието
            }
              //Добавяме текуция елемент в лявата част
                leftSum+=array[i];

        }  System.out.println("no");
*/
        /**Вариант 3:*/
        for (int index = 0; index < array.length; index++) {
            int leftSum = 0;
            int rightSum = 0;

            // Изчисляване на сумата отляво на текущия индекс
            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                leftSum += array[leftIndex];
            }

            // Изчисляване на сумата отдясно на текущия индекс
            for (int rightIndex = index + 1; rightIndex < array.length; rightIndex++) {
                rightSum += array[rightIndex];
            }

            // Проверка дали сумите са равни
            if (leftSum == rightSum) {
                System.out.println(index);
                return; // Намерен е индекс, прекратяваме изпълнението
            }
        }

        // Ако не е намерен индекс, отпечатваме "no"
        System.out.println("no");
    }
}
