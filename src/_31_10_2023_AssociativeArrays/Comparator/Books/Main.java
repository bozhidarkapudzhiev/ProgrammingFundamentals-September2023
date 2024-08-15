package _31_10_2023_AssociativeArrays.Comparator.Books;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import static _31_10_2023_AssociativeArrays.Comparator.Books.Books.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Books> booksList = new ArrayList<>();
        String lines = scanner.nextLine();
        while (!lines.equals("end")) {
            String title = readerTitle(lines);
            lines = scanner.nextLine();
            String author = readerAuthor(lines);
            lines = scanner.nextLine();
            int pages = readerPage(lines);
            booksList.add(new Books(title, author, pages));
            lines = scanner.nextLine();
        }
        //Сортитиране  по заглавие(по азбучен ред)
        System.out.println("Сортиране по заглавие (по азбучен ред)\n");
        booksList.sort(Comparator.comparing(Books::getTitleBook));
        printBooks(booksList);
       System.out.println();
       //Сортиране по брой страници във възходящ ред
        System.out.println("Сортиране по брой страници във възходящ ред:\n");
        booksList.sort(Comparator.comparingInt(Books::getPagesBook));
        printBooks(booksList);
        System.out.println();
        //Сортиране по заглавие,а след това по автор(по азбучен ред)
        System.out.println("Сортиране по заглавие,а след това по автор(по азбучен ред):\n");
        booksList.sort(Comparator.comparing(Books::getTitleBook).thenComparing(Comparator.comparing(Books::getAuthorBook)));
        printBooks(booksList);
    }
}



/*
Title: To Kill a Mockingbird
Author: Harper Lee
Pages: 281
Title: 1984
Author: George Orwell
Pages: 328
Title: Pride and Prejudice
Author: Jane Austen
Pages: 279
Title: The Great Gatsby
Author: F. Scott Fitzgerald
Pages: 180
Title: Moby-Dick
Author: Herman Melville
Pages: 635
Title: The Catcher in the Rye
Author: J.D. Salinger
Pages: 214
Title: War and Peace
Author: Leo Tolstoy
Pages: 1225
Title: The Lord of the Rings: The Fellowship of the Ring
Author: J.R.R. Tolkien
Pages: 423
Title: The Hobbit
Author: J.R.R. Tolkien
Pages: 310
Title: The Alchemist
Author: Paulo Coelho
Pages: 208
*/