package _27_09_2023_Arrays._27_09_2023_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _6_EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**Arrays are identical. Sum: 60*/

        int[] firstArrays = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] secondArrays = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
       boolean isIdentity=true;
       int sum=0;
       int index=0;
        for (int i = 0; i < firstArrays.length; i++) {
            if (firstArrays[i]!=secondArrays[i]){
                isIdentity=false;
                break;
            }else {
                sum+=firstArrays[i];
                isIdentity=true;
                index++;
            }
        }
        if (isIdentity){
            System.out.printf("Arrays are identical. Sum: %d\n",sum);
        }else{
            System.out.printf("Arrays are not identical. Found difference at %d index.\n",index);
        }
    }
}


