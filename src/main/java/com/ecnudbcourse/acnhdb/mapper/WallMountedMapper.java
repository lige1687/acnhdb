package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.WallMounted;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface WallMountedMapper extends BaseMapper<WallMounted> {

    @Select("SELECT * FROM wall_mounted WHERE name = #{name}")
    List<WallMounted> findByName(@Param("name") String name);

    @Insert("INSERT INTO wall_mounted (Name, Variation, Body_Title, Pattern, Pattern_Title, DIY, Body_Customize, Pattern_Customize, Kit_Cost, Buy, Sell, Color_1, Color_2, Size, Source, Source_Notes, HHA_Concept_1, HHA_Concept_2, HHA_Series, HHA_Set, Interact, Tag, Lighting_Type, Door_Deco, Catalog) VALUES (#{name}, #{variation}, #{bodyTitle}, #{pattern}, #{patternTitle}, #{diy}, #{bodyCustomize}, #{patternCustomize}, #{kitCost}, #{buy}, #{sell}, #{color_1}, #{color_2}, #{size}, #{source}, #{sourceNotes}, #{hhaConcept_1}, #{hhaConcept_2}, #{hhaSeries}, #{hhaSet}, #{interact}, #{tag}, #{lightingType}, #{doorDeco}, #{catalog})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertWallMounted(WallMounted wall_mounted);

    @Update("UPDATE wall_mounted SET Name = #{name}, Variation = #{variation}, Body_Title = #{bodyTitle}, Pattern = #{pattern}, Pattern_Title = #{patternTitle}, DIY = #{diy}, Body_Customize = #{bodyCustomize}, Pattern_Customize = #{patternCustomize}, Kit_Cost = #{kitCost}, Buy = #{buy}, Sell = #{sell}, Color_1 = #{color_1}, Color_2 = #{color_2}, Size = #{size}, Source = #{source}, Source_Notes = #{sourceNotes}, HHA_Concept_1 = #{hhaConcept_1}, HHA_Concept_2 = #{hhaConcept_2}, HHA_Series = #{hhaSeries}, HHA_Set = #{hhaSet}, Interact = #{interact}, Tag = #{tag}, Lighting_Type = #{lightingType}, Door_Deco = #{doorDeco}, Catalog = #{catalog} WHERE id = #{id}")
    int updateWallMounted(WallMounted wall_mounted);

    @Delete("DELETE FROM wall_mounted WHERE id = #{id}")
    int deleteById(@Param("id") Long id);

}
