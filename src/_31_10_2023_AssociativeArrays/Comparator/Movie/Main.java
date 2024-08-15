package _31_10_2023_AssociativeArrays.Comparator.Movie;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Movie> movieList = new ArrayList<>();
        String movies = scanner.nextLine();
        Movie movie = new Movie();
        movie.addMovie(movies, scanner, movieList);
        //1.Сортиране на филми в низходящ ред по рейтинг
        System.out.println("Сортиране на филми в низходящ ред по рейтинг:\n");
        movieList.sort(Comparator.comparingDouble(Movie::getRating).reversed());
        movieList.forEach(movie1 -> System.out.println( movie1.toString()));
        //2.По година на излизане във възходящ ред.
        System.out.println("\nПо година на излизане във възходящ ред.\n");
        movieList.sort(Comparator.comparing(Movie::getYear));
        movieList.forEach(movie1 -> System.out.println(movie1.toString()));
        //3.Първо по година на излизане, а след това по заглавие (по азбучен ред) при еднакви години.
        System.out.println("\nПърво по година на излизане, а след това по заглавие (по азбучен ред) при еднакви години.\n");
        movieList.sort(Comparator.comparingInt(Movie::getYear).thenComparing(Movie::getTitle));
        movieList.forEach(movie1 -> System.out.println(movie1.toString()));
    }
}