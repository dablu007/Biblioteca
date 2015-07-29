package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<HashMap> books;
    private View view;
    public Library(ArrayList<HashMap> books, View view) {
        this.books = books;
        this.view = view;
    }

    public void showListOfBooks() {
        view.showListBookMessage();
        HashMap book;
        for (int i = 0; i < books.size(); i++) {
            book = books.get(i);
            if (book.get("availability").equals("available"))
                view.showBook(books.get(i));
        }
    }

    public void exit() {
        System.exit(1);
    }

    public void checkoutBook(int bookNo) {
        HashMap book;
        for (int i = 0; i < books.size(); i++) {
            book = books.get(i);
            if (book.get("bookNo") == bookNo){
                book.remove("availability");
                book.put("availability", "not-available");
                view.showCheckOutMessage();
                return ;
            }
        }
    }
}
