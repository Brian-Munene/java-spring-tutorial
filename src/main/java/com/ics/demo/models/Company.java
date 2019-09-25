package com.ics.demo.models;

public class Company {
    private long id;
    private long name;

    public Company(long id, long name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getName() {
        return name;
    }

    public void setName(long name) {
        this.name = name;
    }
}
