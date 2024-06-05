package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Art;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface ArtMapper extends BaseMapper<Art> {

    @Select("SELECT * FROM art WHERE name = #{name}")
    List<Art> findByName(@Param("name") String name);

    @Insert("INSERT INTO art (Name, Genuine, Category, Buy, Sell, Size, Real_Artwork_Title, Artist, Museum_Description, HHA_Concept_1, HHA_Concept_2, Tag) VALUES (#{name}, #{genuine}, #{category}, #{buy}, #{sell}, #{size}, #{realArtworkTitle}, #{artist}, #{museumDescription}, #{hhaConcept_1}, #{hhaConcept_2}, #{tag})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertArt(Art art);

    @Update("UPDATE art SET Name = #{name}, Genuine = #{genuine}, Category = #{category}, Buy = #{buy}, Sell = #{sell}, Size = #{size}, Real_Artwork_Title = #{realArtworkTitle}, Artist = #{artist}, Museum_Description = #{museumDescription}, HHA_Concept_1 = #{hhaConcept_1}, HHA_Concept_2 = #{hhaConcept_2}, Tag = #{tag} WHERE id = #{id}")
    int updateArt(Art art);

    @Delete("DELETE FROM art WHERE id = #{id}")
    int deleteById(@Param("id") Long id);

}
