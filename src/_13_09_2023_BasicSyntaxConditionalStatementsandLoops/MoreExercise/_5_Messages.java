package _13_09_2023_BasicSyntaxConditionalStatementsandLoops.MoreExercise;
import java.util.Scanner;
public class _5_Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < length; i++) {
            String input = scanner.nextLine();
            if (input.equals("0")) { // Проверяваме дали числото е равно на 0
                System.out.print(" ");
            } else {
                int digitCount = input.length(); // Намираме броя на цифрите в числото
                int mainDigit = Character.getNumericValue(input.charAt(0)); // Намираме главната цифра в числото
                int offset = (mainDigit - 2) * 3; // Намираме отместването

                if (mainDigit >= 8) { // Ако главната цифра е 8 или 9, добавяме 1 към отместването
                    offset++;
                }

                int letterIndex = offset + digitCount - 1; // Намираме индекса на буквата
                char ch = (char) (97 + letterIndex); // Добавяме индекса
                // към ASCII кода на буквата 'a'

                System.out.print(ch);
            }
        }

    }
}