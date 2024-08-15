package _31_10_2023_AssociativeArrays.Lab;

import java.util.*;

public class _1_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [] numbers=Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        TreeMap<Double,List<Integer>>linkedHashMap=new TreeMap<>();
        for (int i = 0; i < numbers.length; i++) {
            double current=numbers[i];
            if (!linkedHashMap.containsKey(current)){
                linkedHashMap.put(current,new ArrayList<>());
                linkedHashMap.get(current).add(1);
            }else{
               linkedHashMap.get(current).add(1);
            }
        }
        for (Map.Entry<Double,List<Integer>>entry: linkedHashMap.entrySet()){
            System.out.printf("%.0f -> %d\n",entry.getKey(),entry.getValue().size());
        }
    }
}
