package _31_10_2023_AssociativeArrays.Comparator.Books;

import java.util.ArrayList;
import java.util.List;

public class Books {
    //1.заглавие на книгата
    String titleBook;
    //2.автор на книгата
    String authorBook;
    //3.брой страници
    int pagesBook;

    public Books(String titleBook, String authorBook, int pagesBook) {
        this.titleBook = titleBook;
        this.authorBook = authorBook;
        this.pagesBook = pagesBook;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public int getPagesBook() {
        return pagesBook;
    }
    List<Books> booksList = new ArrayList<>();
    //Прочитане на заглавието на книгата
    public static String readerTitle(String lines) {
        String[] line = lines.split("\\s+");
        String title = line[0];
        if (line[0].contains("Title")) {
            int startIndex = 0;
            int endIndexTitle = 0;
            if (line[0].contains("Title:")) {
                startIndex = line[0].length() + 1;
            }
            endIndexTitle = lines.length();
            title = lines.substring(startIndex, endIndexTitle);

        }
        return title;
    }

    //Прочитане на автора на книгата
    public static String readerAuthor(String lines) {
        String[] line = lines.split("\\s+");
        String author = line[0];
        if (line[0].contains("Author")) {
            int startIndexAuthor = line[0].length() + 1;
            int endIndexAuthor = lines.length();
            author = lines.substring(startIndexAuthor, endIndexAuthor);
        }

        return author;
    }

    //Прочитане на броя страници на книгата
    public static int readerPage(String lines){
        String []line = lines.split("\\s+");
        int pages = Integer.parseInt(line[1]);
        return pages;
    }

    public static void printBooks(List<Books>booksList) {
        for (Books books : booksList) {
            String title = books.getTitleBook();
            String author = books.getAuthorBook();
            int pages = books.getPagesBook();
            System.out.printf("Title: %s Author: %s Pages: %d\n", title, author, pages);
        }
    }
}
