package org.svarb.svarbneticsapi.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TraitTest {

    private Trait trait;
    private Chromosome chromosome;

    @BeforeEach
    public void setUp() {
        // Create a sample Chromosome for testing
        chromosome = new Chromosome(1, new Organism(100, "Human"), "Chromosome1");

        // Initialize a sample Trait instance
        trait = new Trait(1, chromosome, "Eye Color", "EYECOL");
    }

    @Test
    public void constructor() {
        assertEquals(1, trait.getId());
        assertEquals(chromosome, trait.getChromosome());
        assertEquals("Eye Color", trait.getName());
        assertEquals("EYECOL", trait.getLocus());
    }

    @Test
    public void getId() {
        assertEquals(1, trait.getId());
    }

    @Test
    public void getChromosome() {
        assertEquals(chromosome, trait.getChromosome());
    }

    @Test
    public void getName() {
        assertEquals("Eye Color", trait.getName());
    }

    @Test
    public void getLocus() {
        assertEquals("EYECOL", trait.getLocus());
    }
}
