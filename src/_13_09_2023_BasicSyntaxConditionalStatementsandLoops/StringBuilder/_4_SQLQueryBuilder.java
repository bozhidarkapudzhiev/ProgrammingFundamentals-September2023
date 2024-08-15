package _13_09_2023_BasicSyntaxConditionalStatementsandLoops.StringBuilder;

import java.util.Scanner;

public class _4_SQLQueryBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input="";

        while (!input.equals("end")) {
            int  id = 1;
            System.out.printf("Enter the user ID: %d\n",id);
            System.out.println("Enter the user name: ");
            String username = scanner.nextLine();
            System.out.println("Enter the user email: ");
            String email = scanner.nextLine();
            System.out.println("Enter your ages:");
            int age =Integer.parseInt(scanner.nextLine());
            String table = "users";
            String[] columns = {"id", "name", "email"};
            String condition = "age > 18";
            StringBuilder query = new StringBuilder();

            for (int i = 0; i < columns.length; i++) {
                query.append(columns[i]);
                if (i < columns.length - 1) {
                    query.append(", ");

                }
            }
            if (age>=18){
                query.append(" FROM ").append(table).append(" WHERE ").append(condition);
            }else {
          /*      input=;*/
            }


            System.out.println("Generate SQL query:");
            System.out.println(query.toString());

            System.out.println("\nSQL Table Output:");

            System.out.printf("| %2s |%4s | %4s |\n", "id", "username", "email");
            System.out.printf("| %2s |%2s | %17s |\n", id, username, email);
            id++;
        }
    }
}
