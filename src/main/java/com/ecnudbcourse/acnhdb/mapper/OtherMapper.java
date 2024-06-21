package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Other;
import com.ecnudbcourse.acnhdb.dto.OtherMaterials;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface OtherMapper extends BaseMapper<Other> {

    @Select("SELECT * FROM other WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Other> findByName(@Param("name") String name);

    @Insert("INSERT INTO other (Name, DIY, Stack_Size, Buy, Sell, Miles_Price, Source, Source_Notes, Tag, Color1, Color2) VALUES (#{name}, #{diy}, #{stackSize}, #{buy}, #{sell}, #{milesPrice}, #{source}, #{sourceNotes}, #{tag}, #{color1}, #{color2})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertOther(Other other);

    @Update("UPDATE other SET Name = #{name}, DIY = #{diy}, Stack_Size = #{stackSize}, Buy = #{buy}, Sell = #{sell}, Miles_Price = #{milesPrice}, Source = #{source}, Source_Notes = #{sourceNotes}, Tag = #{tag}, Color1 = #{color1}, Color2 = #{color2} WHERE id = #{id}")
    int updateOther(Other other);

    @Delete("DELETE FROM other WHERE id = #{id}")
    int deleteById(@Param("id") Long id);


    @Select("<script>" +
            "SELECT * FROM other" +
            " WHERE 1=1 AND buy != 0" +
            "<if test='min != null'> AND buy &gt;= #{min}</if>" +
            "<if test='max != null'> AND buy &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY buy ${sort}" +
            "</if>" +
            "</script>")
    List<Other> searchByBuyRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("<script>" +
            "SELECT * FROM other" +
            " WHERE 1=1 AND sell != 0" +
            "<if test='min != null'> AND sell &gt;= #{min}</if>" +
            "<if test='max != null'> AND sell &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY sell ${sort}" +
            "</if>" +
            "</script>")
    List<Other> searchBySellRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("<script>" +
            "SELECT * FROM other" +
            " WHERE 1=1 AND miles_Price != 0" +
            "<if test='min != null'> AND miles_Price &gt;= #{min}</if>" +
            "<if test='max != null'> AND miles_Price &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY miles_Price ${sort}" +
            "</if>" +
            "</script>")
    List<Other> searchByMilesPriceRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("SELECT * FROM other WHERE diy = #{diy}")
    List<Other> findByDiy(@Param("diy") String diy);

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
            "       other h" +
            "   JOIN" +
            "       recipes r ON h.Name = r.Name" +
            "   WHERE" +
            "       h.Name LIKE CONCAT('%', #{name}, '%')" +
            "   AND h.DIY = 'yes'")
    List<OtherMaterials> selectOtherMaterialsByName(@Param("name") String name);
}
