package org.example;


public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book(1,"Clean code","Martin Richard","coding", true));
         Book cleancode =  library.getBookByTitle("Clean code");
        cleancode.changeAvailability();
        cleancode.addPersonToWaitingList(new Reader());

        System.out.println(library.books.isEmpty());
        System.out.println(cleancode.isAvailable());


    }
}