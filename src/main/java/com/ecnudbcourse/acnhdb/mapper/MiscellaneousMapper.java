package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Miscellaneous;
import com.ecnudbcourse.acnhdb.dto.MiscellaneousMaterials;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface MiscellaneousMapper extends BaseMapper<Miscellaneous> {

    @Select("SELECT * FROM miscellaneous WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Miscellaneous> findByName(@Param("name") String name);

    @Insert("INSERT INTO miscellaneous (Name, Variation, Body_Title, Pattern, Pattern_Title, DIY, Body_Customize, Pattern_Customize, Kit_Cost, Buy, Sell, Color1, Color2, Size, Source, Source_Notes, HHA_Concept1, HHA_Concept2, HHA_Series, HHA_Set, Interact, Tag, Outdoor, Speaker_Type, Lighting_Type, Catalog) VALUES (#{name}, #{variation}, #{bodyTitle}, #{pattern}, #{patternTitle}, #{diy}, #{bodyCustomize}, #{patternCustomize}, #{kitCost}, #{buy}, #{sell}, #{color1}, #{color2}, #{size}, #{source}, #{sourceNotes}, #{hhaConcept1}, #{hhaConcept2}, #{hhaSeries}, #{hhaSet}, #{interact}, #{tag}, #{outdoor}, #{speakerType}, #{lightingType}, #{catalog})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertMiscellaneous(Miscellaneous miscellaneous);

    @Update("UPDATE miscellaneous SET Name = #{name}, Variation = #{variation}, Body_Title = #{bodyTitle}, Pattern = #{pattern}, Pattern_Title = #{patternTitle}, DIY = #{diy}, Body_Customize = #{bodyCustomize}, Pattern_Customize = #{patternCustomize}, Kit_Cost = #{kitCost}, Buy = #{buy}, Sell = #{sell}, Color1 = #{color1}, Color2 = #{color2}, Size = #{size}, Source = #{source}, Source_Notes = #{sourceNotes}, HHA_Concept1 = #{hhaConcept1}, HHA_Concept2 = #{hhaConcept2}, HHA_Series = #{hhaSeries}, HHA_Set = #{hhaSet}, Interact = #{interact}, Tag = #{tag}, Outdoor = #{outdoor}, Speaker_Type = #{speakerType}, Lighting_Type = #{lightingType}, Catalog = #{catalog} WHERE id = #{id}")
    int updateMiscellaneous(Miscellaneous miscellaneous);

    @Delete("DELETE FROM miscellaneous WHERE id = #{id}")
    int deleteById(@Param("id") Long id);


    @Select("<script>" +
            "SELECT * FROM miscellaneous" +
            " WHERE 1=1 AND buy != 0" +
            "<if test='min != null'> AND buy &gt;= #{min}</if>" +
            "<if test='max != null'> AND buy &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY buy ${sort}" +
            "</if>" +
            "</script>")
    List<Miscellaneous> searchByBuyRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("<script>" +
            "SELECT * FROM miscellaneous" +
            " WHERE 1=1 AND sell != 0" +
            "<if test='min != null'> AND sell &gt;= #{min}</if>" +
            "<if test='max != null'> AND sell &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY sell ${sort}" +
            "</if>" +
            "</script>")
    List<Miscellaneous> searchBySellRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("<script>" +
            "SELECT * FROM miscellaneous" +
            " WHERE 1=1 AND kit_cost != 0" +
            "<if test='min != null'> AND kit_cost &gt;= #{min}</if>" +
            "<if test='max != null'> AND kit_cost &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY kit_cost ${sort}" +
            "</if>" +
            "</script>")
    List<Miscellaneous> searchByKitCostRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("SELECT * FROM miscellaneous WHERE Variation LIKE CONCAT('%', #{variation}, '%')")
    List<Miscellaneous> findByVariation(@Param("variation") String variation);

    @Select("SELECT * FROM miscellaneous WHERE Body_Title LIKE CONCAT('%', #{bodyTitle}, '%')")
    List<Miscellaneous> findByBodyTitle(@Param("bodyTitle") String bodyTitle);

    @Select("SELECT * FROM miscellaneous WHERE Pattern LIKE CONCAT('%', #{pattern}, '%')")
    List<Miscellaneous> findByPattern(@Param("pattern") String pattern);

    @Select("SELECT * FROM miscellaneous WHERE Pattern_Title LIKE CONCAT('%', #{patternTitle}, '%')")
    List<Miscellaneous> findByPatternTitle(@Param("patternTitle") String patternTitle);

    @Select("SELECT * FROM miscellaneous WHERE DIY LIKE CONCAT('%', #{diy}, '%')")
    List<Miscellaneous> findByDiy(@Param("diy") String diy);

    @Select("SELECT * FROM miscellaneous WHERE Body_Customize LIKE CONCAT('%', #{bodyCustomize}, '%')")
    List<Miscellaneous> findByBodyCustomize(@Param("bodyCustomize") String bodyCustomize);

    @Select("SELECT * FROM miscellaneous WHERE Pattern_Customize LIKE CONCAT('%', #{patternCustomize}, '%')")
    List<Miscellaneous> findByPatternCustomize(@Param("patternCustomize") String patternCustomize);

    @Select("SELECT * FROM miscellaneous WHERE Color1 LIKE CONCAT('%', #{color1}, '%')")
    List<Miscellaneous> findByColor1(@Param("color1") String color1);

    @Select("SELECT * FROM miscellaneous WHERE Color2 LIKE CONCAT('%', #{color2}, '%')")
    List<Miscellaneous> findByColor2(@Param("color2") String color2);

    @Select("SELECT * FROM miscellaneous WHERE Size LIKE CONCAT('%', #{size}, '%')")
    List<Miscellaneous> findBySize(@Param("size") String size);

    @Select("SELECT * FROM miscellaneous WHERE Source LIKE CONCAT('%', #{source}, '%')")
    List<Miscellaneous> findBySource(@Param("source") String source);

    @Select("SELECT * FROM miscellaneous WHERE Source_Notes LIKE CONCAT('%', #{sourceNotes}, '%')")
    List<Miscellaneous> findBySourceNotes(@Param("sourceNotes") String sourceNotes);

    @Select("SELECT * FROM miscellaneous WHERE HHA_Concept1 LIKE CONCAT('%', #{hhaConcept1}, '%')")
    List<Miscellaneous> findByHhaConcept1(@Param("hhaConcept1") String hhaConcept1);

    @Select("SELECT * FROM miscellaneous WHERE HHA_Concept2 LIKE CONCAT('%', #{hhaConcept2}, '%')")
    List<Miscellaneous> findByHhaConcept2(@Param("hhaConcept2") String hhaConcept2);

    @Select("SELECT * FROM miscellaneous WHERE HHA_Series LIKE CONCAT('%', #{hhaSeries}, '%')")
    List<Miscellaneous> findByHhaSeries(@Param("hhaSeries") String hhaSeries);

    @Select("SELECT * FROM miscellaneous WHERE HHA_Set LIKE CONCAT('%', #{hhaSet}, '%')")
    List<Miscellaneous> findByHhaSet(@Param("hhaSet") String hhaSet);

    @Select("SELECT * FROM miscellaneous WHERE Interact LIKE CONCAT('%', #{interact}, '%')")
    List<Miscellaneous> findByInteract(@Param("interact") String interact);

    @Select("SELECT * FROM miscellaneous WHERE Tag LIKE CONCAT('%', #{tag}, '%')")
    List<Miscellaneous> findByTag(@Param("tag") String tag);

    @Select("SELECT * FROM miscellaneous WHERE Outdoor LIKE CONCAT('%', #{outdoor}, '%')")
    List<Miscellaneous> findByOutdoor(@Param("outdoor") String outdoor);

    @Select("SELECT * FROM miscellaneous WHERE Speaker_Type LIKE CONCAT('%', #{speakerType}, '%')")
    List<Miscellaneous> findBySpeakerType(@Param("speakerType") String speakerType);

    @Select("SELECT * FROM miscellaneous WHERE Lighting_Type LIKE CONCAT('%', #{lightingType}, '%')")
    List<Miscellaneous> findByLightingType(@Param("lightingType") String lightingType);

    @Select("SELECT * FROM miscellaneous WHERE Catalog = #{catalog}")
    List<Miscellaneous> findByCatalog(@Param("catalog") String catalog);

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
            "       miscellaneous h" +
            "   JOIN" +
            "       recipes r ON h.Name = r.Name" +
            "   WHERE" +
            "       h.Name LIKE CONCAT('%', #{name}, '%')" +
            "   AND h.DIY = 'yes'")
    List<MiscellaneousMaterials> selectMiscellaneousMaterialsByName(@Param("name") String name);
}
