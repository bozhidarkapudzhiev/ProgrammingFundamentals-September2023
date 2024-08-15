package _25_10_2023_ObjectsAndClasses.Exersice;

import java.util.Random;
import java.util.Scanner;

public class _1_AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        /* •	Phrases
            o	"Excellent product."
            o	"Such a great product."
            o	"I always use that product."
            o	"Best product of its category."
            o	"Exceptional product."
            o	"I can’t live without this product."

         */

        String[] phrases = {
                "Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."
        };
         /*
        •	Events
                o	"Now I feel good."
                o	"I have succeeded with this product."
                o	"Makes miracles. I am happy of the results!"
                o	"I cannot believe but now I feel awesome."
                o	"Try it yourself, I am very satisfied."
                o	"I feel great!"

         */
        String[] events = {
                "Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"
        };
        /**
         * •	Authors
         "Diana"
         "Petya"
         "Stella"
         "Elena"
         "Katya"
         "Iva"
         "Annie"
         "Eva"
         */
        String[] authors = {
                "Diana",
                "Petya",
                "Stella",
                "Elena",
                "Katya",
                "Iva",
                "Annie",
                "Eva"
        };
        /**•	Cities
         "Burgas"
         "Sofia"
         "Plovdiv"
         "Varna"
         "Ruse"
         */
        String[] cities = {
                "Burgas",
                "Sofia",
                "Plovdiv",
                "Varna",
                "Ruse",
        };
        Random random = new Random();
        int count = 0;
        String output = "";
        while (count < n) {
            int randPhrases = random.nextInt(phrases.length);
            String worldPhrases = phrases[randPhrases];
            int randEvents = random.nextInt(events.length);
            String worldEvents = events[randEvents];
            int randAuthors = random.nextInt(authors.length);
            String author = authors[randAuthors];
            int randCities = random.nextInt(cities.length);
            String city = cities[randCities];
            output = worldPhrases.concat(" ".concat(worldEvents).concat(" ".concat(author)).concat(" - ").concat(city));

            //"{phrase} {event} {author} – {city}".
            System.out.println(output);
            count++;
        }

    }
}
