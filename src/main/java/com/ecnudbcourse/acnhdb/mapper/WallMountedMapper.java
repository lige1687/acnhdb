package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.WallMounted;
import com.ecnudbcourse.acnhdb.dto.WallMountedMaterials;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface WallMountedMapper extends BaseMapper<WallMounted> {

    @Select("SELECT * FROM wall_mounted WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<WallMounted> findByName(@Param("name") String name);

    @Insert("INSERT INTO wall_mounted (Name, Variation, Body_Title, Pattern, Pattern_Title, DIY, Body_Customize, Pattern_Customize, Kit_Cost, Buy, Sell, Color1, Color2, Size, Source, Source_Notes, HHA_Concept1, HHA_Concept2, HHA_Series, HHA_Set, Interact, Tag, Lighting_Type, Door_Deco, Catalog) VALUES (#{name}, #{variation}, #{bodyTitle}, #{pattern}, #{patternTitle}, #{diy}, #{bodyCustomize}, #{patternCustomize}, #{kitCost}, #{buy}, #{sell}, #{color1}, #{color2}, #{size}, #{source}, #{sourceNotes}, #{hhaConcept1}, #{hhaConcept2}, #{hhaSeries}, #{hhaSet}, #{interact}, #{tag}, #{lightingType}, #{doorDeco}, #{catalog})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertWallMounted(WallMounted wall_mounted);

    @Update("UPDATE wall_mounted SET Name = #{name}, Variation = #{variation}, Body_Title = #{bodyTitle}, Pattern = #{pattern}, Pattern_Title = #{patternTitle}, DIY = #{diy}, Body_Customize = #{bodyCustomize}, Pattern_Customize = #{patternCustomize}, Kit_Cost = #{kitCost}, Buy = #{buy}, Sell = #{sell}, Color1 = #{color1}, Color2 = #{color2}, Size = #{size}, Source = #{source}, Source_Notes = #{sourceNotes}, HHA_Concept1 = #{hhaConcept1}, HHA_Concept2 = #{hhaConcept2}, HHA_Series = #{hhaSeries}, HHA_Set = #{hhaSet}, Interact = #{interact}, Tag = #{tag}, Lighting_Type = #{lightingType}, Door_Deco = #{doorDeco}, Catalog = #{catalog} WHERE id = #{id}")
    int updateWallMounted(WallMounted wall_mounted);

    @Delete("DELETE FROM wall_mounted WHERE id = #{id}")
    int deleteById(@Param("id") Long id);


    @Select("<script>" +
            "SELECT * FROM wall_mounted" +
            " WHERE 1=1 AND buy != 0" +
            "<if test='min != null'> AND buy &gt;= #{min}</if>" +
            "<if test='max != null'> AND buy &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY buy ${sort}" +
            "</if>" +
            "</script>")
    List<WallMounted> searchByBuyRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("<script>" +
            "SELECT * FROM wall_mounted" +
            " WHERE 1=1 AND sell != 0" +
            "<if test='min != null'> AND sell &gt;= #{min}</if>" +
            "<if test='max != null'> AND sell &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY sell ${sort}" +
            "</if>" +
            "</script>")
    List<WallMounted> searchBySellRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("<script>" +
            "SELECT * FROM wall_mounted" +
            " WHERE 1=1 AND kit_cost != 0" +
            "<if test='min != null'> AND kit_cost &gt;= #{min}</if>" +
            "<if test='max != null'> AND kit_cost &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY kit_cost ${sort}" +
            "</if>" +
            "</script>")
    List<WallMounted> searchByKitCostRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("SELECT * FROM wall_mounted WHERE diy = #{diy}")
    List<WallMounted> findByDiy(@Param("diy") String diy);

    @Select("SELECT * FROM wall_mounted WHERE body_customize = #{bodyCustomize}")
    List<WallMounted> findByBodyCustomize(@Param("bodyCustomize") String bodyCustomize);

    @Select("SELECT * FROM wall_mounted WHERE pattern_customize = #{patternCustomize}")
    List<WallMounted> findByPatternCustomize(@Param("patternCustomize") String patternCustomize);

    @Select("SELECT * FROM wall_mounted WHERE interact = #{interact}")
    List<WallMounted> findByInteract(@Param("interact") String interact);

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
            "       wall_mounted h" +
            "   JOIN" +
            "       recipes r ON h.Name = r.Name" +
            "   WHERE" +
            "       h.Name LIKE CONCAT('%', #{name}, '%')" +
            "   AND h.DIY = 'yes'")
    List<WallMountedMaterials> selectWallMountedMaterialsByName(@Param("name") String name);
}
