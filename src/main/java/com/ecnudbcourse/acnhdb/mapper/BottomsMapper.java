package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Bottoms;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface BottomsMapper extends BaseMapper<Bottoms> {

    @Select("SELECT * FROM bottoms WHERE name = #{name}")
    List<Bottoms> findByName(@Param("name") String name);

    @Insert("INSERT INTO bottoms (Name, Variation, DIY, Buy, Sell, Color_1, Color_2, Source, Source_Notes, Seasonal_Availability, Mannequin_Piece, Style, Label_Themes, Catalog) VALUES (#{name}, #{variation}, #{diy}, #{buy}, #{sell}, #{color_1}, #{color_2}, #{source}, #{sourceNotes}, #{seasonalAvailability}, #{mannequinPiece}, #{style}, #{labelThemes}, #{catalog})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBottoms(Bottoms bottoms);

    @Update("UPDATE bottoms SET Name = #{name}, Variation = #{variation}, DIY = #{diy}, Buy = #{buy}, Sell = #{sell}, Color_1 = #{color_1}, Color_2 = #{color_2}, Source = #{source}, Source_Notes = #{sourceNotes}, Seasonal_Availability = #{seasonalAvailability}, Mannequin_Piece = #{mannequinPiece}, Style = #{style}, Label_Themes = #{labelThemes}, Catalog = #{catalog} WHERE id = #{id}")
    int updateBottoms(Bottoms bottoms);

    @Delete("DELETE FROM bottoms WHERE id = #{id}")
    int deleteById(@Param("id") Long id);

}
