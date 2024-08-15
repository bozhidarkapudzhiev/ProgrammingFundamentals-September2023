package _04_10_2023_Mathods.Task;
import java.util.Scanner;

public class _6_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line=scanner.nextLine();
        System.out.println(middleCharacter(line));

     }
     public static String middleCharacter(String text){
       int length=text.length();
         if (length % 2 == 0) {
            return text.substring(text.length()/2-1,text.length()/2+1);
         }else{
             return String.valueOf(text.charAt(length/2));
         }
     }
}
