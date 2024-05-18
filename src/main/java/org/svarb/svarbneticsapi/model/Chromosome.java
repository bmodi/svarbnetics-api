package org.svarb.svarbneticsapi.model;

public class Chromosome {
    private int id;
    private Organism organism;
    private String chromosomeNumber;

    // Constructor
    public Chromosome(int id, Organism organism, String chromosomeNumber) {
        this.id = id;
        this.organism = organism;
        this.chromosomeNumber = chromosomeNumber;
    }

    // Getters
    public int getId() {
        return id;
    }

    public Organism getOrganism() {
        return organism;
    }

    public String getChromosomeNumber() {
        return chromosomeNumber;
    }
}
