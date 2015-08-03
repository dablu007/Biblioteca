package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.IRentableType;
import com.twu.biblioteca.model.Inputs;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.view.IView;
import com.twu.biblioteca.view.ViewShowOptions;
import com.twu.biblioteca.view.ViewWelcomeMessage;

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
        welcomeView.show();
        String  option;
        System.out.println("1.User");
        System.out.println("2.Admin");
        System.out.println("Enter Your Choice");
        String input = scanner.next();
        if (input.equals("1")) {
            System.out.println("Enter the Library Number");
            String name = scanner.next();
            System.out.println("Enter the Password");
            String password = scanner.next();
            User user = new User();
            if (user.isValid(name,password)) {
                MenuOptions menuOptions = new MenuOptions(library, user);
                while (true) {
                    optionsView.show();
                    System.out.println("Enter Your Choice");
                    option = scanner.next();
                    IOperation operation = menuOptions.getOperation(option);
                    operation.execute();
                }
            }
            else{
                System.out.println("Not A Valid User");
            }
        }
    }
}
