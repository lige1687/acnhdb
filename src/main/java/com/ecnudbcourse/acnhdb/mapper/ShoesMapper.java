package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Shoes;
import com.ecnudbcourse.acnhdb.dto.ShoesMaterials;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface ShoesMapper extends BaseMapper<Shoes> {

    @Select("SELECT * FROM shoes WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Shoes> findByName(@Param("name") String name);

    @Insert("INSERT INTO shoes (Name, Variation, DIY, Buy, Sell, Color1, Color2, Miles_Price, Source, Source_Notes, Seasonal_Availability, Mannequin_Piece, Style, Label_Themes, Catalog) VALUES (#{name}, #{variation}, #{diy}, #{buy}, #{sell}, #{color1}, #{color2}, #{milesPrice}, #{source}, #{sourceNotes}, #{seasonalAvailability}, #{mannequinPiece}, #{style}, #{labelThemes}, #{catalog})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertShoes(Shoes shoes);

    @Update("UPDATE shoes SET Name = #{name}, Variation = #{variation}, DIY = #{diy}, Buy = #{buy}, Sell = #{sell}, Color1 = #{color1}, Color2 = #{color2}, Miles_Price = #{milesPrice}, Source = #{source}, Source_Notes = #{sourceNotes}, Seasonal_Availability = #{seasonalAvailability}, Mannequin_Piece = #{mannequinPiece}, Style = #{style}, Label_Themes = #{labelThemes}, Catalog = #{catalog} WHERE id = #{id}")
    int updateShoes(Shoes shoes);

    @Delete("DELETE FROM shoes WHERE id = #{id}")
    int deleteById(@Param("id") Long id);


    @Select("<script>" +
            "SELECT * FROM shoes" +
            " WHERE 1=1 AND buy != 0" +
            "<if test='min != null'> AND buy &gt;= #{min}</if>" +
            "<if test='max != null'> AND buy &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY buy ${sort}" +
            "</if>" +
            "</script>")
    List<Shoes> searchByBuyRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("<script>" +
            "SELECT * FROM shoes" +
            " WHERE 1=1 AND sell != 0" +
            "<if test='min != null'> AND sell &gt;= #{min}</if>" +
            "<if test='max != null'> AND sell &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY sell ${sort}" +
            "</if>" +
            "</script>")
    List<Shoes> searchBySellRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("<script>" +
            "SELECT * FROM shoes" +
            " WHERE 1=1 AND miles_Price != 0" +
            "<if test='min != null'> AND miles_Price &gt;= #{min}</if>" +
            "<if test='max != null'> AND miles_Price &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY miles_Price ${sort}" +
            "</if>" +
            "</script>")
    List<Shoes> searchByMilesPriceRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("SELECT * FROM shoes WHERE Variation LIKE CONCAT('%', #{variation}, '%')")
    List<Shoes> findByVariation(@Param("variation") String variation);

    @Select("SELECT * FROM shoes WHERE DIY LIKE CONCAT('%', #{diy}, '%')")
    List<Shoes> findByDiy(@Param("diy") String diy);

    @Select("SELECT * FROM shoes WHERE Color1 LIKE CONCAT('%', #{color1}, '%')")
    List<Shoes> findByColor1(@Param("color1") String color1);

    @Select("SELECT * FROM shoes WHERE Color2 LIKE CONCAT('%', #{color2}, '%')")
    List<Shoes> findByColor2(@Param("color2") String color2);

    @Select("SELECT * FROM shoes WHERE Source LIKE CONCAT('%', #{source}, '%')")
    List<Shoes> findBySource(@Param("source") String source);

    @Select("SELECT * FROM shoes WHERE Source_Notes LIKE CONCAT('%', #{sourceNotes}, '%')")
    List<Shoes> findBySourceNotes(@Param("sourceNotes") String sourceNotes);

    @Select("SELECT * FROM shoes WHERE Seasonal_Availability LIKE CONCAT('%', #{seasonalAvailability}, '%')")
    List<Shoes> findBySeasonalAvailability(@Param("seasonalAvailability") String seasonalAvailability);

    @Select("SELECT * FROM shoes WHERE Mannequin_Piece LIKE CONCAT('%', #{mannequinPiece}, '%')")
    List<Shoes> findByMannequinPiece(@Param("mannequinPiece") String mannequinPiece);

    @Select("SELECT * FROM shoes WHERE Style LIKE CONCAT('%', #{style}, '%')")
    List<Shoes> findByStyle(@Param("style") String style);

    @Select("SELECT * FROM shoes WHERE Label_Themes LIKE CONCAT('%', #{labelThemes}, '%')")
    List<Shoes> findByLabelThemes(@Param("labelThemes") String labelThemes);

    @Select("SELECT * FROM shoes WHERE Catalog = #{catalog}")
    List<Shoes> findByCatalog(@Param("catalog") String catalog);

    @Select("SELECT" +
            "   COALESCE(r.name, '') AS name," +
            "   COALESCE(r.Number_Of_Material1, '') AS number_of_material1," +
            "   COALESCE(r.Number_Of_Material2, '') AS number_of_material2," +
            "   COALESCE(r.Number_Of_Material3, '') AS number_of_material3," +
            "   COALESCE(r.Number_Of_Material4, '') AS number_of_material4," +
            "   COALESCE(r.Number_Of_Material5, '') AS number_of_material5," +
            "   COALESCE(r.Number_Of_Material6, '') AS number_of_material6," +

            "   COALESCE(r.Material1, '') AS material1," +
            "   COALESCE(r.Material2, '') AS material2," +
            "   COALESCE(r.Material3, '') AS material3," +
            "   COALESCE(r.Material4, '') AS material4," +
            "   COALESCE(r.Material5, '') AS material5," +
            "   COALESCE(r.Material6, '') AS material6" +
            "   FROM" +
            "       shoes h" +
            "   JOIN" +
            "       recipes r ON h.Name = r.Name" +
            "   WHERE" +
            "       h.Name LIKE CONCAT('%', #{name}, '%')" +
            "   AND h.DIY = 'yes'")
    List<ShoesMaterials> selectShoesMaterialsByName(@Param("name") String name);
}
