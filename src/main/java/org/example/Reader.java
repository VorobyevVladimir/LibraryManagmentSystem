package org.example;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    private int id;
    private String name;
    List<Book> borrowedBooks = new ArrayList<>();

    public Reader(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addBorrowedBook(Book book){
        borrowedBooks.add(book);
    }
}
