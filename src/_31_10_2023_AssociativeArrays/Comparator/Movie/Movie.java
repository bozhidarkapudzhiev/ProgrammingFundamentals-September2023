package _31_10_2023_AssociativeArrays.Comparator.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Movie {
    String title;//заглавие на филма
    double rating;//рейтинг на филма
    int year;//година на излизане

    public Movie(String title, double rating, int year) {
        this.title = title;
        this.rating = rating;
        this.year = year;
    }

    public Movie() {

    }

    public String getTitle() {
        return title;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    public void addMovie(String lines, Scanner scanner,
                            List<Movie>movieList) {
        while (!lines.equalsIgnoreCase("End")) {
           /* String[] title = lines.split("\\s+");
            int startIndexMovieTitle = 0;
            int endIndexMovieTitle = lines.length();
            if (title[0].contains("Title:")) {
                startIndexMovieTitle = title[0].length() + 1;
            }
            String nameMovie = lines.substring(startIndexMovieTitle,
            endIndexMovieTitle);
            // String titleMovies=movies.substring()
            String ratings = scanner.nextLine();
            String[] rating = ratings.split("\\s+");
            double ratingMovie = Double.parseDouble(rating[1]);
            String years= scanner.nextLine();
            String[] year = years.split("\\s+");
            int yearMovie = Integer.parseInt(year[1]);

            Movie movie = new Movie(nameMovie, ratingMovie, yearMovie);
            movieList.add(movie);
            lines = scanner.nextLine();*/
            String nameMovie = lines.replaceFirst("Title:\\s*", "").trim();
            String ratings = scanner.nextLine();
            double ratingMovie = Double.parseDouble(ratings.replaceFirst("Rating:\\s*", "").trim());
            String years = scanner.nextLine();
            int yearMovie = Integer.parseInt(years.replaceFirst("Year:\\s*", "").trim());
            movieList.add(new Movie(nameMovie,ratingMovie,yearMovie));
            lines=scanner.nextLine();
        }
    }
    @Override
    public String toString() {
        return String.format("%s %.1f, %d",getTitle(),getRating(),getYear());
    }
}
