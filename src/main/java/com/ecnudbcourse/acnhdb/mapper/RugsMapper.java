package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Rugs;
import com.ecnudbcourse.acnhdb.dto.RugsMaterials;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface RugsMapper extends BaseMapper<Rugs> {

    @Select("SELECT * FROM rugs WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Rugs> findByName(@Param("name") String name);

    @Insert("INSERT INTO rugs (Name, DIY, Buy, Sell, Color1, Color2, Size, Miles_Price, Source, Source_Notes, HHA_Concept1, HHA_Concept2, HHA_Series, Tag, Catalog) VALUES (#{name}, #{diy}, #{buy}, #{sell}, #{color1}, #{color2}, #{size}, #{milesPrice}, #{source}, #{sourceNotes}, #{hhaConcept1}, #{hhaConcept2}, #{hhaSeries}, #{tag}, #{catalog})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertRugs(Rugs rugs);

    @Update("UPDATE rugs SET Name = #{name}, DIY = #{diy}, Buy = #{buy}, Sell = #{sell}, Color1 = #{color1}, Color2 = #{color2}, Size = #{size}, Miles_Price = #{milesPrice}, Source = #{source}, Source_Notes = #{sourceNotes}, HHA_Concept1 = #{hhaConcept1}, HHA_Concept2 = #{hhaConcept2}, HHA_Series = #{hhaSeries}, Tag = #{tag}, Catalog = #{catalog} WHERE id = #{id}")
    int updateRugs(Rugs rugs);

    @Delete("DELETE FROM rugs WHERE id = #{id}")
    int deleteById(@Param("id") Long id);


    @Select("<script>" +
            "SELECT * FROM rugs" +
            " WHERE 1=1 AND buy != 0" +
            "<if test='min != null'> AND buy &gt;= #{min}</if>" +
            "<if test='max != null'> AND buy &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY buy ${sort}" +
            "</if>" +
            "</script>")
    List<Rugs> searchByBuyRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("<script>" +
            "SELECT * FROM rugs" +
            " WHERE 1=1 AND sell != 0" +
            "<if test='min != null'> AND sell &gt;= #{min}</if>" +
            "<if test='max != null'> AND sell &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY sell ${sort}" +
            "</if>" +
            "</script>")
    List<Rugs> searchBySellRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("<script>" +
            "SELECT * FROM rugs" +
            " WHERE 1=1 AND miles_Price != 0" +
            "<if test='min != null'> AND miles_Price &gt;= #{min}</if>" +
            "<if test='max != null'> AND miles_Price &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY miles_Price ${sort}" +
            "</if>" +
            "</script>")
    List<Rugs> searchByMilesPriceRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("SELECT * FROM rugs WHERE DIY LIKE CONCAT('%', #{diy}, '%')")
    List<Rugs> findByDiy(@Param("diy") String diy);

    @Select("SELECT * FROM rugs WHERE Color1 LIKE CONCAT('%', #{color1}, '%')")
    List<Rugs> findByColor1(@Param("color1") String color1);

    @Select("SELECT * FROM rugs WHERE Color2 LIKE CONCAT('%', #{color2}, '%')")
    List<Rugs> findByColor2(@Param("color2") String color2);

    @Select("SELECT * FROM rugs WHERE Size LIKE CONCAT('%', #{size}, '%')")
    List<Rugs> findBySize(@Param("size") String size);

    @Select("SELECT * FROM rugs WHERE Source LIKE CONCAT('%', #{source}, '%')")
    List<Rugs> findBySource(@Param("source") String source);

    @Select("SELECT * FROM rugs WHERE Source_Notes LIKE CONCAT('%', #{sourceNotes}, '%')")
    List<Rugs> findBySourceNotes(@Param("sourceNotes") String sourceNotes);

    @Select("SELECT * FROM rugs WHERE HHA_Concept1 LIKE CONCAT('%', #{hhaConcept1}, '%')")
    List<Rugs> findByHhaConcept1(@Param("hhaConcept1") String hhaConcept1);

    @Select("SELECT * FROM rugs WHERE HHA_Concept2 LIKE CONCAT('%', #{hhaConcept2}, '%')")
    List<Rugs> findByHhaConcept2(@Param("hhaConcept2") String hhaConcept2);

    @Select("SELECT * FROM rugs WHERE HHA_Series LIKE CONCAT('%', #{hhaSeries}, '%')")
    List<Rugs> findByHhaSeries(@Param("hhaSeries") String hhaSeries);

    @Select("SELECT * FROM rugs WHERE Tag LIKE CONCAT('%', #{tag}, '%')")
    List<Rugs> findByTag(@Param("tag") String tag);

    @Select("SELECT * FROM rugs WHERE Catalog = #{catalog}")
    List<Rugs> findByCatalog(@Param("catalog") String catalog);

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
            "       rugs h" +
            "   JOIN" +
            "       recipes r ON h.Name = r.Name" +
            "   WHERE" +
            "       h.Name LIKE CONCAT('%', #{name}, '%')" +
            "   AND h.DIY = 'yes'")
    List<RugsMaterials> selectRugsMaterialsByName(@Param("name") String name);
}
