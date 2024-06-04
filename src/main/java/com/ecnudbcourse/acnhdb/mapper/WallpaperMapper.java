package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Wallpaper;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface WallpaperMapper extends BaseMapper<Wallpaper> {

    @Select("SELECT * FROM wallpaper WHERE name = #{name}")
    List<Wallpaper> findByName(@Param("name") String name);

    @Insert("INSERT INTO wallpaper (Name, VFX, VFX_Type, DIY, Buy, Sell, Color_1, Color_2, Miles_Price, Source, Source_Notes, Catalog, Window_Type, Window_Color, Pane_Type, Curtain_Type, Curtain_Color, Ceiling_Type, HHA_Concept_1, HHA_Concept_2, HHA_Series, Tag) VALUES (#{name}, #{vfx}, #{vfxType}, #{diy}, #{buy}, #{sell}, #{color_1}, #{color_2}, #{milesPrice}, #{source}, #{sourceNotes}, #{catalog}, #{windowType}, #{windowColor}, #{paneType}, #{curtainType}, #{curtainColor}, #{ceilingType}, #{hhaConcept_1}, #{hhaConcept_2}, #{hhaSeries}, #{tag})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertWallpaper(Wallpaper wallpaper);

    @Update("UPDATE wallpaper SET Name = #{name}, VFX = #{vfx}, VFX_Type = #{vfxType}, DIY = #{diy}, Buy = #{buy}, Sell = #{sell}, Color_1 = #{color_1}, Color_2 = #{color_2}, Miles_Price = #{milesPrice}, Source = #{source}, Source_Notes = #{sourceNotes}, Catalog = #{catalog}, Window_Type = #{windowType}, Window_Color = #{windowColor}, Pane_Type = #{paneType}, Curtain_Type = #{curtainType}, Curtain_Color = #{curtainColor}, Ceiling_Type = #{ceilingType}, HHA_Concept_1 = #{hhaConcept_1}, HHA_Concept_2 = #{hhaConcept_2}, HHA_Series = #{hhaSeries}, Tag = #{tag} WHERE id = #{id}")
    int updateWallpaper(Wallpaper wallpaper);

    @Delete("DELETE FROM wallpaper WHERE id = #{id}")
    int deleteById(@Param("id") Long id);

}
