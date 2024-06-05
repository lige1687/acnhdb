package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Tops;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface TopsMapper extends BaseMapper<Tops> {

    @Select("SELECT * FROM tops WHERE name = #{name}")
    List<Tops> findByName(@Param("name") String name);

    @Insert("INSERT INTO tops (Name, Variation, DIY, Buy, Sell, Color_1, Color_2, Miles_Price, Source, Source_Notes, Seasonal_Availability, Mannequin_Piece, Style, Label_Themes, Catalog) VALUES (#{name}, #{variation}, #{diy}, #{buy}, #{sell}, #{color_1}, #{color_2}, #{milesPrice}, #{source}, #{sourceNotes}, #{seasonalAvailability}, #{mannequinPiece}, #{style}, #{labelThemes}, #{catalog})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertTops(Tops tops);

    @Update("UPDATE tops SET Name = #{name}, Variation = #{variation}, DIY = #{diy}, Buy = #{buy}, Sell = #{sell}, Color_1 = #{color_1}, Color_2 = #{color_2}, Miles_Price = #{milesPrice}, Source = #{source}, Source_Notes = #{sourceNotes}, Seasonal_Availability = #{seasonalAvailability}, Mannequin_Piece = #{mannequinPiece}, Style = #{style}, Label_Themes = #{labelThemes}, Catalog = #{catalog} WHERE id = #{id}")
    int updateTops(Tops tops);

    @Delete("DELETE FROM tops WHERE id = #{id}")
    int deleteById(@Param("id") Long id);

}
