package _11_10_2023_List.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _3_MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*3 5 2 43 12 3 54 10 23
         *76 5 34 2 4 12
         * firstList
         * secondList
         * */

        // firstIndex
        // secondIndex

        String [] firstSeq=scanner.nextLine().split(" ");
        String [] secondSeq=scanner.nextLine().split(" ");

        List<String>result=new ArrayList<>();
        int firstSeqIdx=0;
        int secondSeqIdx=0;
        boolean isFirstSeqTrue=true;

        while(firstSeqIdx>=0 && firstSeqIdx<firstSeq.length &&secondSeqIdx>=0 && secondSeqIdx<secondSeq.length){
            if (isFirstSeqTrue){
                result.add(firstSeq[firstSeqIdx]);
                firstSeqIdx+=1;
                isFirstSeqTrue=false;
            }else {
                result.add(secondSeq[secondSeqIdx]);
                secondSeqIdx+=1;
                isFirstSeqTrue=true;
            }
        }
        for (int i=firstSeqIdx;i<firstSeq.length;i++){
            result.add(firstSeq[i]);
        }
        for (int i=secondSeqIdx;i<secondSeq.length;i++){
            result.add(secondSeq[i]);
        }
        System.out.println(String.join(
                " ",
                result.stream()
                .map(e -> String.valueOf(e))
                .toArray(String[]:: new)));
    }
}
