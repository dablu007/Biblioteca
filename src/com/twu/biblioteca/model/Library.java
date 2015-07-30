package com.twu.biblioteca.model;

import com.twu.biblioteca.view.IView;
import com.twu.biblioteca.view.ViewCheckoutBook;
import com.twu.biblioteca.view.ViewNotCheckoutBook;
import com.twu.biblioteca.view.ViewReturnBook;

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

    public void checkoutBook(String bookNo) {
        HashMap book;
        IView checkoutBook = new ViewCheckoutBook();
        IView notCheckoutBook = new ViewNotCheckoutBook();
        boolean checkout = false;
        for (int i = 0; i < books.size(); i++) {
            book = books.get(i);
            if (book.get("bookNo") == bookNo && book.get("availability").equals("available")){
                book.remove("availability");
                book.put("availability", "not-available");
                checkout = true;
                checkoutBook.show();
                return ;
            }
        }
        if (!checkout)
            notCheckoutBook.show();
    }


    public void returnBook(String bookNo) {
        HashMap book;
        IView view = new ViewReturnBook();
        boolean returned = false;
        for (int i = 0; i < books.size(); i++) {
            book = books.get(i);
            if (book.get("bookNo") == bookNo && book.get("availability").equals("not-available")){
                book.remove("availability");
                book.put("availability", "available");
                returned = true;
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
