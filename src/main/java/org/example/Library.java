package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Library {
    Map<String, Book> books = new HashMap<>();
    private Set<Reader> readers = new HashSet<>();
    Set<String> authors = new HashSet<>();
    Set<String> genres = new HashSet<>();

    void addBook(Book book){
        books.put(book.getTitle(),book);
        authors.add(book.getAuthor());
        genres.add(book.getGenre());
    }

    void removeBook(String title){
        books.remove(title);
    }

    void borrowBookByTitle(String title, Reader reader){
        Book book = books.get(title);
        if (book.isAvailable() == true){
        book.changeAvailability();
        reader.addBorrowedBook(book);
        readers.add(reader);
        }
        else {
            readers.add(reader);
            book.addPersonToWaitingList(reader);
        }
    }

    void bookStatus(String title){
        Book book = books.get(title);
        if(book.isAvailable() == true){
            System.out.println("Book is available");
        }
        else {
            System.out.println("Book isn't available");
            if(book.getWaitingList().isEmpty() == false) {
                System.out.println("Waiting list: ");
                book.getWaitingList().forEach((element) -> {
                    System.out.println(element.toString());
                });
            }
        }
    }

    void showBooks(){
        books.values().forEach((element) -> {
            System.out.println(element.toString());
        });
    }

    void allAuthors(){
        authors.forEach((element) -> {
            System.out.println(element.toString());
        });
    }

    void allGenres(){
        genres.forEach((element) -> {
            System.out.println(element.toString());
        });
    }

    void getAllReaders(){
        readers.forEach((element) -> {
            System.out.println(element.toString());
        });
    }

}
