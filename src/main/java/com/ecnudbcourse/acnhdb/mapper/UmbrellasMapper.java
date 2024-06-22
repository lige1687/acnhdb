package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Umbrellas;
import com.ecnudbcourse.acnhdb.dto.UmbrellasMaterials;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface UmbrellasMapper extends BaseMapper<Umbrellas> {

    @Select("SELECT * FROM umbrellas WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Umbrellas> findByName(@Param("name") String name);

    @Insert("INSERT INTO umbrellas (Name, DIY, Buy, Sell, Color1, Color2, Miles_Price, Source, Source_Notes, Catalog) VALUES (#{name}, #{diy}, #{buy}, #{sell}, #{color1}, #{color2}, #{milesPrice}, #{source}, #{sourceNotes}, #{catalog})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertUmbrellas(Umbrellas umbrellas);

    @Update("UPDATE umbrellas SET Name = #{name}, DIY = #{diy}, Buy = #{buy}, Sell = #{sell}, Color1 = #{color1}, Color2 = #{color2}, Miles_Price = #{milesPrice}, Source = #{source}, Source_Notes = #{sourceNotes}, Catalog = #{catalog} WHERE id = #{id}")
    int updateUmbrellas(Umbrellas umbrellas);

    @Delete("DELETE FROM umbrellas WHERE id = #{id}")
    int deleteById(@Param("id") Long id);


    @Select("<script>" +
            "SELECT * FROM umbrellas" +
            " WHERE 1=1 AND buy != 0" +
            "<if test='min != null'> AND buy &gt;= #{min}</if>" +
            "<if test='max != null'> AND buy &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY buy ${sort}" +
            "</if>" +
            "</script>")
    List<Umbrellas> searchByBuyRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("<script>" +
            "SELECT * FROM umbrellas" +
            " WHERE 1=1 AND sell != 0" +
            "<if test='min != null'> AND sell &gt;= #{min}</if>" +
            "<if test='max != null'> AND sell &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY sell ${sort}" +
            "</if>" +
            "</script>")
    List<Umbrellas> searchBySellRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("<script>" +
            "SELECT * FROM umbrellas" +
            " WHERE 1=1 AND miles_Price != 0" +
            "<if test='min != null'> AND miles_Price &gt;= #{min}</if>" +
            "<if test='max != null'> AND miles_Price &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY miles_Price ${sort}" +
            "</if>" +
            "</script>")
    List<Umbrellas> searchByMilesPriceRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("SELECT * FROM umbrellas WHERE DIY LIKE CONCAT('%', #{diy}, '%')")
    List<Umbrellas> findByDiy(@Param("diy") String diy);

    @Select("SELECT * FROM umbrellas WHERE Color1 LIKE CONCAT('%', #{color1}, '%')")
    List<Umbrellas> findByColor1(@Param("color1") String color1);

    @Select("SELECT * FROM umbrellas WHERE Color2 LIKE CONCAT('%', #{color2}, '%')")
    List<Umbrellas> findByColor2(@Param("color2") String color2);

    @Select("SELECT * FROM umbrellas WHERE Source LIKE CONCAT('%', #{source}, '%')")
    List<Umbrellas> findBySource(@Param("source") String source);

    @Select("SELECT * FROM umbrellas WHERE Source_Notes LIKE CONCAT('%', #{sourceNotes}, '%')")
    List<Umbrellas> findBySourceNotes(@Param("sourceNotes") String sourceNotes);

    @Select("SELECT * FROM umbrellas WHERE Catalog = #{catalog}")
    List<Umbrellas> findByCatalog(@Param("catalog") String catalog);

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
            "       umbrellas h" +
            "   JOIN" +
            "       recipes r ON h.Name = r.Name" +
            "   WHERE" +
            "       h.Name LIKE CONCAT('%', #{name}, '%')" +
            "   AND h.DIY = 'yes'")
    List<UmbrellasMaterials> selectUmbrellasMaterialsByName(@Param("name") String name);
}
