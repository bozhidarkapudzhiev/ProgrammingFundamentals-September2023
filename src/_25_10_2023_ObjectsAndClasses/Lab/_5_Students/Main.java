package _25_10_2023_ObjectsAndClasses.Lab._5_Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Students> studentsList=new ArrayList<>();
        String lines=scanner.nextLine();

        while (true){
            if (lines.equals("end")){
                break;
            }else {
                String[] line=lines.split("\\s+");
                String firstN=line[0];
                String lastN=line[1];
                int age=Integer.parseInt(line[2]);
                String town=line[3];
                studentsList.add(new Students(firstN,lastN,age,town));
            }
            lines=scanner.nextLine();
        }
        String town=scanner.nextLine();
        for (Students students:studentsList) {
            if (students.getTown().equals(town)){
                System.out.println(students.toString());
            }
        }
    }
}
