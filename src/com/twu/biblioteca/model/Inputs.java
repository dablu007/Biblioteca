package com.twu.biblioteca.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Inputs {

    public ArrayList<IRentableType> addItems() {
        Book bookOne = new Book("Java","James Gosling","TMH");
        Book bookTwo = new Book("C++","Bjarne Stroutstrup","TMH");
        Book bookThree = new Book("C","Dennis Richie","TMH");
        Movie movieOne = new Movie("Harry Potter 1","2001","Chris Columbus","10");
        Movie movieTwo = new Movie("Harry Potter 2","2004","Chris Columbus","9");
        Movie movieThree = new Movie("Harry Potter 3","2005","Chris Columbus","8");
        ArrayList<IRentableType> list = new ArrayList<IRentableType>();
        list.add(bookOne);
        list.add(bookTwo);
        list.add(bookThree);
        list.add(movieOne);
        list.add(movieTwo);
        list.add(movieThree);
        return list;
    }


    public String getBookName() {
        String bookNoForCheckout = new String();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            bookNoForCheckout = bufferedReader.readLine();
            return bookNoForCheckout;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookNoForCheckout;
    }
}
