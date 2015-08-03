package com.twu.biblioteca.view;

import com.twu.biblioteca.model.RentableType;

public class ViewCheckout implements IView {
    private RentableType type;
    public ViewCheckout(RentableType book) {
        type = book;
    }

    @Override
    public void show() {
        System.out.println("Thank you! Enjoy the "+ type);
    }
}
