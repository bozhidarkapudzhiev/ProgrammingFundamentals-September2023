package _25_10_2023_ObjectsAndClasses.Lab._1_Dice;

public class Dice {
    private int sides;

    public  Dice(){}             // default constructor -> не приема параметри
                                //! можем да имаме  няколко  Overload на коструктора !

    // създавне на коструктор с параметър
    public Dice(int sides){     //винаги съвпада с името на класа
        this.sides=sides;
    }
    public int getSides(){
        return  this.sides;
    }
    public void setSides(int sides) {
        this.sides = sides;
    }
}
