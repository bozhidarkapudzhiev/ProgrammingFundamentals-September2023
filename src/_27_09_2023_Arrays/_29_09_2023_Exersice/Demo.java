package _27_09_2023_Arrays._29_09_2023_Exersice;

public class Demo {
    public static void main(String[] args) {
        String[]words=new String[]{"Monday","Test","Parking"};
        //1.for loop-> работим  с позиции на  елементите (индекс)
        for (int index = 0; index <= words.length-1; index++) {
            System.out.println(words[index]);
        }
        System.out.println();
        //2.for-each -> работим само с елементите
        for (String word:words) {
            System.out.println(word);
        }
    }
}
