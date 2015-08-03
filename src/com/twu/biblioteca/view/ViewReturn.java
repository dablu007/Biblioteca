package com.twu.biblioteca.view;

import com.twu.biblioteca.model.RentableType;

public class ViewReturn implements IView {

    private RentableType type;

    public ViewReturn(RentableType type) {
        this.type = type;
    }

    @Override
    public void show() {
        System.out.println("Thank you for returning the "+type+".");
    }
}
