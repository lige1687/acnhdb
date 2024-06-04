package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Music;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface MusicMapper extends BaseMapper<Music> {

    @Select("SELECT * FROM music WHERE name = #{name}")
    List<Music> findByName(@Param("name") String name);

    @Insert("INSERT INTO music (Name, Buy, Sell, Color_1, Color_2, Size, Source, Source_Notes, Catalog) VALUES (#{name}, #{buy}, #{sell}, #{color_1}, #{color_2}, #{size}, #{source}, #{sourceNotes}, #{catalog})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertMusic(Music music);

    @Update("UPDATE music SET Name = #{name}, Buy = #{buy}, Sell = #{sell}, Color_1 = #{color_1}, Color_2 = #{color_2}, Size = #{size}, Source = #{source}, Source_Notes = #{sourceNotes}, Catalog = #{catalog} WHERE id = #{id}")
    int updateMusic(Music music);

    @Delete("DELETE FROM music WHERE id = #{id}")
    int deleteById(@Param("id") Long id);

}
