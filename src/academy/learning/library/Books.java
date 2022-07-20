package academy.learning.library;

public class Books {
    public String name;
    public String author;

    public Books(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return  "Book name = '" + name + '\'' +
                "\n author = '" + author + '\'';
    }
}
