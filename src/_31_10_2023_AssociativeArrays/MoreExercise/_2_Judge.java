package _31_10_2023_AssociativeArrays.MoreExercise;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class _2_Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lines=scanner.nextLine();
        LinkedHashMap<String,String>linkedHashMap=new LinkedHashMap<>();
        LinkedHashMap<String, LinkedHashMap<String, Integer>> userScores = new LinkedHashMap<>();
        while (!lines.equals("no more time")){
            String line[]=lines.split(" -> ");
            String name=line[0];
            String course=line[1];
            int points=Integer.parseInt(line[2]);
        if(linkedHashMap.containsKey(course) && linkedHashMap.containsValue(name)){
            userScores.putIfAbsent(name,new LinkedHashMap<>());
            if (userScores.get(name).containsKey(course)){
                if (userScores.get(name).get(course)<points){

                }
            }
        }

        }
    }
}
