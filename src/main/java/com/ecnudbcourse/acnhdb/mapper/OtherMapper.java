package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Other;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface OtherMapper extends BaseMapper<Other> {

    @Select("SELECT * FROM other WHERE name = #{name}")
    List<Other> findByName(@Param("name") String name);

    @Insert("INSERT INTO other (Name, DIY, Stack_Size, Buy, Sell, Miles_Price, Source, Source_Notes, Tag, Color_1, Color_2) VALUES (#{name}, #{diy}, #{stackSize}, #{buy}, #{sell}, #{milesPrice}, #{source}, #{sourceNotes}, #{tag}, #{color_1}, #{color_2})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertOther(Other other);

    @Update("UPDATE other SET Name = #{name}, DIY = #{diy}, Stack_Size = #{stackSize}, Buy = #{buy}, Sell = #{sell}, Miles_Price = #{milesPrice}, Source = #{source}, Source_Notes = #{sourceNotes}, Tag = #{tag}, Color_1 = #{color_1}, Color_2 = #{color_2} WHERE id = #{id}")
    int updateOther(Other other);

    @Delete("DELETE FROM other WHERE id = #{id}")
    int deleteById(@Param("id") Long id);

}
