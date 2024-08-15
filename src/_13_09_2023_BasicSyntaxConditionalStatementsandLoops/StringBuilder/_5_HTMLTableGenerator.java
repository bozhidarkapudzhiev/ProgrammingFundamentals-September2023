package _13_09_2023_BasicSyntaxConditionalStatementsandLoops.StringBuilder;

import java.util.Scanner;

public class _5_HTMLTableGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int rows=Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the number of columns: ");
        int column=Integer.parseInt(scanner.nextLine());
        StringBuilder htmlTable=new StringBuilder();
        htmlTable.append("<table border=\"1\">\n");
        for (int i = 0; i < rows; i++) {
            htmlTable.append("\t<tr>\n");
            for (int j = 0; j < column; j++) {
                htmlTable.append("\t\t<td>Row ").append(i+1).append(", Col ").append(j+1).append("</td>\n");
            }
            htmlTable.append("\t</tr>\n");
        }
        htmlTable.append("</table");
        System.out.println("Generated HTML Table:");
        System.out.println(htmlTable.toString());
    }
}
