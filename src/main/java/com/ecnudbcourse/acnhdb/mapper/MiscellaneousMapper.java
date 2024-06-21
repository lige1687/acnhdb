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

    @Select("SELECT * FROM miscellaneous WHERE diy = #{diy}")
    List<Miscellaneous> findByDiy(@Param("diy") String diy);

    @Select("SELECT * FROM miscellaneous WHERE body_customize = #{bodyCustomize}")
    List<Miscellaneous> findByBodyCustomize(@Param("bodyCustomize") String bodyCustomize);

    @Select("SELECT * FROM miscellaneous WHERE pattern_customize = #{patternCustomize}")
    List<Miscellaneous> findByPatternCustomize(@Param("patternCustomize") String patternCustomize);

    @Select("SELECT * FROM miscellaneous WHERE interact = #{interact}")
    List<Miscellaneous> findByInteract(@Param("interact") String interact);

    @Select("SELECT * FROM miscellaneous WHERE outdoor = #{outdoor}")
    List<Miscellaneous> findByOutdoor(@Param("outdoor") String outdoor);

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
