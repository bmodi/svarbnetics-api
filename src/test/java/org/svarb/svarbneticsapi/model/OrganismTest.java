package org.svarb.svarbneticsapi.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrganismTest {

    private Organism organism;

    @BeforeEach
    public void setUp() {
        organism = new Organism(1, "Human");
    }

    @Test
    public void consructor() {
        assertEquals(1, organism.getId());
        assertEquals("Human", organism.getName());
    }

    @Test
    public void getId() {
        assertEquals(1, organism.getId());
    }

    @Test
    public void getName() {
        assertEquals("Human", organism.getName());
    }
}
