package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<HashMap> books;

    public Library(ArrayList<HashMap> books) {
        this.books = books;

    }

    public void exit() {
        System.exit(1);
    }

    public ArrayList<HashMap> getBooks() {
        return books;
    }

    public void checkoutBook(int bookNo) {
        HashMap book;
        IView view = new ViewCheckoutBook();
        for (int i = 0; i < books.size(); i++) {
            book = books.get(i);
            if (book.get("bookNo") == bookNo){
                book.remove("availability");
                book.put("availability", "not-available");
                view.show();
                return ;
            }
        }
    }

    @Override
    public String toString() {
        String booksNew = new String();
        for (HashMap book : books){
            booksNew += book.get("author") +":";
            booksNew += book.get("bookNo") +":";
            booksNew += book.get("publication") +":";
            booksNew += book.get("availability") +":";
            booksNew += book.get("bookName") + "::";
        }
        return booksNew;
    }
}
