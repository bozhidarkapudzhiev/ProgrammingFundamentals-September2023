package _27_09_2023_Arrays._29_09_2023_Exersice;

import java.util.Arrays;
import java.util.Scanner;

public class _9_ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []numbers= Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        //повтаряме: въвеждаме комада
        //стоп: въведем "end"
        //Продължаваме: въведеното !="end"

        String command=scanner.nextLine();
        while(!command.equals("end")){
            //command= !="end" -> валидна команда
            //1.command="swap {index1}{index2}
            //2.command="multiply 0 1"
            //3.command="decrease"
            if (command.contains("swap")){
                //1.command="swap 1 2".split(" ")->["swap","1","2"]
                int index1=Integer.parseInt(command.split(" ")[1]);
                int index2=Integer.parseInt(command.split(" ")[2]);

                int firstIndexNumber=numbers[index1];
                int secondIndexNumber=numbers[index2];

                numbers[index1]=secondIndexNumber;
                numbers[index2]=firstIndexNumber;

            } else if (command.contains("multiply")) {
                //2.command="multiply 0 1"



            } else if (command.equals("decrease")) {
                //3.command="decrease"

            }

            command=scanner.nextLine();
        }
    }
}
