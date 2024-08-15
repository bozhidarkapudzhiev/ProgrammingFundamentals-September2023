package _25_10_2023_ObjectsAndClasses.MoreExercise.CompanyRoster;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("\\s+");
            String name = line[0];
            double salary = Double.parseDouble(line[1]);
            String department = line[2];
            String mandatory = line[3];
            if (line.length == 5) {
                //Todor 333.33 Manager Marketing 33
                try {
                    // Опит за парсиране като цяло число
                    int age = Integer.parseInt(line[4]);
                    Employee employee = new Employee(name, salary, department, mandatory, age);
                    employeeList.add(employee);
                } catch (NumberFormatException e) {
                    // Ако входът не е цяло число, опитайте да го обработите като email
                    try {
                        if (isValidEmail(line[4])) {
                            String email = line[4];
                            Employee employee = new Employee(name, salary, department, mandatory, email);
                            employeeList.add(employee);
                        }
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            } else if (line.length == 6) {
                String email = line[4];
                int age = Integer.parseInt(line[5]);
                //Peter 120.00 Dev Development peter@abv.bg 28 -> Peter 120.00 peter@abv.bg 28
                Employee employee = new Employee(name, salary, department, mandatory, email, age);
                employeeList.add(employee);
            }
        }
        System.out.println();
    }

    public static boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }
}
