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


    public void checkoutItem(String bookName, RentableType type) {
        IView viewCheckout = new ViewCheckout(type);
        IView notCheckout = new ViewNotCheckout(type);
        boolean checkout = false;
        for (int i = 0; i < availableList.size(); i++) {
            IRentableType item =  availableList.get(i);
            if (item.isAvilable(bookName) && item.isSameType(type)){
                availableList.remove(i);
                checkoutList.add(item);
                viewCheckout.show();
                checkout = true;
            }

        }
        if (!checkout)
            notCheckout.show();
    }
    public void returnItem(String bookName, RentableType type) {
        IView returnItem = new ViewReturn(type);
        IView notReturnItem = new ViewNotReturn(type);
        boolean bookReturned = false;
        for (int i = 0; i < checkoutList.size(); i++) {
            IRentableType item = checkoutList.get(i);
            if (item.isAvilable(bookName) && item.isSameType(type)){
                checkoutList.remove(i);
                availableList.add(item);
                returnItem.show();
                bookReturned = true;
            }

        }
        if (!bookReturned)
            notReturnItem.show();
    }
}
