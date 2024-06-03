package org.svarb.svarbneticsapi.mapper;

import org.apache.ibatis.annotations.*;
import org.svarb.svarbneticsapi.model.Chromosome;

import java.util.List;

@Mapper
public interface ChromosomeMapper {

    @Select("SELECT * FROM chromosome")
    @Results({
        @Result(property = "id", column = "chromosome_id"),
        @Result(property = "number", column = "number")
    })
    List<Chromosome> findAll();

    @Select("SELECT * FROM chromosome WHERE chromosome_id = #{id}")
    @Results({
        @Result(property = "id", column = "chromosome_id"),
        @Result(property = "number", column = "number")
    })
    Chromosome findById(@Param("id") int id);
    
    @Select("SELECT * FROM chromosome WHERE organism_id = #{organismId}")
    List<Chromosome> findByOrganismId(@Param("organismId") int organismId);
    
}
