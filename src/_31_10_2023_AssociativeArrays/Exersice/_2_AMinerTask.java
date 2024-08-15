package _31_10_2023_AssociativeArrays.Exersice;

import java.util.*;

public class _2_AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        String line = scanner.nextLine();
        while (!line.equals("stop")) {
            int resource = Integer.parseInt(scanner.nextLine());
            linkedHashMap.put(line, linkedHashMap.getOrDefault(line,0) + resource);
            line = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.printf("%s -> %d%n",entry.getKey(),entry.getValue());
        }
    }
}
