package org.svarb.svarbneticsapi.model;

import java.util.List;

public class Organism {
    private int id;
    private String name;
    private List<Chromosome> chromosomes;

    public Organism() {}
    
    // Constructor
    public Organism(int id, String name, List<Chromosome> chromosomes) {
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

    public List<Chromosome> getChromosomes() {
        return chromosomes;
    }

    public void setChromosomes(List<Chromosome> chromosomes) {
        this.chromosomes = chromosomes;
    }
}
