package _31_10_2023_AssociativeArrays.Example.HashMap._5_GroupingObjectsByCriterion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByExample {
    public static void main(String[] args) {
        // Създаване на списък от студенти
        List<Student>students=new ArrayList<>();
        students.add(new Student("Alice","Math"));
        students.add(new Student("Bob","Math"));
        students.add(new Student("Charlie","Science"));
        students.add(new Student("David","Science"));
        students.add(new Student("Eve","History"));
        //Създаване на HashMap  за групиране на студенти по курсове
        Map<String,List<Student>> courseMap=new HashMap<>();
        //Групиране на студенти  по курсове
        for (Student student: students){
            courseMap.computeIfAbsent(student.course,k->new ArrayList<>()).add(student);
        }
        //Итерация  и извеждане на групираните студенти
        for (Map.Entry<String ,List<Student>>entry: courseMap.entrySet()){
        //Преобразуване на списъка на студентите до списък от стрингове (имена)
            List<String>studentNames=entry.getValue().stream().map(Student::toString).collect(Collectors.toList());
            //Извличане на резултатите
            System.out.println(entry.getKey()+": "+String.join(", ",studentNames));
        }
    }
}
