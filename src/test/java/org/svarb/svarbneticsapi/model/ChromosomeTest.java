package org.svarb.svarbneticsapi.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChromosomeTest {

    private Chromosome chromosome;
    private Organism organism;

    @BeforeEach
    public void setUp() {
        organism = new Organism(100, "Human");
        chromosome = new Chromosome(1, organism, "Chromosome1");
    }

    @Test
    public void constructor() {
        assertEquals(1, chromosome.getId());
        assertEquals(organism, chromosome.getOrganism());
        assertEquals("Chromosome1", chromosome.getChromosomeNumber());
    }

    @Test
    public void getId() {
        assertEquals(1, chromosome.getId());
    }

    @Test
    public void getOrganism() {
        assertEquals(organism, chromosome.getOrganism());
    }

    @Test
    public void getChromosomeNumber() {
        assertEquals("Chromosome1", chromosome.getChromosomeNumber());
    }
}
