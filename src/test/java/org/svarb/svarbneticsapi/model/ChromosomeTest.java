package org.svarb.svarbneticsapi.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChromosomeTest {

    private Chromosome chromosome;
    private Set<Trait> traits;

    @BeforeEach
    public void setUp() {
        // Create sample traits for testing
        Trait trait1 = new Trait(1, "Eye Color", "EYECOL", new HashSet<>());
        Trait trait2 = new Trait(2, "Hair Color", "HAIRC", new HashSet<>());

        // Create a set of traits and add the created traits to it
        traits = new HashSet<>();
        traits.add(trait1);
        traits.add(trait2);

        // Initialize a sample Chromosome instance
        chromosome = new Chromosome(1, "Chromosome1", traits);
    }

    @Test
    public void testConstructorWithArguments() {
        assertEquals(1, chromosome.getId());
        assertEquals("Chromosome1", chromosome.getNumber());
        assertEquals(traits, chromosome.getTraits());
    }

    @Test
    public void testNoArgsConstructor() {
        Chromosome emptyChromosome = new Chromosome();
        assertEquals(0, emptyChromosome.getId()); // Assuming default id is 0
        assertNull(emptyChromosome.getNumber()); // Assuming default number is null
        assertNull(emptyChromosome.getTraits()); // Assuming default traits is null
    }

    @Test
    public void testGetId() {
        assertEquals(1, chromosome.getId());
    }

    @Test
    public void testGetNumber() {
        assertEquals("Chromosome1", chromosome.getNumber());
    }

    @Test
    public void testGetTraits() {
        assertEquals(traits, chromosome.getTraits());
    }
}
