package com.example.lamda.listToMap;

public class Hosting {

    private int Id;
    private String name;
    private long websites;

    public Hosting(int id, String name, long websites) {
        Id = id;
        this.name = name;
        this.websites = websites;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public long getWebsites() {
        return websites;
    }
}