package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Bags;
import com.ecnudbcourse.acnhdb.dto.BagsMaterials;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface BagsMapper extends BaseMapper<Bags> {

    @Select("SELECT * FROM bags WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Bags> findByName(@Param("name") String name);

    @Insert("INSERT INTO bags (Name, Variation, DIY, Buy, Sell, Color1, Color2, Miles_Price, Source, Style, Label_Themes, Catalog) VALUES (#{name}, #{variation}, #{diy}, #{buy}, #{sell}, #{color1}, #{color2}, #{milesPrice}, #{source}, #{style}, #{labelThemes}, #{catalog})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertBags(Bags bags);

    @Update("UPDATE bags SET Name = #{name}, Variation = #{variation}, DIY = #{diy}, Buy = #{buy}, Sell = #{sell}, Color1 = #{color1}, Color2 = #{color2}, Miles_Price = #{milesPrice}, Source = #{source}, Style = #{style}, Label_Themes = #{labelThemes}, Catalog = #{catalog} WHERE id = #{id}")
    int updateBags(Bags bags);

    @Delete("DELETE FROM bags WHERE id = #{id}")
    int deleteById(@Param("id") Long id);


    @Select("<script>" +
            "SELECT * FROM bags" +
            " WHERE 1=1 AND buy != 0" +
            "<if test='min != null'> AND buy &gt;= #{min}</if>" +
            "<if test='max != null'> AND buy &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY buy ${sort}" +
            "</if>" +
            "</script>")
    List<Bags> searchByBuyRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("<script>" +
            "SELECT * FROM bags" +
            " WHERE 1=1 AND sell != 0" +
            "<if test='min != null'> AND sell &gt;= #{min}</if>" +
            "<if test='max != null'> AND sell &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY sell ${sort}" +
            "</if>" +
            "</script>")
    List<Bags> searchBySellRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("<script>" +
            "SELECT * FROM bags" +
            " WHERE 1=1 AND miles_Price != 0" +
            "<if test='min != null'> AND miles_Price &gt;= #{min}</if>" +
            "<if test='max != null'> AND miles_Price &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY miles_Price ${sort}" +
            "</if>" +
            "</script>")
    List<Bags> searchByMilesPriceRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("SELECT * FROM bags WHERE diy = #{diy}")
    List<Bags> findByDiy(@Param("diy") String diy);

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
            "       bags h" +
            "   JOIN" +
            "       recipes r ON h.Name = r.Name" +
            "   WHERE" +
            "       h.Name LIKE CONCAT('%', #{name}, '%')" +
            "   AND h.DIY = 'yes'")
    List<BagsMaterials> selectBagsMaterialsByName(@Param("name") String name);
}
