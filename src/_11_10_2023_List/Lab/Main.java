package _11_10_2023_List.Lab;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      /*  List<String >names =new ArrayList<>();


        .add() добавяне на елементи към списъка
       /* names.add("Mimi");
        names.add("Ivan");// първи елемент "Ivan"
        names.add("Ivan");
        .remove() има два  Overload
        //Подаване на елемет от списъка -> "Ivan"
        // премахва  първото  съвпанение ,ако съществува
        //при премахване  на  индекс следващият след него  заема  индекса  на  премахнатия елемент
        boolean removeIvan=names.remove("Ivan");
        System.out.println(removeIvan);
        boolean removeSasha=names.remove("Sasha");
        //връща false  тъй като  елеманта   "Sasha'  не съществува в списъка .
        System.out.println(removeSasha);
        names.remove("Sasha");*//*

        //Премахване по индекс,  ако  съществува , ако ли  не получаваме грешка
        // names.remove(0);
       /* String removeBValue= names.remove(1);
        System.out.println(removeBValue);

        //обхожда списъка с добавените имена  като принтира всяко име на  нов  ред
        for (String name:names){
            System.out.println(name);
        }
        // принтира списък като масив
        System.out.println(names);
    */
    //Списък от числа
      /*  List<Integer>number=new ArrayList<>();

        //number.add(123);
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);*/

    /*    //добавяне на число  на даден  индексю
        // в случай  на фрешен  или  не  съществуващ  индекс  получаваме грешка
        number.add(2,123);//след добавянето  на  числото към  списъка  всички  елементи  в списъка след  него  се  измества с едноп на  дясно

        //изтриване  на  число от спицък
      //  number.remove(Integer.valueOf(123));
        System.out.println(number);
*/
        // при списъжите имаме   size() фукцията -> връша  дължината
      //  System.out.println(number.size());

       //връща елемента на  позицита в списъка
        /* System.out.println(number.get(2));*/
        // заменяне на стойност на  даден  индекс
      /*  number.set(2,23);
        System.out.println(number);*/
        //добавяне  на стойност към  съществуваща
      /*  number.set(2,number.get(2)+10);
        System.out.println(number);*/

        //contains () -> проверява дали съществува даден елемент в списъка
        /*
                System.out.println(number.contains(23));
                System.out.println(number.contains(2));
                System.out.println(number.contains(44));
                System.out.println(number.contains(5));
        */
        //Четене  на  ArraysList  от конзолота
     /*
        List<Integer>numbers= Arrays.stream(scanner.nextLine().split(""))
                .map(Integer::parseInt).toList();*/

     /*   List<String>name= Arrays.stream(scanner.nextLine().split(" ")).toList();
        String []namesArray=name.stream().map(e -> String.valueOf(e)).toArray(String[]::new);*/


     /*  List<Integer>numbers=Arrays.stream(scanner.nextLine().split(" "))
                .map(e ->Integer.parseInt(e))
                .toList();
        int [] nums=numbers.stream().mapToInt(e -> e).toArray();*/

        //четене  на числа  stream() ->
   /*     String[]inputElement=scanner.nextLine().split(" ") ;
        List<Integer> numbers=new ArrayList<>();
        for (String element:inputElement) {
            numbers.add(Integer.parseInt(element));
        }*/
        //сортиране на числа  във възходящ ред
      /*  List<Integer>nums=new ArrayList<>(Arrays.asList(2,4,3,1,5));
        Collections.sort(nums);*/
        //сортиране на числа  във низходящ ред
 /*       Collections.reverse(nums);
        System.out.println(nums);*/

        //сортиране на масив
        List<Integer>numbers=new ArrayList<>(Arrays.asList(2,3,1,5,4,7));
        Collections.sort(numbers);
        System.out.println(numbers);
        //обръщане на списък в обратен ред
        Collections.reverse(numbers);
        System.out.println(numbers);


    }

}
