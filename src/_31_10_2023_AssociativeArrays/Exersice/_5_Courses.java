package _31_10_2023_AssociativeArrays.Exersice;

import java.util.*;

public class _5_Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line=scanner.nextLine();
        LinkedHashMap<String,List<String>>linkedHashMap=new LinkedHashMap<>();
        while (!line.equals("end")){
            String[] lines=line.split("\\s+");
            String courseName="";
            String studentName="";
            if (lines.length<=4){
                courseName= lines[0];
                studentName=lines[2].concat(" ").concat(lines[3]);
            }else{
              courseName= lines[0].concat(" ").concat(lines[1]);
              studentName=lines[3].concat(" ").concat(lines[4]);
            }

            if (!linkedHashMap.containsKey(courseName)){
                linkedHashMap.put(courseName,new ArrayList<>());
                linkedHashMap.get(courseName).add(studentName);
            }else {
                linkedHashMap.get(courseName).add(studentName);
            }
            line=scanner.nextLine();
        }
        for(Map.Entry<String ,List<String>>entry: linkedHashMap.entrySet()){
            System.out.printf("%s: %d\n",entry.getKey(),entry.getValue().size());
            for (String name:entry.getValue()){
                System.out.printf("-- %s\n",name);
            }

        }
    }
}
