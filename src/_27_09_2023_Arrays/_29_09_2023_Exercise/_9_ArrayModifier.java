package _27_09_2023_Arrays._29_09_2023_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _9_ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        String line = scanner.nextLine();

        /* I- вход:
         * първа интерация = swap 1 3 =  23 -2 321 87 42 90 -123 ->  23 87 321 -2 42 90 -123
         * втора интерация = swap 3 6 = 23 87 321 2 42 90 -123 ->  23 87 321 -123 42 90 2
         * трета интерация =  swap 1 0 = 23 87 321 -123 42 90 2 ->  87 23 321 -123 42 90 2
         * четвърта интерация = multiply 1 2 = 87 23 321 -123 42 90 2 ->87 7383 321 -123 42 290 -2
         * пета интеация  multiply 2 1
         * шеста интерация = decrease
         */
        while (!line.equals("end")) {
            String[] commandArr = line.split("\\s+");
            String command = commandArr[0];
            if (!line.equals("decrease")) {
                int firstEl = Integer.parseInt(commandArr[1]);
                int secondEl = Integer.parseInt(commandArr[2]);

                int getFirstElement = 0;
                int getSecondElement = 0;
                for (int i = 0; i < array.length; i++) {
                    if (i == firstEl) {
                        getFirstElement = array[i];
                    } else if (i == secondEl) {
                        getSecondElement = array[i];

                    }

                }


                switch (command) {
                    case "swap":
                        array[firstEl] = getSecondElement;
                        array[secondEl] = getFirstElement;
                        break;
                    case "multiply":
                        //multiply 1 2 - > multiply 1(23) 2(321) = 7383 ▼
                        //87 7383 321 -123 42 290 -2
                        //multiply 2 1 -> multiply 2(321) 1(7383) = 2369943 ▼
                        //87 7383 2369943 -123 42 90 -2
                        array[firstEl] = getFirstElement * getSecondElement;
                        break;
                }
            } else {
                for (int i = 0; i < array.length; i++) {
                    array[i] = array[i] - 1;
                }
            }
            line = scanner.nextLine();
        }

        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1) {
                System.out.printf("%d\n", array[i]);
            } else {
                System.out.printf("%d, ", array[i]);
            }
        }
    }
}