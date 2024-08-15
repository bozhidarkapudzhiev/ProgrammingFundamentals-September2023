package _04_10_2023_Mathods.Task;

import java.util.Scanner;

public class _2_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line=scanner.nextLine();
        vowelsCount(line);
    }
    public static int vowelsCount(String line){
        int count=0;
        String[] arrWord=line.split("");

        for (int i=1;i<=line.length();i++){
            char symbol=line.toLowerCase().charAt(i-1);
            //a, e, i, o, u, and sometimes y.
            if (symbol=='a'||symbol=='e'||symbol=='i'||symbol=='o'||symbol=='u'|| symbol=='y'){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
