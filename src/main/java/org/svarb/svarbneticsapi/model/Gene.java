package org.svarb.svarbneticsapi.model;

public class Gene {
    private int id;
    private Trait trait;
    private String name;

    // Constructor
    public Gene(int id, Trait trait, String name) {
        this.id = id;
        this.trait = trait;
        this.name = name;
    }

    // Getters
    public int getId() {
        return id;
    }

    public Trait getTrait() {
        return trait;
    }

    public String getName() {
        return name;
    }
}
