package org.svarb.svarbneticsapi.controller;

import org.svarb.svarbneticsapi.model.Organism;
import org.svarb.svarbneticsapi.repository.OrganismRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class OrganismController {

    private final OrganismRepository organismRepository;

    @Autowired
    public OrganismController(OrganismRepository organismRepository) {
        this.organismRepository = organismRepository;
    }

    @GetMapping("/organisms")
    public List<Organism> getAllOrganisms() {
        return organismRepository.findAll();
    }

    @GetMapping("/organisms/{id}")
    public Organism getOrganismById(@PathVariable int id) {
        Optional<Organism> organism = organismRepository.findById(id);
        return organism.orElse(null); // In a real application, you should handle the case when the organism is not found
    }
}
