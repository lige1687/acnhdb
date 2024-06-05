package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Headwear;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface HeadwearMapper extends BaseMapper<Headwear> {

    @Select("SELECT * FROM headwear WHERE name = #{name}")
    List<Headwear> findByName(@Param("name") String name);

    @Insert("INSERT INTO headwear (Name, Variation, DIY, Buy, Sell, Color_1, Color_2, Miles_Price, Source, Source_Notes, Seasonal_Availability, Mannequin_Piece, Style, Label_Themes, Type, Villager_Equippable, Catalog) VALUES (#{name}, #{variation}, #{diy}, #{buy}, #{sell}, #{color_1}, #{color_2}, #{milesPrice}, #{source}, #{sourceNotes}, #{seasonalAvailability}, #{mannequinPiece}, #{style}, #{labelThemes}, #{type}, #{villagerEquippable}, #{catalog})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertHeadwear(Headwear headwear);

    @Update("UPDATE headwear SET Name = #{name}, Variation = #{variation}, DIY = #{diy}, Buy = #{buy}, Sell = #{sell}, Color_1 = #{color_1}, Color_2 = #{color_2}, Miles_Price = #{milesPrice}, Source = #{source}, Source_Notes = #{sourceNotes}, Seasonal_Availability = #{seasonalAvailability}, Mannequin_Piece = #{mannequinPiece}, Style = #{style}, Label_Themes = #{labelThemes}, Type = #{type}, Villager_Equippable = #{villagerEquippable}, Catalog = #{catalog} WHERE id = #{id}")
    int updateHeadwear(Headwear headwear);

    @Delete("DELETE FROM headwear WHERE id = #{id}")
    int deleteById(@Param("id") Long id);

}
