package org.svarb.svarbneticsapi.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrganismTest {

    private Organism organism;

    @BeforeEach
    public void setUp() {
        organism = new Organism(1, "Human");
    }

    @Test
    public void constructor() {
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
