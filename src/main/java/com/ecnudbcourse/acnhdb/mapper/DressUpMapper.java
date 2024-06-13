package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.DressUp;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface DressUpMapper extends BaseMapper<DressUp> {

    @Select("SELECT * FROM dress_up WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<DressUp> findByName(@Param("name") String name);

    @Insert("INSERT INTO dress_up (Name, Variation, DIY, Buy, Sell, Color_1, Color_2, Source, Source_Notes, Seasonal_Availability, Mannequin_Piece, Style, Label_Themes, Catalog, Primary_Shape, Secondary_Shape) VALUES (#{name}, #{variation}, #{diy}, #{buy}, #{sell}, #{color_1}, #{color_2}, #{source}, #{sourceNotes}, #{seasonalAvailability}, #{mannequinPiece}, #{style}, #{labelThemes}, #{catalog}, #{primaryShape}, #{secondaryShape})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertDressUp(DressUp dress_up);

    @Update("UPDATE dress_up SET Name = #{name}, Variation = #{variation}, DIY = #{diy}, Buy = #{buy}, Sell = #{sell}, Color_1 = #{color_1}, Color_2 = #{color_2}, Source = #{source}, Source_Notes = #{sourceNotes}, Seasonal_Availability = #{seasonalAvailability}, Mannequin_Piece = #{mannequinPiece}, Style = #{style}, Label_Themes = #{labelThemes}, Catalog = #{catalog}, Primary_Shape = #{primaryShape}, Secondary_Shape = #{secondaryShape} WHERE id = #{id}")
    int updateDressUp(DressUp dress_up);

    @Delete("DELETE FROM dress_up WHERE id = #{id}")
    int deleteById(@Param("id") Long id);

}
