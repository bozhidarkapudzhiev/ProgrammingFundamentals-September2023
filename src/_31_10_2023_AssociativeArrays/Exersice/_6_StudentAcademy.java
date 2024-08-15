package _31_10_2023_AssociativeArrays.Exersice;

import java.util.*;

public class _6_StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, List<Double>> studentAverageGrade = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if (studentAverageGrade.containsKey(studentName)) {
                studentAverageGrade.get(studentName).add(grade);
            } else {
                studentAverageGrade.put(studentName, new ArrayList<>());
                studentAverageGrade.get(studentName).add(grade);
            }

        }
        for (Map.Entry<String, List<Double>> entry : studentAverageGrade.entrySet()) {
            //John -> 5.00
            double average = entry.getValue().stream().mapToDouble(Double::doubleValue).average().orElse(0);
           if (average>=4.50){
               System.out.printf("%s -> %.2f\n", entry.getKey(), average);
           }
        }
    }
}


/**
 public class _6_StudentAcademy {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 int n = Integer.parseInt(scanner.nextLine());
 LinkedHashMap<String, List<Double>> studentAverageGrade = new LinkedHashMap<>();
 for (int i = 0; i < n; i++) {
 String studentName = scanner.nextLine();
 double grade = Double.parseDouble(scanner.nextLine());
 studentAverageGrade.computeIfAbsent(studentName, k -> new ArrayList<>()).add(grade);
 }

 studentAverageGrade.entrySet().stream()
 .filter(entry -> entry.getValue().stream().mapToDouble(Double::doubleValue).average().orElse(0) >= 4.50)
 .forEach(entry -> {
 double average = entry.getValue().stream().mapToDouble(Double::doubleValue).average().orElse(0);
 System.out.printf("%s -> %.2f\n", entry.getKey(), average);
 });
 }
 } */