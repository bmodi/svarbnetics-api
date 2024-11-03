package org.svarb.svarbneticsapi.model;

import java.util.Set;

public class Chromosome {
    private int id;
    private String number;
    private Set<Trait> traits;

    public Chromosome() {}
    
    // Constructor
    public Chromosome(int id, String number, Set<Trait> traits) {
        this.id = id;
        this.number = number;
        this.traits = traits;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Set<Trait> getTraits() {
        return traits;
    }

    public void setTraits(Set<Trait> traits) {
        this.traits = traits;
    }
}
