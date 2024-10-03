package com.lms.entities;

public class Persion {
    private String name;
    private int id;

    public Persion() {
        this.name = "NA";
        this.id = 0;
    }

    public Persion(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDetails(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void getDetails() {
        System.out.println("Name  : " + this.name);
        System.out.println("ID    : " + this.id);
    }
}
