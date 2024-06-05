package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Floors;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface FloorsMapper extends BaseMapper<Floors> {

    @Select("SELECT * FROM floors WHERE name = #{name}")
    List<Floors> findByName(@Param("name") String name);

    @Insert("INSERT INTO floors (Name, VFX, DIY, Buy, Sell, Color_1, Color_2, Miles_Price, Source, HHA_Concept_1, HHA_Concept_2, HHA_Series, Tag, Catalog) VALUES (#{name}, #{vfx}, #{diy}, #{buy}, #{sell}, #{color_1}, #{color_2}, #{milesPrice}, #{source}, #{hhaConcept_1}, #{hhaConcept_2}, #{hhaSeries}, #{tag}, #{catalog})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertFloors(Floors floors);

    @Update("UPDATE floors SET Name = #{name}, VFX = #{vfx}, DIY = #{diy}, Buy = #{buy}, Sell = #{sell}, Color_1 = #{color_1}, Color_2 = #{color_2}, Miles_Price = #{milesPrice}, Source = #{source}, HHA_Concept_1 = #{hhaConcept_1}, HHA_Concept_2 = #{hhaConcept_2}, HHA_Series = #{hhaSeries}, Tag = #{tag}, Catalog = #{catalog} WHERE id = #{id}")
    int updateFloors(Floors floors);

    @Delete("DELETE FROM floors WHERE id = #{id}")
    int deleteById(@Param("id") Long id);

}
