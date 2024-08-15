package _31_10_2023_AssociativeArrays.Exersice;

import java.util.*;

public class _8_CompanyUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, List<String>> companyUsers = new LinkedHashMap<>();
        String line = scanner.nextLine();
        while (!line.equals("End")) {
            //SoftUni -> AA12345

            String[] current = line.split("\\s+");
            String company = current[0];
            String employeeId = current[2];
            if (!companyUsers.containsKey(company)) {
                companyUsers.put(company, new ArrayList<>());
                companyUsers.get(company).add(employeeId);
            } if (!companyUsers.get(company).contains(employeeId)) {
                companyUsers.get(company).add(employeeId);
            }
            line = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : companyUsers.entrySet()) {
            List<String> listEmployee = entry.getValue();
            //SoftUni
            //-- AA12345
            //-- CC12344
            System.out.printf("%s\n", entry.getKey());
            for (int i = 0; i < listEmployee.size(); i++) {
                System.out.printf("-- %s\n", listEmployee.get(i));
            }
        }
    }
}
