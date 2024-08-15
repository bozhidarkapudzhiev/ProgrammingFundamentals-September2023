package _25_10_2023_ObjectsAndClasses.Exersice.Artical;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lines = scanner.nextLine().split(", ");
        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;
        Articles articles = new Articles(lines[0], lines[1], lines[2]);
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("\\:\\s+");
            String command = line[0];
            switch (command) {
                case "Rename":
                    articles.rename(line[1]);
                    break;
                case "ChangeAuthor":
                    articles.changeAuthor(line[1]);
                    break;
                case "Edit":
                    articles.edit(line[1]);
                    break;
            }
        }
        articles.print();
    }
}
