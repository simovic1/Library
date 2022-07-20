package academy.learning.library;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Harry Potter", "J. K. Rowling");
        library.addBook("Philosopher's Stone (1997)", "J. K. Rowling");
        library.addBook("Chamber of Secrets (1998)","J. K. Rowling");
        library.addBook("Prisoner of Azkaban (1999)", "J. K. Rowling");
        library.addBook("Goblet of Fire (2000)", "J. K. Rowling");
        library.addBook("Order of the Phoenix (2003)","J. K. Rowling" );
        library.addBook("Half-Blood Prince (2005)","J. K. Rowling" );
        library.addBook("Deathly Hallows  Part 1", "J. K. Rowling");
        library.addBook("Deathly Hallows  Part 2", "J. K. Rowling");


        library.removeBook("drink", "ivan");
        library.bookList();
    }
}
