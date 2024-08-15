package _13_09_2023_BasicSyntaxConditionalStatementsandLoops.StringBuilder;

import java.util.*;

public class SQLQueryBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                // Четене на входни данни
                String line = scanner.nextLine();
                HashMap<Integer, List<String>> map = new LinkedHashMap<>();
                int id = 1;

                // Четене на данни от входа и съхранение в HashMap
                while (!line.equals("end")) {
                    String[] input = line.split("\\s+");
                    String username = input[0];
                    String email = input[1];
                    int age = Integer.parseInt(input[2]);
                    if (age > 18) {
                        map.put(id, new ArrayList<>());
                        map.get(id).add(username);
                        map.get(id).add(email);
                        map.get(id).add(String.valueOf(age));
                        id++;
                    }
                    line = scanner.nextLine();
                }

                // Използване на StringBuilder за изграждане на SQL заявка
                StringBuilder sqlQueryBuilder = new StringBuilder();
                sqlQueryBuilder.append("SELECT id, username, email, age FROM users WHERE age > 18");
                System.out.println("Generated SQL query:");
                System.out.println(sqlQueryBuilder.toString());

                // Използване на StringBuilder за изграждане на таблица
                StringBuilder tableBuilder = new StringBuilder();
                tableBuilder.append("\nSQL Table Output:\n");
                tableBuilder.append(String.format("| %2s | %10s | %25s | %4s |\n", "id", "username", "email", "age"));
                for (Map.Entry<Integer, List<String>> mapValue : map.entrySet()) {
                    tableBuilder.append(String.format("| %2d | %10s | %25s | %4s |\n",
                                                mapValue.getKey(),
                                                mapValue.getValue().get(0),
                                                mapValue.getValue().get(1),
                                                mapValue.getValue().get(2)));
                }
                System.out.println(tableBuilder.toString());
            }
        }




/**bozhidar bozhidar_kapudzhie@abv.bg 28
 zaharinka zaharinka_kapudzhieva@abv.bg 63
 ilko ilko.kapudzhiev@abv.bg 62
 tedy tedy_taskova@abv.bg 5
 eva eva_maria@gmail.com 7
 cvetelina cveti_taskova@abv.bg 35
 stoyan stoyan_tashev@abv.bg 15*/