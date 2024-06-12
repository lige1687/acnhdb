package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Bags;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface BagsMapper extends BaseMapper<Bags> {

    @Select("SELECT * FROM bags WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Bags> findByName(@Param("name") String name);

    @Insert("INSERT INTO bags (Name, Variation, DIY, Buy, Sell, Color_1, Color_2, Miles_Price, Source, Style, Label_Themes, Catalog) VALUES (#{name}, #{variation}, #{diy}, #{buy}, #{sell}, #{color_1}, #{color_2}, #{milesPrice}, #{source}, #{style}, #{labelThemes}, #{catalog})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBags(Bags bags);

    @Update("UPDATE bags SET Name = #{name}, Variation = #{variation}, DIY = #{diy}, Buy = #{buy}, Sell = #{sell}, Color_1 = #{color_1}, Color_2 = #{color_2}, Miles_Price = #{milesPrice}, Source = #{source}, Style = #{style}, Label_Themes = #{labelThemes}, Catalog = #{catalog} WHERE id = #{id}")
    int updateBags(Bags bags);

    @Delete("DELETE FROM bags WHERE id = #{id}")
    int deleteById(@Param("id") Long id);

}
