package _13_09_2023_BasicSyntaxConditionalStatementsandLoops.StringBuilder;

import java.util.Scanner;

public class _2_StringBuilderConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startIndex=Integer.parseInt(scanner.nextLine());
        int endIndex=Integer.parseInt(scanner.nextLine());
        StringBuilder builder=new StringBuilder();
        for (int i = startIndex; i <=endIndex ; i++) {
            builder.append(i);
            if (i<endIndex){
                builder.append(",");
            }
        }
        String result=builder.toString();
        System.out.println(result);
    }
}
