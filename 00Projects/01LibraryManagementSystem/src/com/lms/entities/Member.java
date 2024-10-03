package com.lms.entities;

import java.util.ArrayList;
import java.util.List;

public class Member extends Persion {
    private String membershipId;
    private List<String> brrowedBooks = new ArrayList<>();

    public Member() {
        this.membershipId = null;
    }

    public Member(String name, int id, String membershipId) {
        super(name, id);
        this.membershipId = membershipId;
    }

    public void borrowBook(String book) {
        brrowedBooks.add(book);
        System.out.println( super.getName() + " Borrowed " + book);
    }

    public void returnBook(String book){
        brrowedBooks.remove(book);
        System.out.println( super.getName() + " Returned " + book);
    }

    @Override
    public void getDetails(){
        super.getDetails();
        System.out.println("Membership ID : " + this.membershipId);
    }

}
