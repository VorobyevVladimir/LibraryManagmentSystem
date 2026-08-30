package org.example;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    private int id;
    private String name;
    private List<Book> borrowedBooks = new ArrayList<>();

    public Reader(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    void showBorrowedBooks(){
        System.out.println(name + "'s borrowed books: ");
        getBorrowedBooks().forEach((element) -> {
            System.out.println(element.toString());
        });
    }

    public void addBorrowedBook(Book book){
        borrowedBooks.add(book);
    }

    @Override
    public String toString() {
        return name;
    }
}
