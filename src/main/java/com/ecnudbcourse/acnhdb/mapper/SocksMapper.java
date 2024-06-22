package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Socks;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface SocksMapper extends BaseMapper<Socks> {

    @Select("SELECT * FROM socks WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Socks> findByName(@Param("name") String name);

    @Insert("INSERT INTO socks (Name, Variation, Buy, Sell, Color1, Color2, Miles_Price, Source, Source_Notes, Seasonal_Availability, Mannequin_Piece, Style, Label_Themes, Catalog) VALUES (#{name}, #{variation}, #{buy}, #{sell}, #{color1}, #{color2}, #{milesPrice}, #{source}, #{sourceNotes}, #{seasonalAvailability}, #{mannequinPiece}, #{style}, #{labelThemes}, #{catalog})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertSocks(Socks socks);

    @Update("UPDATE socks SET Name = #{name}, Variation = #{variation}, Buy = #{buy}, Sell = #{sell}, Color1 = #{color1}, Color2 = #{color2}, Miles_Price = #{milesPrice}, Source = #{source}, Source_Notes = #{sourceNotes}, Seasonal_Availability = #{seasonalAvailability}, Mannequin_Piece = #{mannequinPiece}, Style = #{style}, Label_Themes = #{labelThemes}, Catalog = #{catalog} WHERE id = #{id}")
    int updateSocks(Socks socks);

    @Delete("DELETE FROM socks WHERE id = #{id}")
    int deleteById(@Param("id") Long id);


    @Select("<script>" +
            "SELECT * FROM socks" +
            " WHERE 1=1 AND buy != 0" +
            "<if test='min != null'> AND buy &gt;= #{min}</if>" +
            "<if test='max != null'> AND buy &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY buy ${sort}" +
            "</if>" +
            "</script>")
    List<Socks> searchByBuyRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("<script>" +
            "SELECT * FROM socks" +
            " WHERE 1=1 AND sell != 0" +
            "<if test='min != null'> AND sell &gt;= #{min}</if>" +
            "<if test='max != null'> AND sell &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY sell ${sort}" +
            "</if>" +
            "</script>")
    List<Socks> searchBySellRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("<script>" +
            "SELECT * FROM socks" +
            " WHERE 1=1 AND miles_Price != 0" +
            "<if test='min != null'> AND miles_Price &gt;= #{min}</if>" +
            "<if test='max != null'> AND miles_Price &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY miles_Price ${sort}" +
            "</if>" +
            "</script>")
    List<Socks> searchByMilesPriceRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("SELECT * FROM socks WHERE Variation LIKE CONCAT('%', #{variation}, '%')")
    List<Socks> findByVariation(@Param("variation") String variation);

    @Select("SELECT * FROM socks WHERE Color1 LIKE CONCAT('%', #{color1}, '%')")
    List<Socks> findByColor1(@Param("color1") String color1);

    @Select("SELECT * FROM socks WHERE Color2 LIKE CONCAT('%', #{color2}, '%')")
    List<Socks> findByColor2(@Param("color2") String color2);

    @Select("SELECT * FROM socks WHERE Source LIKE CONCAT('%', #{source}, '%')")
    List<Socks> findBySource(@Param("source") String source);

    @Select("SELECT * FROM socks WHERE Source_Notes LIKE CONCAT('%', #{sourceNotes}, '%')")
    List<Socks> findBySourceNotes(@Param("sourceNotes") String sourceNotes);

    @Select("SELECT * FROM socks WHERE Seasonal_Availability LIKE CONCAT('%', #{seasonalAvailability}, '%')")
    List<Socks> findBySeasonalAvailability(@Param("seasonalAvailability") String seasonalAvailability);

    @Select("SELECT * FROM socks WHERE Mannequin_Piece LIKE CONCAT('%', #{mannequinPiece}, '%')")
    List<Socks> findByMannequinPiece(@Param("mannequinPiece") String mannequinPiece);

    @Select("SELECT * FROM socks WHERE Style LIKE CONCAT('%', #{style}, '%')")
    List<Socks> findByStyle(@Param("style") String style);

    @Select("SELECT * FROM socks WHERE Label_Themes LIKE CONCAT('%', #{labelThemes}, '%')")
    List<Socks> findByLabelThemes(@Param("labelThemes") String labelThemes);

    @Select("SELECT * FROM socks WHERE Catalog = #{catalog}")
    List<Socks> findByCatalog(@Param("catalog") String catalog);
}
