package _31_10_2023_AssociativeArrays.Comparator.Employee;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lines=scanner.nextLine();
        List<Employee>employeeList=new ArrayList<>();
        while (!lines.equals("end")){
            String[] line=lines.split("\\s+");
            String name=line[0];
            String[] dates=line[1].split("\\.");
            int day=Integer.parseInt(dates[0]);
            int mouth=Integer.parseInt(dates[1]);
            int years=Integer.parseInt(dates[2]);
            LocalDate localDate=LocalDate.of(years,mouth,day);
            Employee employee=new Employee(name,localDate);
            employeeList.add(employee);
            lines=scanner.nextLine();

        }
        //Сортиране  по година
        employeeList.sort(Comparator.comparingInt(employee->employee.birthDate.getYear()));
        System.out.println("Сортиране по година: ");
        System.out.println();
        employeeList.forEach(System.out::println);
        System.out.println();
        System.out.println("Сортиране по имена: ");
        System.out.println();
        employeeList.sort(Comparator.comparing(employee -> employee.name));

        employeeList.forEach(System.out::println);
        System.out.println();
    }
}

/*
Ivan 31.03.2008
Bozhidar 12.11.1996
Filip 03.11.1996
Georgi 26.10.1993
Stoyan 8.06.1993
Gergana 25.10.2013
Yanitsa 14.05.2013
Jivko 12.11.1996
Todor 16.06.1993
Maria 07.06.1993
Ivana 04.08.2000
Katia 19.04.2015
end
 */
