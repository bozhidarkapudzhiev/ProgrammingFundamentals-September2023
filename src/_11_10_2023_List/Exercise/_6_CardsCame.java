package _11_10_2023_List.Exercise;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _6_CardsCame {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<Integer> playerFirst = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
            List<Integer> playerSecond = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

            while (!playerFirst.isEmpty() && !playerSecond.isEmpty()) {
                int cardPlayerFirst = playerFirst.get(0);
                int cardPlayerSecond = playerSecond.get(0);
                playerFirst.remove(0);
                playerSecond.remove(0);

                if (cardPlayerFirst > cardPlayerSecond) {
                    playerFirst.add(cardPlayerFirst);
                    playerFirst.add(cardPlayerSecond);
                } else if (cardPlayerSecond > cardPlayerFirst) {
                    playerSecond.add(cardPlayerSecond);
                    playerSecond.add(cardPlayerFirst);
                }
                // If the cards are equal, they are both discarded (do nothing)
            }


            if (playerFirst.isEmpty()) {
                System.out.printf("Second player wins! Sum: %d\n", sumCards(playerSecond));
            } else {
                System.out.printf("First player wins! Sum: %d\n", sumCards(playerFirst));
            }
        }

        private static int sumCards(List<Integer> cards) {
            return cards.stream().mapToInt(Integer::intValue).sum();
        }
    }

