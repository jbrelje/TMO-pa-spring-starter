package com.galvanize.tmo.paspringstarter.models;

import java.util.ArrayList;
import java.util.Comparator;

public class Library {

    private ArrayList<Book> books;

    public Library() {
    }

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBooks(Book book) {
        this.books.add(book);
    }

    public void sortBooks() {
        books.sort(Comparator.comparing(Book::getTitle));
    }
}
