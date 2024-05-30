package org.svarb.svarbneticsapi.controller;

import org.svarb.svarbneticsapi.model.Organism;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OrganismController {

    @GetMapping("/organism")
    public Organism getOrganism() {
        // Return a hard-coded Organism object
        return new Organism(1, "Sample Organism");
    }
}
