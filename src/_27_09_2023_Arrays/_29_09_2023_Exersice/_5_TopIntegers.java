package _27_09_2023_Arrays._29_09_2023_Exersice;

import java.util.Arrays;
import java.util.Scanner;

public class _5_TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] inputArrays= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < inputArrays.length; i++){
            if (i != inputArrays.length - 1){
                int counter = i + 1;
                while (inputArrays[i] > inputArrays[counter])
                {
                    if (counter == inputArrays.length - 1)
                    {
                        System.out.print(inputArrays[i] + " ");
                        break;
                    }
                    counter++;
                }
            }

            if (i == inputArrays.length - 1)
            {
                System.out.print(inputArrays[inputArrays.length - 1]+" ");
            }
        }
    }
        }
