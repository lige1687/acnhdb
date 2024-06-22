package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Accessories;
import com.ecnudbcourse.acnhdb.dto.AccessoriesMaterials;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface AccessoriesMapper extends BaseMapper<Accessories> {

    @Select("SELECT * FROM accessories WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Accessories> findByName(@Param("name") String name);

    @Insert("INSERT INTO accessories (Name, Variation, DIY, Buy, Sell, Color1, Color2, Miles_Price, Source, Source_Notes, Seasonal_Availability, Mannequin_Piece, Style, Label_Themes, Type, Villager_Equippable, Catalog) VALUES (#{name}, #{variation}, #{diy}, #{buy}, #{sell}, #{color1}, #{color2}, #{milesPrice}, #{source}, #{sourceNotes}, #{seasonalAvailability}, #{mannequinPiece}, #{style}, #{labelThemes}, #{type}, #{villagerEquippable}, #{catalog})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertAccessories(Accessories accessories);

    @Update("UPDATE accessories SET Name = #{name}, Variation = #{variation}, DIY = #{diy}, Buy = #{buy}, Sell = #{sell}, Color1 = #{color1}, Color2 = #{color2}, Miles_Price = #{milesPrice}, Source = #{source}, Source_Notes = #{sourceNotes}, Seasonal_Availability = #{seasonalAvailability}, Mannequin_Piece = #{mannequinPiece}, Style = #{style}, Label_Themes = #{labelThemes}, Type = #{type}, Villager_Equippable = #{villagerEquippable}, Catalog = #{catalog} WHERE id = #{id}")
    int updateAccessories(Accessories accessories);

    @Delete("DELETE FROM accessories WHERE id = #{id}")
    int deleteById(@Param("id") Long id);


    @Select("<script>" +
            "SELECT * FROM accessories" +
            " WHERE 1=1 AND buy != 0" +
            "<if test='min != null'> AND buy &gt;= #{min}</if>" +
            "<if test='max != null'> AND buy &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY buy ${sort}" +
            "</if>" +
            "</script>")
    List<Accessories> searchByBuyRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("<script>" +
            "SELECT * FROM accessories" +
            " WHERE 1=1 AND sell != 0" +
            "<if test='min != null'> AND sell &gt;= #{min}</if>" +
            "<if test='max != null'> AND sell &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY sell ${sort}" +
            "</if>" +
            "</script>")
    List<Accessories> searchBySellRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("<script>" +
            "SELECT * FROM accessories" +
            " WHERE 1=1 AND miles_Price != 0" +
            "<if test='min != null'> AND miles_Price &gt;= #{min}</if>" +
            "<if test='max != null'> AND miles_Price &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY miles_Price ${sort}" +
            "</if>" +
            "</script>")
    List<Accessories> searchByMilesPriceRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("SELECT * FROM accessories WHERE Variation LIKE CONCAT('%', #{variation}, '%')")
    List<Accessories> findByVariation(@Param("variation") String variation);

    @Select("SELECT * FROM accessories WHERE DIY LIKE CONCAT('%', #{diy}, '%')")
    List<Accessories> findByDiy(@Param("diy") String diy);

    @Select("SELECT * FROM accessories WHERE Color1 LIKE CONCAT('%', #{color1}, '%')")
    List<Accessories> findByColor1(@Param("color1") String color1);

    @Select("SELECT * FROM accessories WHERE Color2 LIKE CONCAT('%', #{color2}, '%')")
    List<Accessories> findByColor2(@Param("color2") String color2);

    @Select("SELECT * FROM accessories WHERE Source LIKE CONCAT('%', #{source}, '%')")
    List<Accessories> findBySource(@Param("source") String source);

    @Select("SELECT * FROM accessories WHERE Source_Notes LIKE CONCAT('%', #{sourceNotes}, '%')")
    List<Accessories> findBySourceNotes(@Param("sourceNotes") String sourceNotes);

    @Select("SELECT * FROM accessories WHERE Seasonal_Availability LIKE CONCAT('%', #{seasonalAvailability}, '%')")
    List<Accessories> findBySeasonalAvailability(@Param("seasonalAvailability") String seasonalAvailability);

    @Select("SELECT * FROM accessories WHERE Mannequin_Piece LIKE CONCAT('%', #{mannequinPiece}, '%')")
    List<Accessories> findByMannequinPiece(@Param("mannequinPiece") String mannequinPiece);

    @Select("SELECT * FROM accessories WHERE Style LIKE CONCAT('%', #{style}, '%')")
    List<Accessories> findByStyle(@Param("style") String style);

    @Select("SELECT * FROM accessories WHERE Label_Themes LIKE CONCAT('%', #{labelThemes}, '%')")
    List<Accessories> findByLabelThemes(@Param("labelThemes") String labelThemes);

    @Select("SELECT * FROM accessories WHERE Type LIKE CONCAT('%', #{type}, '%')")
    List<Accessories> findByType(@Param("type") String type);

    @Select("SELECT * FROM accessories WHERE Villager_Equippable LIKE CONCAT('%', #{villagerEquippable}, '%')")
    List<Accessories> findByVillagerEquippable(@Param("villagerEquippable") String villagerEquippable);

    @Select("SELECT * FROM accessories WHERE Catalog = #{catalog}")
    List<Accessories> findByCatalog(@Param("catalog") String catalog);

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
            "       accessories h" +
            "   JOIN" +
            "       recipes r ON h.Name = r.Name" +
            "   WHERE" +
            "       h.Name LIKE CONCAT('%', #{name}, '%')" +
            "   AND h.DIY = 'yes'")
    List<AccessoriesMaterials> selectAccessoriesMaterialsByName(@Param("name") String name);
}
