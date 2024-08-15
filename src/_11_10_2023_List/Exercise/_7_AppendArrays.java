package _11_10_2023_List.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _7_AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input: 1 2 3 |4 5 6 |  7  8	output: 7 8 4 5 6 1 2 3

        List<String> list = Arrays.stream(scanner.nextLine()
                        .split("\\|\\s*"))
                       .collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            String [] line = list.get(i).trim().split("\\s+");
            for (String numStr:line) {
                if(!numStr.isEmpty()){
                    try{
                        int num=Integer.parseInt(numStr);
                        result.add(num);
                    }catch (NumberFormatException e){
                        e.printStackTrace();
                    }
                }
            }
        }
        for (int i = 0; i < result.size(); i++) {
            if (i !=result.size()-1){
                System.out.print(result.get(i)+" ");
            }else {
                System.out.print(result.get(i));
            }
        }
    }
}
