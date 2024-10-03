package com.lms.entities;

abstract public class LibraryItem {
    private String title;
    private String ISBN;
    private int publicationYear;

    public LibraryItem(String title, String ISBN, int publicationYear) {
        this.title = title;
        this.ISBN = ISBN;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public abstract void borrow();
}
