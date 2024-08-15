package _20_09_2023_DataTypeAndVariable.Exercise;

import java.util.Scanner;

public class _8_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        String models="";
        double biggest=0.0;
        for (int i = 0; i < n; i++) {
            String  currentModel=scanner.nextLine();
            double radius=Double.parseDouble(scanner.nextLine());
            int height=Integer.parseInt(scanner.nextLine());
            double result=Math.PI*(radius*radius)*height;

            if (result>biggest){
                models=currentModel;
                biggest=result;
            }
        }
        System.out.println(models);
        /**Input 1 ->Output:  Keg 2
        /**Input 2 ->Output: Bigger Keg
         * */
    }
}
