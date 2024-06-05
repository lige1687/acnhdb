package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Umbrellas;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface UmbrellasMapper extends BaseMapper<Umbrellas> {

    @Select("SELECT * FROM umbrellas WHERE name = #{name}")
    List<Umbrellas> findByName(@Param("name") String name);

    @Insert("INSERT INTO umbrellas (Name, DIY, Buy, Sell, Color_1, Color_2, Miles_Price, Source, Source_Notes, Catalog) VALUES (#{name}, #{diy}, #{buy}, #{sell}, #{color_1}, #{color_2}, #{milesPrice}, #{source}, #{sourceNotes}, #{catalog})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertUmbrellas(Umbrellas umbrellas);

    @Update("UPDATE umbrellas SET Name = #{name}, DIY = #{diy}, Buy = #{buy}, Sell = #{sell}, Color_1 = #{color_1}, Color_2 = #{color_2}, Miles_Price = #{milesPrice}, Source = #{source}, Source_Notes = #{sourceNotes}, Catalog = #{catalog} WHERE id = #{id}")
    int updateUmbrellas(Umbrellas umbrellas);

    @Delete("DELETE FROM umbrellas WHERE id = #{id}")
    int deleteById(@Param("id") Long id);

}
