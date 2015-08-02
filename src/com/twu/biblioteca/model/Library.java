package com.twu.biblioteca.model;

import com.twu.biblioteca.view.*;

import java.util.ArrayList;

public class Library {
    private ArrayList<IRentableType> availableList;
    private ArrayList<IRentableType> checkoutList;

    public ArrayList<IRentableType> getAvailableList() {
        return availableList;
    }

    public ArrayList<IRentableType> getCheckoutList() {
        return checkoutList;
    }

    public Library(ArrayList<IRentableType> availableList, ArrayList<IRentableType> checkoutList) {
        this.availableList = availableList;
        this.checkoutList = checkoutList;
    }


    public void exit() {
        System.exit(0);
    }


    public void checkoutItem(String bookName) {
        Book book;
        IView checkoutBook = new ViewCheckoutBook();
        IView notCheckoutBook = new ViewNotCheckoutBook();
        boolean checkout = false;
        for (int i = 0; i < availableList.size(); i++) {
            book = (Book) availableList.get(i);
            if (book.hasTitle(bookName)){
                availableList.remove(i);
                checkoutList.add(book);
                checkoutBook.show();
                checkout = true;
            }

        }
        if (!checkout)
            notCheckoutBook.show();
    }
    public void returnItem(String bookName) {
        Book book;
        IView returnBook = new ViewReturnBook();
        IView notReturnBook = new ViewNotReturnBook();
        boolean bookReturned = false;
        for (int i = 0; i < checkoutList.size(); i++) {
            book = (Book) checkoutList.get(i);
            if (book.hasTitle(bookName)){
                checkoutList.remove(i);
                availableList.add(book);
                returnBook.show();
                bookReturned = true;
            }

        }
        if (!bookReturned)
            notReturnBook.show();
    }
}
