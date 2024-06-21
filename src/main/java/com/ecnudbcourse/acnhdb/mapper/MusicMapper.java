package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Music;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface MusicMapper extends BaseMapper<Music> {

    @Select("SELECT * FROM music WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Music> findByName(@Param("name") String name);

    @Insert("INSERT INTO music (Name, Buy, Sell, Color1, Color2, Size, Source, Source_Notes, Catalog) VALUES (#{name}, #{buy}, #{sell}, #{color1}, #{color2}, #{size}, #{source}, #{sourceNotes}, #{catalog})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertMusic(Music music);

    @Update("UPDATE music SET Name = #{name}, Buy = #{buy}, Sell = #{sell}, Color1 = #{color1}, Color2 = #{color2}, Size = #{size}, Source = #{source}, Source_Notes = #{sourceNotes}, Catalog = #{catalog} WHERE id = #{id}")
    int updateMusic(Music music);

    @Delete("DELETE FROM music WHERE id = #{id}")
    int deleteById(@Param("id") Long id);


    @Select("<script>" +
            "SELECT * FROM music" +
            " WHERE 1=1 AND buy != 0" +
            "<if test='min != null'> AND buy &gt;= #{min}</if>" +
            "<if test='max != null'> AND buy &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY buy ${sort}" +
            "</if>" +
            "</script>")
    List<Music> searchByBuyRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("<script>" +
            "SELECT * FROM music" +
            " WHERE 1=1 AND sell != 0" +
            "<if test='min != null'> AND sell &gt;= #{min}</if>" +
            "<if test='max != null'> AND sell &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY sell ${sort}" +
            "</if>" +
            "</script>")
    List<Music> searchBySellRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);
}
