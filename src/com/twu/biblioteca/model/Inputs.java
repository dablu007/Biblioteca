package com.twu.biblioteca.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Inputs {
    public ArrayList<HashMap> addBooks() {
        HashMap bookOne = new HashMap();
        HashMap bookTwo = new HashMap();
        bookOne.put("bookNo", "1");
        bookOne.put("bookName", "Java");
        bookOne.put("availability", "available");
        bookOne.put("author", "James Gosling");
        bookOne.put("publication", "TMH");
        bookTwo.put("bookNo", "2");
        bookTwo.put("bookName", "C++");
        bookTwo.put("availability", "available");
        bookTwo.put("author", "James Stroutstrup");
        bookTwo.put("publication", "TMH");
        ArrayList<HashMap> books = new ArrayList<HashMap>();
        books.add(bookOne);
        books.add(bookTwo);
        return books;
    }

    public String getBookNo() {
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
