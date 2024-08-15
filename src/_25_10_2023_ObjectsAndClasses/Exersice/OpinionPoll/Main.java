package _25_10_2023_ObjectsAndClasses.Exersice.OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<OpinionPoll>opinionPolls=new ArrayList<>();
        int n=Integer.parseInt(scanner.nextLine());
        for (int i=0;i<n;i++){
            String[] line=scanner.nextLine().split("\\s+");
            String name=line[0];
            int age=Integer.parseInt(line[1]);
            if (age>30){
                OpinionPoll opinionPoll=new OpinionPoll(name,age);
                opinionPolls.add(opinionPoll);

            }
        }
        for (OpinionPoll opinionPoll : opinionPolls){
            System.out.println(opinionPoll.toString());
        }
    }
}
