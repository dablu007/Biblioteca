package com.twu.biblioteca.view;

public class ViewShowAdminMenu implements IView {

    @Override
    public void show() {
        System.out.println("1.List Books");
        System.out.println("2.Checkout a Book");
        System.out.println("3.Return a Book");
        System.out.println("4.List Movies");
        System.out.println("5.Checkout Movie");
        System.out.println("6.Return Movie");
        System.out.println("7.User Details");
        System.out.println("8.List Checkout Books");
        System.out.println("9.List Checkout Movie");
        System.out.println("10.Check Item Issued Against User");
        System.out.println("11.Quit");
    }
}
