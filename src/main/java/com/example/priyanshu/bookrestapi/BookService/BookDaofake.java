package com.example.priyanshu.bookrestapi.BookService;
import java.util.*;
import com.example.priyanshu.bookrestapi.Entity.Book;

public class BookDaofake {

    private static List<Book> books = new ArrayList<Book>();

    static {
        books.add(new Book(1, "Title 1","author 1"));
        books.add(new Book(2, "Title 2","author 2"));
        books.add(new Book(3, "Title 3","author 3"));
        books.add(new Book(4, "Title 4","author 4"));
    }
    public static List<Book> getAllBooks() {
        return books;
    }

    public static Book getBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }
    public static Book getBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

}
