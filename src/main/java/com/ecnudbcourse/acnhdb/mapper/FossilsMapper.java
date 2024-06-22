package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Fossils;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface FossilsMapper extends BaseMapper<Fossils> {

    @Select("SELECT * FROM fossils WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Fossils> findByName(@Param("name") String name);

    @Insert("INSERT INTO fossils (Name, Sell, Color1, Color2, Size, Museum, Interact) VALUES (#{name}, #{sell}, #{color1}, #{color2}, #{size}, #{museum}, #{interact})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertFossils(Fossils fossils);

    @Update("UPDATE fossils SET Name = #{name}, Sell = #{sell}, Color1 = #{color1}, Color2 = #{color2}, Size = #{size}, Museum = #{museum}, Interact = #{interact} WHERE id = #{id}")
    int updateFossils(Fossils fossils);

    @Delete("DELETE FROM fossils WHERE id = #{id}")
    int deleteById(@Param("id") Long id);


    @Select("<script>" +
            "SELECT * FROM fossils" +
            " WHERE 1=1 AND sell != 0" +
            "<if test='min != null'> AND sell &gt;= #{min}</if>" +
            "<if test='max != null'> AND sell &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY sell ${sort}" +
            "</if>" +
            "</script>")
    List<Fossils> searchBySellRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("SELECT * FROM fossils WHERE Color1 LIKE CONCAT('%', #{color1}, '%')")
    List<Fossils> findByColor1(@Param("color1") String color1);

    @Select("SELECT * FROM fossils WHERE Color2 LIKE CONCAT('%', #{color2}, '%')")
    List<Fossils> findByColor2(@Param("color2") String color2);

    @Select("SELECT * FROM fossils WHERE Size LIKE CONCAT('%', #{size}, '%')")
    List<Fossils> findBySize(@Param("size") String size);

    @Select("SELECT * FROM fossils WHERE Museum LIKE CONCAT('%', #{museum}, '%')")
    List<Fossils> findByMuseum(@Param("museum") String museum);

    @Select("SELECT * FROM fossils WHERE Interact LIKE CONCAT('%', #{interact}, '%')")
    List<Fossils> findByInteract(@Param("interact") String interact);
}
