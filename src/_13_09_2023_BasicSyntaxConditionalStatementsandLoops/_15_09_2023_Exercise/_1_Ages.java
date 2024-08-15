package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._15_09_2023_Exercise;

import java.util.Scanner;

public class _1_Ages {
    public static void main(String[] args) {
       /*   •	0-2 – baby;
            •	3-13 – child;
            •	14-19 – teenager;
            •	20-65 – adult;
            •	>=66 – elder;
            •	Всички стойности са включени.
      */
        Scanner scanner = new Scanner(System.in);
        int age=Integer.parseInt(scanner.nextLine());
        String person="";
        if(age>=0 && age<= 2){
            person="baby";
        } else if (age>=3 && age <=13) {
            person="child";
        } else if (age>=14 && age<=19) {
            person="teenager";
        }else  if (age>=20 && age<=65){
            person="adult";
        }else if (age>=66){
            person="elder";
        }
        System.out.println(person);
    }
}
