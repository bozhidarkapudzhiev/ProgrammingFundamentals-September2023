package _25_10_2023_ObjectsAndClasses.Example;

import java.util.Random;

public class ExerciseTask {
    private int sides;

    public ExerciseTask(){

    }
    public ExerciseTask(int i){
        this.sides=i;
    }
    public int gatSides(){
        return this.sides;
    }
    public void setSide(){
        this.sides=sides;
    }
    public  int roll(){
        Random rnd=new Random();
        int sides=rnd.nextInt(this.sides+1);
        return sides;
    }
}