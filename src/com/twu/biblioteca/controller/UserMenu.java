package com.twu.biblioteca.controller;

import com.twu.biblioteca.view.IView;

import java.util.Scanner;

public class UserMenu {
    private MenuOptions menuOptions;
    private IView view;

    public UserMenu(MenuOptions menuOptions, IView view) {
        this.menuOptions = menuOptions;
        this.view = view;
    }

    public void show(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            view.show();
            System.out.println("Enter Your Choice");
            String option = scanner.next();
            IOperation operation = menuOptions.getOperation(option);
            if (operation.execute() == 1)
                break;
        }
    }
}
