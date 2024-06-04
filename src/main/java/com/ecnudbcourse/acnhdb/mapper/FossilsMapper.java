package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Fossils;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface FossilsMapper extends BaseMapper<Fossils> {

    @Select("SELECT * FROM fossils WHERE name = #{name}")
    List<Fossils> findByName(@Param("name") String name);

    @Insert("INSERT INTO fossils (Name, Sell, Color_1, Color_2, Size, Museum, Interact) VALUES (#{name}, #{sell}, #{color_1}, #{color_2}, #{size}, #{museum}, #{interact})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertFossils(Fossils fossils);

    @Update("UPDATE fossils SET Name = #{name}, Sell = #{sell}, Color_1 = #{color_1}, Color_2 = #{color_2}, Size = #{size}, Museum = #{museum}, Interact = #{interact} WHERE id = #{id}")
    int updateFossils(Fossils fossils);

    @Delete("DELETE FROM fossils WHERE id = #{id}")
    int deleteById(@Param("id") Long id);

}
