package _13_09_2023_BasicSyntaxConditionalStatementsandLoops._15_09_2023_Exercise;

import com.sun.source.tree.IfTree;

import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class _5_Login {
    public static void main(String[] args) {
        /**Създаване на Scanner клас*/
        Scanner scanner = new Scanner(System.in);
        /**Прочитане на String -> потребителско име*/
        String username = scanner.nextLine();
        /**Инициация на променливата  password*/
        String password = "";
        /**Обръщане на username  и съхраняване в променливата password*/
        for (int i = username.length() - 1; i >= 0; i--) {
            char symbol = username.charAt(i);
            password += symbol;
        }
        int counterCorrectPassword = 1;
        /**Инициализация на коректната парола */
        String correctPassword = password;
        String currentPass = scanner.nextLine();
        while (counterCorrectPassword <= 4) {
            /**Aко въведената парола е вярна се извежда съобщение за  успешен вход*/
            if (correctPassword.equals(currentPass)) {
                System.out.printf("User %s logged in.", username);
                return;
            } else if (!correctPassword.equals(currentPass)) { /**Ако въведенат парола е грешна и опитите за вход са по-малко от 4 се подканва  потребителя да  опита отново*/
                if (counterCorrectPassword < 4) {
                    System.out.println("Incorrect password. Try again.");
                    currentPass = scanner.nextLine();
                    counterCorrectPassword++;
                } else {/**В противен случай ако паролата е грешна  в 4 пореднити  пъти се извежда съобщение , че потребителя е блокиран*/
                    System.out.printf("User %s blocked!", username);
                    return;
                }
            }
        }
    }
}
