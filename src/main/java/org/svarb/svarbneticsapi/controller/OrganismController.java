package org.svarb.svarbneticsapi.controller;

import org.svarb.svarbneticsapi.model.Organism;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class OrganismController {

    private final List<Organism> organisms;

    public OrganismController() {
        // Create a hard-coded list of Organism objects
        organisms = new ArrayList<>();
        organisms.add(new Organism(1, "Organism One"));
        organisms.add(new Organism(2, "Organism Two"));
        organisms.add(new Organism(3, "Organism Three"));
    }

    @GetMapping("/organisms")
    public List<Organism> getAllOrganisms() {
        // Return the hard-coded list of Organism objects
        return organisms;
    }

    @GetMapping("/organisms/{id}")
    public Organism getOrganismById(@PathVariable int id) {
        // Find the organism by ID in the hard-coded list
        Optional<Organism> organism = organisms.stream().filter(o -> o.getId() == id).findFirst();
        // Return the organism if found, otherwise return null or handle not found case
        return organism.orElse(null); // In a real application, you should handle the case when the organism is not found
    }
}
