package com.twu.biblioteca.model;


public class Book implements IRentableType{
    private RentableType type;
    private String bookName;
    private String author;
    private String publication;

    public Book(String bookName, String author, String publication) {
        this.bookName = bookName;
        this.author = author;
        this.publication = publication;
        this.type = RentableType.BOOK;
    }

    public boolean hasTitle(String name) {
        return bookName.equals(name);
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublication() {
        return publication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (bookName != null ? !bookName.equals(book.bookName) : book.bookName != null) return false;
        if (author != null ? !author.equals(book.author) : book.author != null) return false;
        return !(publication != null ? !publication.equals(book.publication) : book.publication != null);

    }

    @Override
    public int hashCode() {
        int result = bookName != null ? bookName.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (publication != null ? publication.hashCode() : 0);
        return result;
    }

    @Override
    public boolean isAvilable(String name) {
        return bookName.equals(name);
    }

    @Override
    public RentableType getType() {
        return RentableType.BOOK;
    }

    @Override
    public boolean isEqual(String name) {
        return bookName.equals(name);
    }

    @Override
    public boolean isSameType(RentableType type) {
        return this.type.equals(RentableType.BOOK);
    }
}
