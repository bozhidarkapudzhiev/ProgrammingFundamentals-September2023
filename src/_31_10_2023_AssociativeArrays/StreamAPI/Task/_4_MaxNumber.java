package _31_10_2023_AssociativeArrays.StreamAPI.Task;

import java.util.Arrays;
import java.util.List;

public class _4_MaxNumber {
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(5,3,8,1,9,2,4,7,6);
        int maxNum=numbers.stream().max(Integer::compare).get();
        System.out.println(maxNum);
    }
}
