package _27_09_2023_Arrays._27_09_2023_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _5_EvenAndOddSubtraction{
    public static void main(String[] args) {;
        Scanner scanner=new Scanner(System.in);
        int[] n= Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int even=0;
        int odd=0;
        for (int i = 0; i <n.length; i++) {
            if (n[i]%2==0){
                even+=n[i];
            }else {
                odd+=n[i];
            }

        }
        int result=even-odd;
        System.out.println(result);
    }
}
