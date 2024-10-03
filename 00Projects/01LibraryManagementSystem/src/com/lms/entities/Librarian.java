package com.lms.entities;

public class Librarian extends Persion {
    private String employeeId;

    public Librarian() {
        super();
        this.employeeId = null;
    }

    public Librarian(String name, int id, String employeeId) {
        super(name, id);
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }


    public void addBook(LibraryItem book){
        System.out.println("Librarian Added " + book.getTitle() );
    }
    public void removeBook(LibraryItem book)
    {
        System.out.println("Librarian Removed " + book.getTitle() );
    }

    @Override
    public void getDetails()
    {
        super.getDetails();
        System.out.println("Employee ID : " + this.employeeId);
    }


}
