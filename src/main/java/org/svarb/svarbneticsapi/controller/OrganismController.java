package org.svarb.svarbneticsapi.controller;

import org.svarb.svarbneticsapi.mapper.OrganismMapper;
import org.svarb.svarbneticsapi.model.Organism;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrganismController {

    private final OrganismMapper organismMapper;

    @Autowired
    public OrganismController(OrganismMapper organismMapper) {
        this.organismMapper = organismMapper;
    }

    @GetMapping("/organisms")
    public List<Organism> getAllOrganisms() {
        return organismMapper.findAll();
    }

    @GetMapping("/organisms/{id}")
    public Organism getOrganismById(@PathVariable int id) {
        return organismMapper.findById(id);
    }
}
