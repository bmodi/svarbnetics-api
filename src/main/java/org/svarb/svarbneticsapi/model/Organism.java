package org.svarb.svarbneticsapi.model;

import java.util.Set;

public class Organism {
    private int id;
    private String name;
    private Set<Chromosome> chromosomes;

    public Organism() {}
    
    // Constructor
    public Organism(int id, String name, Set<Chromosome> chromosomes) {
        this.id = id;
        this.name = name;
        this.chromosomes = chromosomes;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Chromosome> getChromosomes() {
        return chromosomes;
    }

    public void setChromosomes(Set<Chromosome> chromosomes) {
        this.chromosomes = chromosomes;
    }
}
