package _25_10_2023_ObjectsAndClasses.Exersice.Artical;

public class Articles {
    private String title;
    private String content;
    private String author;

    public Articles(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public void edit(String newContent) {
        setContent(newContent);
    }

    public void changeAuthor(String newAuthor) {
        setAuthor(newAuthor);
    }

    public void rename(String newTitle) {
        setTitle(newTitle);
    }

    public void print() {
        //better title - better content: better author
      //  Holy Ghost - content: Kim Heacox
        String formatted = String.format("%s - %s:  %s", getTitle(), getContent(), getAuthor());
        System.out.println(formatted);
    }

}
