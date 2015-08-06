package com.twu.biblioteca.view;

public class ViewShowAdminMenu implements IView {

    @Override
    public void show() {
        System.out.println("1.List Checkout Books");
        System.out.println("2.List Checkout Movie");
        System.out.println("3.Check Item Issued Against User");
        System.out.println("4.Quit");
    }
}
