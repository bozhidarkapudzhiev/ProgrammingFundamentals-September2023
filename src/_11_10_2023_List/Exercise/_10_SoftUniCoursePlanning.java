package _11_10_2023_List.Exercise;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _10_SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.входни данни -> списък  със занятия  (текст)
        List<String> topics= Arrays.stream(scanner.nextLine()           //"Data Types ,Object, List"
                .split(", ")).collect(Collectors.toList());

        String command=scanner.nextLine();
        while (!command.equals("course start")){
            //валидни команди
            /* 1.command=" Add:{lessonTitle}".split(":") -> ["Add","{lelessonTitle} "]
            •  2.command="Insert:{lessonTitle}:{index}".split(":")  -> [Insert,{lessonTitle},{index}]
            •  3.command=Remove:{lessonTitle}.split(":") - ["Swap",{lessonTitle},{lessonTitle}]
            •  4.command=Swap:{lessonTitle}:{lessonTitle} - change the place of the two lessons, if they exist
            •  5.command=Exercise:{lessonTitle} - add Exercise in the schedule right after the lesson index, if the lesson exists
            a*/
            command=scanner.nextLine();
            String [] commandParts=command.split(":");
            String commandName=commandParts[0];//"Add","Insert","Remove","Swap","Exercise"
            String topic=commandParts[1];//
            switch (commandName) {
                case "Add":
                    if (!topics.contains((topic))) {
                        topics.add(topic);
                    }
                    break;
                case "Insert":
                    //command="Insert:Database:1"
                    int indexForInsert = Integer.parseInt(commandParts[2]);//позиция за вмъкване
                    if (!topics.contains(topic)) {
                        topics.add(indexForInsert, topic);
                    }
                    break;
                case "Remove":
                    if (topics.contains(topic)) {
                        topics.remove(topic);
                        int topicIndex=topics.indexOf(topic);
                        String exerciseName=topic+"-Exercise";//име на  упражние
                        boolean hasExercise=topicIndex!=topics.size()-1 && topics.get(topicIndex+1).equals(exerciseName);
                        //true -> имаме  упражение  след темата
                        //false -> нямаме упражниене след темата

                        //има ли  упражнение след  темата -> премахваме  и  него
                        topics.remove(topic);
                        if (hasExercise==true){
                            topics.remove(exerciseName);
                        }
                    }
                    break;
                case "Swap":
                    String topic2 = commandParts[2];
                    if (topics.contains(topic) && topics.contains(topic2)) {
                        int indexFirst = topics.indexOf(topic);//позиция на първата тема
                        int indexSecond = topics.indexOf(topic2);//позиция на втората тема
                        topics.set(indexSecond, topic);
                        topics.set(indexFirst, topic2);

                        //размяна  на упражнията
                        String exFirstTopic=topic+"-Exercise";// името  на упражнението след първата тема
                        String exSecondTopic=topic2+"-Exercise";//име на упражние сле втората тема

                        //проверка дали  съществува упражниение след темата
                        if(topics.contains(exFirstTopic)){
                            topics.remove(exFirstTopic);
                            topics.add(topics.indexOf(topic)+1,exFirstTopic);
                        }

                        //проверяваме  дали  се съдържа упражние след второто упражние
                        if (topics.contains(exSecondTopic)){
                            topics.remove(exSecondTopic);
                            topics.add(topic.indexOf(topic2)+1,exSecondTopic);
                        }
                    }
                    break;
                case "Exercise":
                    //Command="Exercise: Methods"
                    //добавям  упражние  към дадена  тема
                    String exerciseName = topic + "-Exercise";//име на упражнеието
                    //1.проверяваме дали има  тази тема
                    if (topics.contains(topic)) {
                        //имам такаватемеа -> добавям упражнеие
                        int indexTopic = topics.indexOf(topic);//позиция на темата
                        //дали темата е последна
                        if (indexTopic == topics.size() - 1) {
                            //нямаме  упражние след нея
                            topics.add(exerciseName);
                        }
                        //проверка :съществували упражние за тази тема
                        else if (topics.get(indexTopic + 1).equals(exerciseName)) {
                            //след моята тема няма упражние
                            topics.add(indexTopic + 1, exerciseName);
                        }
                    } else {
                        //нямаме  такава тема ->
                        //1, добавяме в края на списъка
                        //2.добавяме  и  упражнение
                        topics.add(topic);
                        topics.add(exerciseName);
                    }
                    break;
            }
                command = scanner.nextLine();
            }
        int number=1;// номерация преди  всяка  тема
        for (String topic:topics){
            System.out.println(number+"."+topic);
            number++;
        }
            }

}
