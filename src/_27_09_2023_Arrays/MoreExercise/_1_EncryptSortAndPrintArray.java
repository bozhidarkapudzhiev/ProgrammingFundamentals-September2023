package _27_09_2023_Arrays.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class _1_EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.Прочитане на броя имена, които ще бъдат въведени в конзолата
        int count=Integer.parseInt(scanner.nextLine());

        /**Peter = 1071         Maria = 1532        Katya = 1032        Todor = 1168 */
        //2.Създаване на масив ,който ще съхранява сбора на буквите в число
         int [] lengthNames=new int[count];
        for (int i = 0; i < count; i++) {
            //3.Прочитане на име за текущата итерация
            String name=scanner.nextLine();
            //4.Създаване на променлива за сумата от буквите от ascii  кода на текущото име
            int sum=0;
            //5.Обхождане на всеки символ от името
            for (int j = 0; j < name.length(); j++) {
                char symbol=name.charAt(j);
                //6.Намиране на  ascii кода на символа
                int ascii=symbol;
                if ("aeiouAEIOU".indexOf(symbol) != -1) {
                    //7.Ако символа е гласна буква се умнова  ascii кода по дължината на името
                    ascii = symbol * name.length();
                } else {
                    //8.Ако символа е съгласна буква се разделя  ascii кода по дължинта на името
                    ascii = symbol / name.length();
                }
                //9.Добавяне към общата сума
                sum += ascii;
            }
            //10.сумата от всяко име се добавя към масива
         lengthNames[i]=sum;
        }
        //11.Сортиране във възходящ ред
        Arrays.sort(lengthNames);
        //12.Отпечатване  на резултата
        for (int i: lengthNames){
            System.out.println(i);
        }
    }
}