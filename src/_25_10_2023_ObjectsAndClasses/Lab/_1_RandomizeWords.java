package _25_10_2023_ObjectsAndClasses.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class _1_RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd=new Random();//  създване на рандом вход;
       /* //System.out.println(rnd.nextInt(50));
        // извежда Random  число
        // /*bound  -> задаване на горна граница до дадено число в диапазон
        */

        List<String>inputWords=Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        //създване  на  лист от число и  преобразуване  към колекция
        List<String>result=new ArrayList<>();
        //чрез for цикъла везмаме дума от първия лист и го запазваме в новия лист   result  в различен ред

        int inputWordsLen=inputWords.size();
        for (int i=0;i<inputWordsLen;i++){
            int idx=rnd.nextInt(inputWords.size());
            result.add(inputWords.get(idx));
            inputWords.remove(idx);
        }
        for (String word:result) {
            System.out.println(word);
        }


    }
}
