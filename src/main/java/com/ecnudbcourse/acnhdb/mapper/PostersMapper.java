package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Posters;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface PostersMapper extends BaseMapper<Posters> {

    @Select("SELECT * FROM posters WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Posters> findByName(@Param("name") String name);

    @Insert("INSERT INTO posters (Name, Color1, Color2, Source_Notes) VALUES (#{name}, #{color1}, #{color2}, #{sourceNotes})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertPosters(Posters posters);

    @Update("UPDATE posters SET Name = #{name}, Color1 = #{color1}, Color2 = #{color2}, Source_Notes = #{sourceNotes} WHERE id = #{id}")
    int updatePosters(Posters posters);

    @Delete("DELETE FROM posters WHERE id = #{id}")
    int deleteById(@Param("id") Long id);

}
