package org.svarb.svarbneticsapi.mapper;

import org.apache.ibatis.annotations.*;
import org.svarb.svarbneticsapi.model.Organism;

import java.util.List;
//import java.util.Set;

@Mapper
public interface OrganismMapper {

    @Select("SELECT * FROM organism")
    @Results({
        @Result(property = "id", column = "organism_id"),
        @Result(property = "name", column = "name")
    })
    List<Organism> findAll();

    @Select("SELECT * FROM organism WHERE organism_id = #{id}")
    @Results({
        @Result(property = "id", column = "organism_id"),
        @Result(property = "name", column = "name")
    })
    Organism findById(@Param("id") int id);


}
