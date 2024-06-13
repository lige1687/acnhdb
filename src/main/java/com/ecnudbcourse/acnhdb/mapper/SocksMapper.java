package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Socks;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface SocksMapper extends BaseMapper<Socks> {

    @Select("SELECT * FROM socks WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Socks> findByName(@Param("name") String name);

    @Insert("INSERT INTO socks (Name, Variation, Buy, Sell, Color_1, Color_2, Miles_Price, Source, Source_Notes, Seasonal_Availability, Mannequin_Piece, Style, Label_Themes, Catalog) VALUES (#{name}, #{variation}, #{buy}, #{sell}, #{color_1}, #{color_2}, #{milesPrice}, #{source}, #{sourceNotes}, #{seasonalAvailability}, #{mannequinPiece}, #{style}, #{labelThemes}, #{catalog})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertSocks(Socks socks);

    @Update("UPDATE socks SET Name = #{name}, Variation = #{variation}, Buy = #{buy}, Sell = #{sell}, Color_1 = #{color_1}, Color_2 = #{color_2}, Miles_Price = #{milesPrice}, Source = #{source}, Source_Notes = #{sourceNotes}, Seasonal_Availability = #{seasonalAvailability}, Mannequin_Piece = #{mannequinPiece}, Style = #{style}, Label_Themes = #{labelThemes}, Catalog = #{catalog} WHERE id = #{id}")
    int updateSocks(Socks socks);

    @Delete("DELETE FROM socks WHERE id = #{id}")
    int deleteById(@Param("id") Long id);

}
