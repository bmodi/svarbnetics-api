package org.svarb.svarbneticsapi.model;

public class Trait {
    private int id;
    private Chromosome chromosome;
    private String name;
    private String locus;

    // Constructor
    public Trait(int id, Chromosome chromosome, String name, String locus) {
        this.id = id;
        this.chromosome = chromosome;
        this.name = name;
        this.locus = locus;
    }

    // Getters
    public int getId() {
        return id;
    }

    public Chromosome getChromosome() {
        return chromosome;
    }

    public String getName() {
        return name;
    }

    public String getLocus() {
        return locus;
    }
}
