package org.example;

public class Protein implements Food{
    private String name;
    public Protein(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
