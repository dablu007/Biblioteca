package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.*;
import com.twu.biblioteca.view.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        IView welcomeView = new ViewWelcomeMessage();
        Inputs inputs = new Inputs();
        ArrayList<HashMap> books = inputs.addBooks();
        Library library = new Library(books);
        Formatter formatter = new Formatter(library);
        IView listBooks = new ViewListOfBooks(formatter);
        IView optionsView = new ViewShowOptions();
        welcomeView.show();
        int option;

        while (true){
            try {
                optionsView.show();
                System.out.println("Enter Your Choice");
                option = Integer.parseInt(br.readLine());
                Menu menu = new Menu(library, listBooks);
                menu.executeCommand(option);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
