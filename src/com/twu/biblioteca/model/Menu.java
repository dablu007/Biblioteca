package com.twu.biblioteca.model;


import com.twu.biblioteca.view.IView;
import com.twu.biblioteca.view.ViewEnterBookNo;
import com.twu.biblioteca.view.ViewInvalidMessage;


public class Menu {
    private Library library;
    private IView view;

    public Menu(Library library,IView view) {
        this.library = library;
        this.view = view;
    }

    public void executeCommand(String command) {
        if (command == null)
            return;
        else if (command.equals("1")){
            view.show();
        }
        else if (command.equals("2")){
            view = new ViewEnterBookNo();
            view.show();
            String bookno = new Inputs().getBookNo();
            this.library.checkoutBook(bookno);
        }
        else if (command.equals("3")){
            view = new ViewEnterBookNo();
            view.show();
            String bookno = new Inputs().getBookNo();
            this.library.returnBook(bookno);
        }
        else if (command.equals("4")){
            this.library.exit();
        }
        else {
            view = new ViewInvalidMessage();
            view.show();
        }
    }
}
