package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.view.IView;

import java.util.Scanner;

public class AdminMenu {
    private Library library;
    private AdminMenuOptions menuOptions;
    private IView view;


    public AdminMenu(Library library, AdminMenuOptions adminMenuOptions, IView viewShowAdminMenu) {

        this.library = library;
        this.menuOptions = adminMenuOptions;
        view = viewShowAdminMenu;
    }

    public void show(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            view.show();
            System.out.println("Enter your choice");
            String option = scanner.next();
            IOperation operation = menuOptions.getOperation(option);
            if (operation.execute() == 1)
                break;
        }
    }
}
