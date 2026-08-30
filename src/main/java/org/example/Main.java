package org.example;


public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book(1,"Clean code","Robert Martin","technical non-fiction",true));
        library.addBook(new Book(2,"Ogniem i mieczem","Henryk Sienkiewicz","History",true));
        library.addBook(new Book(3,"Grokking Algorithms","Aditya Bhargava","technical non-fiction",true));

        Reader Alex = new  Reader(1, "Alex");
        Reader Audrey = new  Reader(2, "Audrey");

        library.borrowBookByTitle("Clean code", Alex);
        library.bookStatus("Clean code");
        library.borrowBookByTitle("Clean code", Audrey);
        library.bookStatus("Clean code");

        library.borrowBookByTitle("Grokking Algorithms", Alex);
        Alex.showBorrowedBooks();



    }
}