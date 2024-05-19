package org.svarb.svarbneticsapi.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneTest {

    private Gene gene;
    private Trait trait;

    @BeforeEach
    public void setUp() {
        // Create a sample Trait for testing
        trait = new Trait(1,new Chromosome(1, new Organism(100, "Human"), "Chromosome1"), "Eye Color", "EYECOL");

        // Initialize a sample Gene instance
        gene = new Gene(1, trait, "EyeColorGene");
    }

    @Test
    public void constructor() {
        assertEquals(1, gene.getId());
        assertEquals(trait, gene.getTrait());
        assertEquals("EyeColorGene", gene.getName());
    }

    @Test
    public void getId() {
        assertEquals(1, gene.getId());
    }

    @Test
    public void getTrait() {
        assertEquals(trait, gene.getTrait());
    }

    @Test
    public void getName() {
        assertEquals("EyeColorGene", gene.getName());
    }
}
