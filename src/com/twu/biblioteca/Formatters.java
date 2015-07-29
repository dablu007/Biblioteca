package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;

public class Formatters {
    private Library library;
    private HashMap map;
    public Formatters(Library library) {
        this.library = library;
    }

    public ArrayList<HashMap> format() {
        map = new HashMap();
        String value = library.toString();
        map = new HashMap<>();
        String[] bookValueAfterSplit = value.split("::");
        ArrayList<HashMap> books = new ArrayList<>();
        for (String s : bookValueAfterSplit) {
            String[] book = s.split(":");
            map = new HashMap();
            map.put("author",book[0]);
            map.put("bookNo",book[1]);
            map.put("bookName",book[4]);
            map.put("availability",book[3]);
            map.put("publication",book[2]);
            books.add(map);
        }
        return books;
    }
}
