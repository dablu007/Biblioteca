package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.*;
import com.twu.biblioteca.view.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IView welcomeView = new ViewWelcomeMessage();
        Inputs inputs = new Inputs();
        ArrayList<IRentableType> books = inputs.addItems();
        Library library = new Library(books, new ArrayList<IRentableType>());
        IView optionsView = new ViewShowOptions();
        IView viewShowAdminMenu = new ViewShowAdminMenu();
        welcomeView.show();
        User user = new User("LIB001", "1", "123456789", "Dablu", "user");
        User adminUser = new User("LIB003", "1", "123456789", "Dablu", "admin");
        MenuOptions menuOptions = new MenuOptions(library, user);
        AdminMenuOptions adminMenuOptions = new AdminMenuOptions(library, user);
        while(true) {
                System.out.println("Enter the User Id");
                String name = scanner.next();
                System.out.println("Enter the Password");
                String password = scanner.next();
                if (user.isValid(name, password) && user.isNotAdmin()) {
                    UserMenu userMenu = new UserMenu(menuOptions, optionsView);
                    userMenu.show();
                }
                else if (adminUser.isValid(name, password) && (!adminUser.isNotAdmin() )){
                    AdminMenu adminMenu = new AdminMenu(library,adminMenuOptions, viewShowAdminMenu);
                    adminMenu.show();
                }
                else {
                    System.out.println("Not A Valid User");
                }

        }
    }
}
