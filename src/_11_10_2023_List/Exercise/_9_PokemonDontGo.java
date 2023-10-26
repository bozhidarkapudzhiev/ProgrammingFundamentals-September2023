package _11_10_2023_List.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _9_PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer>numbers= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        //repeat: въвеждаме  идекси (цели числа) от конзолата
        //stop: празен лист -> броя на  елементите по-малък  или равен  на  0
        //continue има елементи в списъка ->броя  на  елементите е по-голям от 0

        int sum=0;// сумата на всички премехнатите елементи


        while (numbers.size()>0){
            int index=Integer.parseInt(scanner.nextLine());
            //премахваме елемнти на  този индекс
            if (index>=0 &&index<=numbers.size()-1) {
                int removedElement = numbers.get(index);//премахнатия число от списъка
                numbers.remove(index);
                sum+=removedElement;
                //модифицираме елементите на масива спрямо ремехнатия елемент
                modifyList(numbers, removedElement);
            }else if (index<0){
                //премахнатото първо число в списъка
                int removedElement=numbers.get(0);
                //премахваме  първия  елемент от списъка
                numbers.remove(0);
                sum+=removedElement;
                //последния  елемент от  списъка
                int lastElement=numbers.get(numbers.size()-1);
                //Последния  елемент   на  първо място
                numbers.add(0,lastElement);
                //модифицираме елементите на масива спрямо ремехнатия елемент
                modifyList(numbers,lastElement);
            }else if (index>numbers.size()-1) {
                int removedElement=numbers.get(numbers.size()-1);
               //Премахваме  последния елемент
               numbers.remove(numbers.size()-1);
               sum+=removedElement;
               //първия  елемент в списъка
                int  firstElement= numbers.get(0);
                //първия елемент на  последно  място
                numbers.add(firstElement);
                //модифицираме елементите на масива спрямо ремехнатия елемент
                modifyList(numbers,removedElement);
            }
        }
        System.out.println(sum);
    }

    private static void modifyList(List<Integer> numbers, int removeElement) {
        for (int index = 0; index <=numbers.size()-1; index++) {
            int currentNumber=numbers.get(index);
            if (currentNumber<=removeElement){
                currentNumber+=removeElement;
            }else{  // currentNumber>removeElement
                currentNumber-=removeElement;
            }
            numbers.set(index,currentNumber);
        }
    }
}
