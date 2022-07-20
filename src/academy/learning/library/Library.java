package academy.learning.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public List<Books> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public Books findBook(String name) {
        for (Books book : books) {
            if (books.equals(name)) {
                return book;
            }
        }
        return null;
    }

    public boolean addBook(String name, String author) {
        Books book = findBook(name);
        if (book == null) {
            book = new Books(name, author);
            books.add(book);
        }
        return false;
    }

    public boolean removeBook(String name, String author) {
        Books book = findBook(name);
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).equals(name)) {
                books.remove(i);
            }
        }
        return false;
    }

    public void bookList() {
        System.out.println("Book List: ");
        for (Books book : books) {
            System.out.println(" " + book.toString());
        }
    }
}
