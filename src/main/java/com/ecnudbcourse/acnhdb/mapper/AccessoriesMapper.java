package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Accessories;
import org.apache.ibatis.annotations.*;
import java.util.List;
@Mapper
public interface AccessoriesMapper extends BaseMapper<Accessories> {

    @Select("SELECT * FROM accessories WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Accessories> findByName(@Param("name") String name);

    @Insert("INSERT INTO accessories (Name, Variation, DIY, Buy, Sell, Color_1, Color_2, Miles_Price, Source, Source_Notes, Seasonal_Availability, Mannequin_Piece, Style, Label_Themes, Type, Villager_Equippable, Catalog) VALUES (#{name}, #{variation}, #{diy}, #{buy}, #{sell}, #{color_1}, #{color_2}, #{milesPrice}, #{source}, #{sourceNotes}, #{seasonalAvailability}, #{mannequinPiece}, #{style}, #{labelThemes}, #{type}, #{villagerEquippable}, #{catalog})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertAccessories(Accessories accessories);

    @Update("UPDATE accessories SET Name = #{name}, Variation = #{variation}, DIY = #{diy}, Buy = #{buy}, Sell = #{sell}, Color_1 = #{color_1}, Color_2 = #{color_2}, Miles_Price = #{milesPrice}, Source = #{source}, Source_Notes = #{sourceNotes}, Seasonal_Availability = #{seasonalAvailability}, Mannequin_Piece = #{mannequinPiece}, Style = #{style}, Label_Themes = #{labelThemes}, Type = #{type}, Villager_Equippable = #{villagerEquippable}, Catalog = #{catalog} WHERE id = #{id}")
    int updateAccessories(Accessories accessories);

    @Delete("DELETE FROM accessories WHERE id = #{id}")
    int deleteById(@Param("id") Long id);

}