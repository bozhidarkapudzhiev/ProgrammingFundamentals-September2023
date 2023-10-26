package _11_10_2023_List.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise {
    public static void main(String[] args) {
        //1. създаване на  лист от тип String
        //List<String>names=new ArrayList<>();
        // 2.добавяне  на елемент в списъка
        //добавянето на елементите в списъка
        //винаги  се добавя в края на списъка.

       /* names.add("Mimi");
        names.add("Ivan");
        names.add("Ivan");
        //names.remove("Ivan");*/
        //проверка дали даден елемент в списъка е изтрит
        //проверява дали  дадения  елемент в променливата е изтрит
        //връща  true  или   false   в зависимост дали  е е  изтрит елемента от списъка

        //boolean removedIvan=names.remove("Ivan");
        //ако не съществува в списъка  връща  false  не
        //boolean removedSasha=names.remove("Sasha");

        //4.изтриване  по индекс
        // names.remove(0);//индекс 0 ="Mimi"

        //изтриване  на несъществуващ индекс
        //резултат : java.lang.IndexOutOfBoundsException:
        /*Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 11 out of bounds for length 2
	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
	at java.base/java.util.Objects.checkIndex(Objects.java:359)
	at java.base/java.util.ArrayList.remove(ArrayList.java:504)
	at _11_10_2023_List.Lab.Exercise.main(Exercise.java:29)*/
        //  names.remove(11);

        //3.обождане на списъка с елементи
       /* for (String name:names) {
            System.out.println(name);
        }
        System.out.println(names);*/
        //Списък от числа -> Integer
      //  List<Integer>numbers=new ArrayList<>();
      //  List<Integer>numbers=new ArrayList<>(Arrays.asList(1,2,3));

  /*      numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);*/
        //метод insert()
        //заменя числото  "123" на индекс подаден в метода  add()
       // numbers.add(1,123);

        //заменя числото  на индекс "2" 3->123
        //numbers.set(2,123);
        //заменя числото  на индекс "2" 3->123

        //добавяне на стойст към елемента
        //numbers.set(2,numbers.get(2)+10);


        //добавяне на елемент в  края на списъка
        //numbers.add(1,123);


        //извежда големината на списъка
       // System.out.println(numbers.size());


        //извежда числото  на  позицията взета чрез  метода  get()
        //System.out.println(numbers.get(2));


        //изтриване  на индекс =123 -> невалиден индекс
        //numbers.remove((123));


        //изриване на елемент със стойност
       // numbers.remove(Integer. valueOf(123));
      // System.out.println(numbers);

        //Метода  contains()
        //проверява дали  дадено  число е дадения списък или не
       /* List<Integer>numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers);
*/
        //Метода  contains()
        //проверява дали  дадено  число е дадения списък или не
        //връща  резултат  true  или  false
        /*System.out.println(numbers.contains(23));
        System.out.println(numbers.contains(2));
        System.out.println(numbers.contains(4));
        System.out.println(numbers.contains(33));
        System.out.println(numbers.contains(1));
   */


        //Четене на  списък от конзолата
        Scanner scanner = new Scanner(System.in);
        //за числа
             // масив-> списък
     /*   List<Integer>numbers=Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .toList();*/

        // за текстове
       /* List<String>names=Arrays.stream(scanner.nextLine().split(" ")).toList();
        System.out.println(names);//Output: [Pesho, Gosho, Ivan]*/

        //списък->масив
       /* List<String>names=Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String[]numberArray=name.toArray(String[]::new);*/


        //Прочитане  на Стринг и  принтиране като цяло число
     /*   List<Integer>numbers=Arrays.stream(scanner.nextLine().split(" "))
                .map(e ->Integer.parseInt(e))
                .toList();
        int []nums=numbers.stream().mapToInt(e -> e).toArray();
        for (int i=0;i<=nums.length-1;i++){
            System.out.println(numbers.get(i));//output : println String -> int new line
        }*/

        //четене  на  списък
        String [] inputElement=scanner.nextLine().split(" ");
    }
}
