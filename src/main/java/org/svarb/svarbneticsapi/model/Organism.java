package org.svarb.svarbneticsapi.model;

public class Organism {
    private int id;
    private String name;

    // Constructor
    public Organism(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
