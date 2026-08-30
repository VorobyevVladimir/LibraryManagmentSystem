package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Library {
    Map<String, Book> books = new HashMap<>();
    Map<Integer, Reader> readers = new HashMap<>();
    Set<String> authors;
    Set<String> genres;

    void addBook(Book book){
        books.put(book.getTitle(),book);
    }

    void removeBook(String title){
        books.remove(title);
    }

    Book borrowBookByTitle(String title, Reader reader){
        Book book = books.get(title);
        book.changeAvailability();
        book.addPersonToWaitingList(reader);
        return book;
    }


}
