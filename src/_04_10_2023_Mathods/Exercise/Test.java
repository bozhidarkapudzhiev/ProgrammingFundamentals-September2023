package _04_10_2023_Mathods.Exercise;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*

      //  readFullName(scanner);

        int sideA=Integer.parseInt(scanner.nextLine());
        int sideB=Integer.parseInt(scanner.nextLine());

        System.out.print(calculateArea(sideA,sideB));
    }
    public static int calculateArea(int sideA,int sideB){
        return  sideA*sideB;
    }
*/
  /*  public static String readFullName(Scanner scanner){
        String firstName=scanner.nextLine();
        String lastName=scanner.nextLine();
        return  String.format("%s %s",firstName,lastName);
    }*/

        String text=scanner.nextLine();
        int count=Integer.parseInt(scanner.nextLine());
        String result=repeatString(text,count);
        System.out.println(result);
    }
    public static String  repeatString(String text,int count){
        String [] result=new String[count];
        for (int i=0;i<count;i++){
            result[i]=text;
        }
        return  String.join("",result);
    }
}
