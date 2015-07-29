package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;

public class ViewListOfBooks implements IView{
    private Formatters formatters;
    public ViewListOfBooks(Formatters formatters) {
        this.formatters = formatters;
    }

    @Override
    public void show() {
        System.out.println("------------------------------Avilable Books--------------------------");
        System.out.println(String.format("%s%17s%17s%27s", "Book No.", "BookName", "Author", "Publication"));
        ArrayList<HashMap> books = formatters.format();
        for (int i = 0; i < books.size(); i++) {
            HashMap book = books.get(i);
            System.out.println(String.format("%s%20s%27s%17s", book.get("bookNo"), book.get("bookName"), book.get("author"),
                    book.get("publication")));
            System.out.println("----------------------------------------------------------------------");
        }

    }
}
