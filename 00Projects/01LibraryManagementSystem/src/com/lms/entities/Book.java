package com.lms.entities;

public class Book extends LibraryItem implements Borrowable{
    boolean isAvailable = true;

    public Book(String title, String ISBN, int publicationYear) {
        super(title, ISBN, publicationYear);
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void borrow(){
        if(isAvailable){
            isAvailable = false;
            System.out.println(super.getTitle() + " Book Has Borrowed.");
        }
        else {
            System.out.println(super.getTitle() + " is already borrowed.");
        }
    }

    @Override
    public void borrowItem() {
        borrow();
    }

    @Override
    public void returnItem() {
        isAvailable = true;
        System.out.println(super.getTitle() + " has been returned.");
    }

    public boolean search(String title) {
        return super.getTitle().equalsIgnoreCase(title);
    }

    public boolean search(String title, String ISBN) {
        return super.getTitle().equalsIgnoreCase(title) &&  super.getISBN().equalsIgnoreCase(ISBN);
    }

}
