package org.svarb.svarbneticsapi.model;

import java.util.Set;

public class Trait {
    private int id;
    private String name;
    private String locus;
    private Set<Gene> genes;

    // Constructor
    public Trait(int id, String name, String locus, Set<Gene> genes) {
        this.id = id;
        this.name = name;
        this.locus = locus;
        this.genes = genes;
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

    public String getLocus() {
        return locus;
    }

    public void setLocus(String locus) {
        this.locus = locus;
    }

    public Set<Gene> getGenes() {
        return genes;
    }

    public void setGenes(Set<Gene> genes) {
        this.genes = genes;
    }
}
