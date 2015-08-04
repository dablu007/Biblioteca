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
        welcomeView.show();
        String  option;
        User user = new User("LIB001", "123456", "123456789", "Dablu", "user");
        User adminUser = new User("LIB003", "123456", "123456789", "Dablu", "admin");
        MenuOptions menuOptions = new MenuOptions(library, user);
        while(true) {
                System.out.println("Enter the User Id");
                String name = scanner.next();
                System.out.println("Enter the Password");
                String password = scanner.next();
                if (user.isValid(name, password) && user.isNotAdmin()) {
                    while (true) {
                        optionsView.show();
                        System.out.println("Enter Your Choice");
                        option = scanner.next();
                        IOperation operation = menuOptions.getOperation(option);
                        if (operation.execute() == 1)
                            break;
                    }
                }
                else if (adminUser.isValid(name, password) && (!adminUser.isNotAdmin() )){
                    System.out.println("Enter the Item Name to Check");
                    String itemName = scanner.next();
                    IssueDetail issueDetail = library.getIssueDetail(itemName);
                    IView viewShowIssuedHistory = new ViewShowIssuedHistory(issueDetail, itemName);
                    viewShowIssuedHistory.show();
                }
                else {
                    System.out.println("Not A Valid User");
                }

        }
    }
}
