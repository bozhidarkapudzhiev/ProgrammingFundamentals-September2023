package _31_10_2023_AssociativeArrays.MoreExercise;

import com.sun.source.tree.Tree;

import java.util.*;

public class _1_Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, String> contentPassForContent = new TreeMap<>();
        TreeMap<String, TreeMap<String, Integer>> userScores = new TreeMap<>();

        // Прочитане на конкурсите и паролите
        String lines = scanner.nextLine();
        while (!lines.equals("end of contests")) {
            String[] line = lines.split(":");
            String contest = line[0];
            String passwordForContest = line[1];
            contentPassForContent.put(contest, passwordForContest);
            lines = scanner.nextLine();
        }

        // Прочитане на подадените точки за участниците
        lines = scanner.nextLine();
        while (!lines.equals("end of submissions")) {
            String[] line = lines.split("=>");
            String contest = line[0];
            String password = line[1];
            String username = line[2];
            int points = Integer.parseInt(line[3]);

            if (contentPassForContent.containsKey(contest) && contentPassForContent.get(contest).equals(password)) {
                userScores.putIfAbsent(username, new TreeMap<>());

                if (userScores.get(username).containsKey(contest)) {
                    // Актуализиране на точките, ако новите точки са по-високи
                    if (userScores.get(username).get(contest) < points) {
                        userScores.get(username).put(contest, points);
                    }
                } else {
                    userScores.get(username).put(contest, points);
                }
            }
            lines = scanner.nextLine();
        }

        // Намиране на най-добрия кандидат
        String bestCandidate = null;
        int maxTotalPoints = 0;

        for (Map.Entry<String, TreeMap<String, Integer>> entry : userScores.entrySet()) {
            int totalPoints = entry.getValue().values().stream().mapToInt(Integer::intValue).sum();
            if (totalPoints > maxTotalPoints) {
                maxTotalPoints = totalPoints;
                bestCandidate = entry.getKey();
            }
        }

        System.out.printf("Best candidate is %s with total %d points.%n", bestCandidate, maxTotalPoints);
        System.out.println("Ranking: ");

        // Сортиране и извеждане на участниците и техните точки
        userScores.forEach((username, contests) -> {
            System.out.println(username);
            contests.entrySet().stream()
                    .sorted((c1, c2) -> Integer.compare(c2.getValue(), c1.getValue()))
                    .forEach(contestEntry -> {
                        System.out.printf("#  %s -> %d%n", contestEntry.getKey(), contestEntry.getValue());
                    });
        });
    }
}