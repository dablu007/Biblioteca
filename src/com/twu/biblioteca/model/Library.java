package com.twu.biblioteca.model;

import com.twu.biblioteca.view.*;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> availableBooks;
    private ArrayList<Book> checkoutBooks;

    public Library(ArrayList<Book> availableBooks, ArrayList<Book> checkoutBooks) {
        this.availableBooks = availableBooks;
        this.checkoutBooks = checkoutBooks;
    }


    public void exit() {
        System.exit(0);
    }

    public void checkoutBook(String bookName) {
        Book book;
        IView checkoutBook = new ViewCheckoutBook();
        IView notCheckoutBook = new ViewNotCheckoutBook();
        boolean checkout = false;
        for (int i = 0; i < availableBooks.size(); i++) {
            book = availableBooks.get(i);
            if (book.hasTitle(bookName)){
                availableBooks.remove(i);
                checkoutBooks.add(book);
                checkoutBook.show();
                checkout = true;
            }

        }
        if (!checkout)
            notCheckoutBook.show();
    }
    public void returnBook(String bookName) {
        Book book;
        IView returnBook = new ViewReturnBook();
        IView notReturnBook = new ViewNotReturnBook();
        boolean bookReturned = false;
        for (int i = 0; i < checkoutBooks.size(); i++) {
            book = checkoutBooks.get(i);
            if (book.hasTitle(bookName)){
                checkoutBooks.remove(i);
                availableBooks.add(book);
                returnBook.show();
                bookReturned = true;
            }

        }
        if (!bookReturned)
            notReturnBook.show();
    }
}
