package org.example;


import java.util.LinkedList;
import java.util.Queue;

public class Book {
    private int id;
    private String title;
    private String author;
    private String genre;
    private boolean isAvailable;
    private Queue<Reader> waitingList = new LinkedList<>();

    public Book(int id, String title, String author, String genre, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public Queue<Reader> getWaitingList() {
        return waitingList;
    }

    void addPersonToWaitingList(Reader reader){
        waitingList.add(reader);
    }

    void changeAvailability(){
        if (isAvailable == true){
            isAvailable = false;
        }
        else {
            isAvailable = true;
        }
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}
