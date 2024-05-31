package org.svarb.svarbneticsapi.repository;

import org.svarb.svarbneticsapi.model.Organism;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class OrganismRepositoryImpl implements OrganismRepository {

    private final List<Organism> organisms;

    public OrganismRepositoryImpl() {
        // Create a hard-coded list of Organism objects
        organisms = new ArrayList<>();
        organisms.add(new Organism(1, "Organism One"));
        organisms.add(new Organism(2, "Organism Two"));
        organisms.add(new Organism(3, "Organism Three"));
    }

    @Override
    public List<Organism> findAll() {
        return organisms;
    }

    @Override
    public Optional<Organism> findById(int id) {
        return organisms.stream().filter(o -> o.getId() == id).findFirst();
    }
}
