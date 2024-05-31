package org.svarb.svarbneticsapi.repository;

import org.svarb.svarbneticsapi.model.Organism;

import java.util.List;
import java.util.Optional;

public interface OrganismRepository {
    List<Organism> findAll();
    Optional<Organism> findById(int id);
}
