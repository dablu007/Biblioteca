package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        View view = new View();
        IView welcomeView = new WelcomeMessage();
        Inputs inputs = new Inputs();
        ArrayList<HashMap> books = inputs.addBooks();
        Library library = new Library(books);
        Formatters formatters = new Formatters(library);
        IView listBooksView = new ViewListOfBooks(formatters);
        welcomeView.show();
        int option;
        while (true){
            try {
                view.showOptions();
                System.out.println("Enter Your Choice");
                option = Integer.parseInt(br.readLine());
                Menu menu = new Menu(library, listBooksView);
                menu.executeCommand(option);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
