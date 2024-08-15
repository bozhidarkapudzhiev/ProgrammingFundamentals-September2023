package _13_09_2023_BasicSyntaxConditionalStatementsandLoops.StringBuilder;

public class _1_StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("Hello");
       /* System.out.println(stringBuilder.delete(0,5));*/
       /* System.out.println(stringBuilder.deleteCharAt(2));
        System.out.println(stringBuilder);*/

   /*     *//**Получаване  на дължината на низът*//*
        int length=stringBuilder.length();
        System.out.println("Дължината на текста е : "+ length);
        *//**Получаване на капацитета на низът*//*
        int capacity=stringBuilder.capacity();
        System.out.println("Капацитета на текста е : "+capacity);*/

        /**Преобразуване  на StringBuilder в String*/
        int yearsOld=28;
        stringBuilder.append(", I'm Bozhidar.I'm ");
        stringBuilder.append(yearsOld).append(" years old.\n");
        System.out.println(stringBuilder);
    }
}
