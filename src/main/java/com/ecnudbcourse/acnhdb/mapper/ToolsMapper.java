package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Tools;
import com.ecnudbcourse.acnhdb.dto.ToolsMaterials;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface ToolsMapper extends BaseMapper<Tools> {

    @Select("SELECT * FROM tools WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Tools> findByName(@Param("name") String name);

    @Insert("INSERT INTO tools (Name, Variation, Body_Title, DIY, Customize, Kit_Cost, Uses, Stack_Size, Buy, Sell, Tool_Set, Miles_Price, Source, Source_Notes) VALUES (#{name}, #{variation}, #{bodyTitle}, #{diy}, #{customize}, #{kitCost}, #{uses}, #{stackSize}, #{buy}, #{sell}, #{toolSet}, #{milesPrice}, #{source}, #{sourceNotes})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertTools(Tools tools);

    @Update("UPDATE tools SET Name = #{name}, Variation = #{variation}, Body_Title = #{bodyTitle}, DIY = #{diy}, Customize = #{customize}, Kit_Cost = #{kitCost}, Uses = #{uses}, Stack_Size = #{stackSize}, Buy = #{buy}, Sell = #{sell}, Tool_Set = #{toolSet}, Miles_Price = #{milesPrice}, Source = #{source}, Source_Notes = #{sourceNotes} WHERE id = #{id}")
    int updateTools(Tools tools);

    @Delete("DELETE FROM tools WHERE id = #{id}")
    int deleteById(@Param("id") Long id);


    @Select("<script>" +
            "SELECT * FROM tools" +
            " WHERE 1=1 AND buy != 0" +
            "<if test='min != null'> AND buy &gt;= #{min}</if>" +
            "<if test='max != null'> AND buy &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY buy ${sort}" +
            "</if>" +
            "</script>")
    List<Tools> searchByBuyRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("<script>" +
            "SELECT * FROM tools" +
            " WHERE 1=1 AND sell != 0" +
            "<if test='min != null'> AND sell &gt;= #{min}</if>" +
            "<if test='max != null'> AND sell &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY sell ${sort}" +
            "</if>" +
            "</script>")
    List<Tools> searchBySellRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("<script>" +
            "SELECT * FROM tools" +
            " WHERE 1=1 AND miles_Price != 0" +
            "<if test='min != null'> AND miles_Price &gt;= #{min}</if>" +
            "<if test='max != null'> AND miles_Price &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY miles_Price ${sort}" +
            "</if>" +
            "</script>")
    List<Tools> searchByMilesPriceRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("<script>" +
            "SELECT * FROM tools" +
            " WHERE 1=1 AND kit_cost != 0" +
            "<if test='min != null'> AND kit_cost &gt;= #{min}</if>" +
            "<if test='max != null'> AND kit_cost &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY kit_cost ${sort}" +
            "</if>" +
            "</script>")
    List<Tools> searchByKitCostRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("SELECT * FROM tools WHERE diy = #{diy}")
    List<Tools> findByDiy(@Param("diy") String diy);

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
            "       tools h" +
            "   JOIN" +
            "       recipes r ON h.Name = r.Name" +
            "   WHERE" +
            "       h.Name LIKE CONCAT('%', #{name}, '%')" +
            "   AND h.DIY = 'yes'")
    List<ToolsMaterials> selectToolsMaterialsByName(@Param("name") String name);
}
