package org.svarb.svarbneticsapi.controller;

import org.svarb.svarbneticsapi.mapper.ChromosomeMapper;
import org.svarb.svarbneticsapi.model.Chromosome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ChromosomeController {

    private final ChromosomeMapper chromosomeMapper;

    @Autowired
    public ChromosomeController(ChromosomeMapper chromosomeMapper) {
        this.chromosomeMapper = chromosomeMapper;
    }

    @GetMapping("/chromosomes")
    public List<Chromosome> getAllChromosomes() {
        return chromosomeMapper.findAll();
    }

    @GetMapping("/chromosomes/{id}")
    public Chromosome getChromosomeById(@PathVariable int id) {
        return chromosomeMapper.findById(id);
    }
}
