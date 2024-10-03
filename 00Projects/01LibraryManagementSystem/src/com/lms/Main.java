package com.lms;

import com.lms.entities.Book;
import com.lms.entities.Librarian;
import com.lms.entities.Member;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Java Fundamentals", "123-456", 2021);
        Book book2 = new Book("OOP Concepts", "789-012", 2024);

        System.out.println();

        Librarian librarian = new Librarian("Om", 1, "LIB001");

        Member member = new Member("Vaibhav", 2, "MEM001");



        librarian.addBook(book1);
        librarian.addBook(book2);

        System.out.println();

        member.borrowBook( book1.getTitle() );
        book1.borrowItem();

        System.out.println();

        member.returnBook( book1.getTitle() );
        book1.returnItem();

        System.out.println();

    }
}