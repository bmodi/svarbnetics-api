package org.svarb.svarbneticsapi.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneTest {

    private Gene gene;

    @BeforeEach
    public void setUp() {
        // Initialize a sample Gene instance
        gene = new Gene(1, "G1", "EyeColorGene", true);
    }

    @Test
    public void constructor() {
        assertEquals(1, gene.getId());
        assertEquals("G1", gene.getSymbol());
        assertEquals("EyeColorGene", gene.getName());
        assertEquals(true, gene.isDominant());
    }

    @Test
    public void getId() {
        assertEquals(1, gene.getId());
    }

    @Test
    public void getSymbol() {
        assertEquals("G1", gene.getSymbol());
    }

    @Test
    public void getName() {
        assertEquals("EyeColorGene", gene.getName());
    }

    @Test
    public void isDominant() {
        assertEquals(true, gene.isDominant());
    }
}
