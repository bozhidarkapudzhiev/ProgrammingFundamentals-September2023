package _31_10_2023_AssociativeArrays.Exersice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _4_SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String,String>linkedHashMap=new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] line=scanner.nextLine().split("\\s+");
            String command=line[0];
            String name=line[1];
            switch (command){
                case "register":
                    String registerNumber=line[2];
                    if (!linkedHashMap.containsKey(name)) {
                        linkedHashMap.put(name, registerNumber);
                        System.out.printf("%s registered %s successfully%n", name, registerNumber);
                    }else {
                        //license plate using the same username, the system should print:
                        //"ERROR: already registered with plate number {licensePlateNumber}"
                        //linkedHashMap.
                        System.out.printf("ERROR: already registered with plate number %s%n",registerNumber);
                    }
                    break;
                case "unregister":
                    if (linkedHashMap.containsKey(name)){
                        linkedHashMap.remove(name);
                        System.out.printf("%s unregistered successfully%n",name);
                    }else {
                        System.out.printf( "ERROR: user %s not found\n" ,name);
                    }

                    break;
            }
        }
        for (Map.Entry<String,String>entry: linkedHashMap.entrySet()){
            /**
             * Anthony => AB1111XX
             * Joshua => DD1111XX
             * Samantha => AA9999BB
             */
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
