package org.svarb.svarbneticsapi.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrganismTest {

    private Organism organism;
    private List<Chromosome> chromosomes;

    @BeforeEach
    public void setUp() {
        // Create sample chromosomes for testing
        Chromosome chromosome1 = new Chromosome(1, "Chromosome1", new HashSet<>());
        Chromosome chromosome2 = new Chromosome(2, "Chromosome2", new HashSet<>());

        // Create a list of chromosomes and add the created chromosomes to it
        chromosomes = new ArrayList<>();
        chromosomes.add(chromosome1);
        chromosomes.add(chromosome2);

        // Initialize a sample Organism instance
        organism = new Organism(1, "Human", chromosomes);
    }

    @Test
    public void testConstructorWithArguments() {
        assertEquals(1, organism.getId());
        assertEquals("Human", organism.getName());
        assertEquals(chromosomes, organism.getChromosomes());
        assertTrue(organism.getChromosomes().containsAll(chromosomes));
    }

    @Test
    public void testNoArgsConstructor() {
        Organism emptyOrganism = new Organism();
        assertEquals(0, emptyOrganism.getId()); // Assuming default id is 0
        assertEquals(null, emptyOrganism.getName()); // Assuming default name is null
        assertEquals(null, emptyOrganism.getChromosomes()); // Assuming default chromosomes is null
    }

    @Test
    public void testGetId() {
        assertEquals(1, organism.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("Human", organism.getName());
    }

    @Test
    public void testGetChromosomes() {
        assertEquals(chromosomes, organism.getChromosomes());
        assertTrue(organism.getChromosomes().containsAll(chromosomes));
    }
}
