package com.twu.biblioteca.view;


public class ViewInvalidMessage implements IView {

    @Override
    public void show() {
        System.out.println("Select a valid option!");
    }
}
