import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;

    @Before
    public void before(){
        library = new Library(3);
        book1 = new Book("hello", "me", "fun");
        book2 = new Book("hi", "you", "fun");
        book3 = new Book("yo", "yu", "fun");
        book4 = new Book("howdee", "them", "fun");
    }

    @Test
    public void numberOfBooks(){
        library.addBooks(book1);
        library.addBooks(book2);
        library.addBooks(book3);
        library.addBooks(book4);
        assertEquals(3, library.bookCount());
    }

    @Test
    public void canAddBook(){

    }


}
