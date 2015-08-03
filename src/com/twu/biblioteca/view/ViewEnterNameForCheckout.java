package com.twu.biblioteca.view;

import com.twu.biblioteca.model.RentableType;

public class ViewEnterNameForCheckout implements IView {

    private RentableType type;

    public ViewEnterNameForCheckout(RentableType type) {
        this.type = type;
    }

    @Override
    public void show() {
        System.out.println("Enter A "+type +" Name");
    }
}
