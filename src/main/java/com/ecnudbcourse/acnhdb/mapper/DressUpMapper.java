package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.DressUp;
import com.ecnudbcourse.acnhdb.dto.DressUpMaterials;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface DressUpMapper extends BaseMapper<DressUp> {

    @Select("SELECT * FROM dress_up WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<DressUp> findByName(@Param("name") String name);

    @Insert("INSERT INTO dress_up (Name, Variation, DIY, Buy, Sell, Color1, Color2, Source, Source_Notes, Seasonal_Availability, Mannequin_Piece, Style, Label_Themes, Catalog, Primary_Shape, Secondary_Shape) VALUES (#{name}, #{variation}, #{diy}, #{buy}, #{sell}, #{color1}, #{color2}, #{source}, #{sourceNotes}, #{seasonalAvailability}, #{mannequinPiece}, #{style}, #{labelThemes}, #{catalog}, #{primaryShape}, #{secondaryShape})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertDressUp(DressUp dress_up);

    @Update("UPDATE dress_up SET Name = #{name}, Variation = #{variation}, DIY = #{diy}, Buy = #{buy}, Sell = #{sell}, Color1 = #{color1}, Color2 = #{color2}, Source = #{source}, Source_Notes = #{sourceNotes}, Seasonal_Availability = #{seasonalAvailability}, Mannequin_Piece = #{mannequinPiece}, Style = #{style}, Label_Themes = #{labelThemes}, Catalog = #{catalog}, Primary_Shape = #{primaryShape}, Secondary_Shape = #{secondaryShape} WHERE id = #{id}")
    int updateDressUp(DressUp dress_up);

    @Delete("DELETE FROM dress_up WHERE id = #{id}")
    int deleteById(@Param("id") Long id);


    @Select("<script>" +
            "SELECT * FROM dress_up" +
            " WHERE 1=1 AND buy != 0" +
            "<if test='min != null'> AND buy &gt;= #{min}</if>" +
            "<if test='max != null'> AND buy &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY buy ${sort}" +
            "</if>" +
            "</script>")
    List<DressUp> searchByBuyRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("<script>" +
            "SELECT * FROM dress_up" +
            " WHERE 1=1 AND sell != 0" +
            "<if test='min != null'> AND sell &gt;= #{min}</if>" +
            "<if test='max != null'> AND sell &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY sell ${sort}" +
            "</if>" +
            "</script>")
    List<DressUp> searchBySellRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("SELECT * FROM dress_up WHERE Variation LIKE CONCAT('%', #{variation}, '%')")
    List<DressUp> findByVariation(@Param("variation") String variation);

    @Select("SELECT * FROM dress_up WHERE DIY LIKE CONCAT('%', #{diy}, '%')")
    List<DressUp> findByDiy(@Param("diy") String diy);

    @Select("SELECT * FROM dress_up WHERE Color1 LIKE CONCAT('%', #{color1}, '%')")
    List<DressUp> findByColor1(@Param("color1") String color1);

    @Select("SELECT * FROM dress_up WHERE Color2 LIKE CONCAT('%', #{color2}, '%')")
    List<DressUp> findByColor2(@Param("color2") String color2);

    @Select("SELECT * FROM dress_up WHERE Source LIKE CONCAT('%', #{source}, '%')")
    List<DressUp> findBySource(@Param("source") String source);

    @Select("SELECT * FROM dress_up WHERE Source_Notes LIKE CONCAT('%', #{sourceNotes}, '%')")
    List<DressUp> findBySourceNotes(@Param("sourceNotes") String sourceNotes);

    @Select("SELECT * FROM dress_up WHERE Seasonal_Availability LIKE CONCAT('%', #{seasonalAvailability}, '%')")
    List<DressUp> findBySeasonalAvailability(@Param("seasonalAvailability") String seasonalAvailability);

    @Select("SELECT * FROM dress_up WHERE Mannequin_Piece LIKE CONCAT('%', #{mannequinPiece}, '%')")
    List<DressUp> findByMannequinPiece(@Param("mannequinPiece") String mannequinPiece);

    @Select("SELECT * FROM dress_up WHERE Style LIKE CONCAT('%', #{style}, '%')")
    List<DressUp> findByStyle(@Param("style") String style);

    @Select("SELECT * FROM dress_up WHERE Label_Themes LIKE CONCAT('%', #{labelThemes}, '%')")
    List<DressUp> findByLabelThemes(@Param("labelThemes") String labelThemes);

    @Select("SELECT * FROM dress_up WHERE Catalog = #{catalog}")
    List<DressUp> findByCatalog(@Param("catalog") String catalog);

    @Select("SELECT * FROM dress_up WHERE Primary_Shape LIKE CONCAT('%', #{primaryShape}, '%')")
    List<DressUp> findByPrimaryShape(@Param("primaryShape") String primaryShape);

    @Select("SELECT * FROM dress_up WHERE Secondary_Shape LIKE CONCAT('%', #{secondaryShape}, '%')")
    List<DressUp> findBySecondaryShape(@Param("secondaryShape") String secondaryShape);

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
            "       dress_up h" +
            "   JOIN" +
            "       recipes r ON h.Name = r.Name" +
            "   WHERE" +
            "       h.Name LIKE CONCAT('%', #{name}, '%')" +
            "   AND h.DIY = 'yes'")
    List<DressUpMaterials> selectDressUpMaterialsByName(@Param("name") String name);
}
