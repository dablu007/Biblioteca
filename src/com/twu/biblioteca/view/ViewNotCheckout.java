package com.twu.biblioteca.view;

import com.twu.biblioteca.model.RentableType;

public class ViewNotCheckout implements IView {

    private RentableType type;

    public ViewNotCheckout(RentableType type) {
        this.type = type;
    }

    @Override
    public void show() {
        System.out.println("That "+type+" is not available");
    }
}
