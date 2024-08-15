package _11_10_2023_List.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _3_HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String>guestInParty=new ArrayList<>();
        int countCommand=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < countCommand; i++) {
            String[] command=scanner.nextLine().split("\\s+");
            String name=command[0];
            String commandFirst=command[1];
            String commandSecond=command[2];
            String commands= commandFirst.concat(" ".concat(commandSecond));
            if (command.length>3){
                String commandThree=command[3];
                commands= commands.concat(" ".concat(commandThree));
            }

           if (commands.equals("is going!")){
               if (!guestInParty.contains(name)){
                   guestInParty.add(name);
               }else {
                   System.out.printf("%s is already in the list!\n",name);
               }

           }else if (commands.equals("is not going!")){
               if (guestInParty.contains(name)){
                   guestInParty.remove(name);
               }else {
                   System.out.printf("%s is not in the list!\n",name);
               }
           }
        }

        for (String name:guestInParty) {
            System.out.println(name);
        }
    }
}
