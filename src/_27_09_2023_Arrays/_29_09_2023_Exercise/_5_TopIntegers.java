package _27_09_2023_Arrays._29_09_2023_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _5_TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /** I- ви вариянт
         * Input :
         * 1 4 3 2
         * 1 < 4 = 4
         * 1 < 3 = 3
         * 1 < 2 = 2
         * Output :
         * 4 3 2
         *
         */
        /**II - ри вариант :
         * 24 4 3 19 15 17
         * 24 < 4 = 24
         *      //4 < 3 = 3
         *        3 < 19 = 19
         */
        // Ако  вдясно  от текущото число има по-голямо число се отпечатва на конзолата
        //1 4 3 2 -> 4 3 2
        //24 4 3 19 15 17 -> 24 19 17
        //27 9 42 2 13 45 48 -> 48

        int[] arrays = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        /**I-ви вариант*/
        /*        for (int i = 0; i < arrays.length; i++) {
            boolean isTopInteger = true;
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[i] <= arrays[j]) {
                    isTopInteger = false;
                    break;
                }
            }
            if (isTopInteger) {
                System.out.print(arrays[i] + " ");
            }
        }*/
        /**II- ри вариант */
        for (int i=0;i<arrays.length;i++){
            int counter=i+1;
            while (arrays[i]>arrays[counter]){
                if (counter==arrays.length-1){
                    System.out.println(arrays[i]+" ");
                    break;
                }
                counter++;

            }
            if (i==arrays.length-1){
                System.out.println(arrays[arrays.length-1]+" ");
            }
        }

    }
}

