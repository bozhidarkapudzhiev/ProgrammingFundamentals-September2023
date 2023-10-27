package _25_10_2023_ObjectsAndClasses._3_OpinionPoll;

public class Person {
    //описваме всеки човек
    //полета -> характеристики (име и възраст)
    /*полетата не трябва да имат възможност да
     бъдат достъпвани директно от външен  клас
     */
    private String name;
    private int age;
    //коструктор -> метод ,чрез който създаваме обект от класа

    public Person(String name ,int age){
        //нов празен обект
        this.name=name;
        this.age=age;
    }
    //методи -> действия  който ще се извършват
    //getter - методи,който използваме за да достъпваме / взимаме стойността на полетата

    //1.getter  на полето name ->  взимаме сройността на полето  name

    public String getName() {
        return name;
    }
    //2. getter на полето  age -> взимаме стойността нма полето  age
    public  int getAge(){
        return age;
    }
}
