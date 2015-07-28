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
        Inputs inputs = new Inputs();
        ArrayList<HashMap> books = inputs.addBooks();
        Library library = new Library(books);
        view.showWelcomeMessage();
        view.showOptions();
        try {
            System.out.println("Enter Your Choice");
            int option = Integer.parseInt(br.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }
        Menu menu = new Menu(library, view);
        menu.executeCommand(1);
    }
}
