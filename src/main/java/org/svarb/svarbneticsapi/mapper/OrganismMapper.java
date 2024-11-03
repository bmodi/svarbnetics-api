package org.svarb.svarbneticsapi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.svarb.svarbneticsapi.model.Organism;

import java.util.List;

@Mapper
public interface OrganismMapper {
    List<Organism> findAll();
    Organism findById(int id);
}
