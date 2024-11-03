package org.svarb.svarbneticsapi.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TraitTest {

    private Trait trait;
    private Set<Gene> genes;

    @BeforeEach
    public void setUp() {
        // Create sample genes for testing
        Gene gene1 = new Gene(1, "G1", "Gene1", true);
        Gene gene2 = new Gene(2, "G2", "Gene2", false);

        // Create a set of genes and add the created genes to it
        genes = new HashSet<>();
        genes.add(gene1);
        genes.add(gene2);

        // Initialize a sample Trait instance
        trait = new Trait(1, "Eye Color", "EYECOL", genes);
    }

    @Test
    public void constructor() {
        assertEquals(1, trait.getId());
        assertEquals("Eye Color", trait.getName());
        assertEquals("EYECOL", trait.getLocus());
        assertEquals(genes, trait.getGenes());
    }

    @Test
    public void getId() {
        assertEquals(1, trait.getId());
    }

    @Test
    public void getName() {
        assertEquals("Eye Color", trait.getName());
    }

    @Test
    public void getLocus() {
        assertEquals("EYECOL", trait.getLocus());
    }

    @Test
    public void getGenes() {
        assertEquals(genes, trait.getGenes());
        assertTrue(trait.getGenes().containsAll(genes));
    }
}
