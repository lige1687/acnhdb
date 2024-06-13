package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Rugs;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface RugsMapper extends BaseMapper<Rugs> {

    @Select("SELECT * FROM rugs WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Rugs> findByName(@Param("name") String name);

    @Insert("INSERT INTO rugs (Name, DIY, Buy, Sell, Color_1, Color_2, Size, Miles_Price, Source, Source_Notes, HHA_Concept_1, HHA_Concept_2, HHA_Series, Tag, Catalog) VALUES (#{name}, #{diy}, #{buy}, #{sell}, #{color_1}, #{color_2}, #{size}, #{milesPrice}, #{source}, #{sourceNotes}, #{hhaConcept_1}, #{hhaConcept_2}, #{hhaSeries}, #{tag}, #{catalog})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertRugs(Rugs rugs);

    @Update("UPDATE rugs SET Name = #{name}, DIY = #{diy}, Buy = #{buy}, Sell = #{sell}, Color_1 = #{color_1}, Color_2 = #{color_2}, Size = #{size}, Miles_Price = #{milesPrice}, Source = #{source}, Source_Notes = #{sourceNotes}, HHA_Concept_1 = #{hhaConcept_1}, HHA_Concept_2 = #{hhaConcept_2}, HHA_Series = #{hhaSeries}, Tag = #{tag}, Catalog = #{catalog} WHERE id = #{id}")
    int updateRugs(Rugs rugs);

    @Delete("DELETE FROM rugs WHERE id = #{id}")
    int deleteById(@Param("id") Long id);

}
