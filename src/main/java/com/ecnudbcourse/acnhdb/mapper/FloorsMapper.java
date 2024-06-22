package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Floors;
import com.ecnudbcourse.acnhdb.dto.FloorsMaterials;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface FloorsMapper extends BaseMapper<Floors> {

    @Select("SELECT * FROM floors WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Floors> findByName(@Param("name") String name);

    @Insert("INSERT INTO floors (Name, VFX, DIY, Buy, Sell, Color1, Color2, Miles_Price, Source, HHA_Concept1, HHA_Concept2, HHA_Series, Tag, Catalog) VALUES (#{name}, #{vfx}, #{diy}, #{buy}, #{sell}, #{color1}, #{color2}, #{milesPrice}, #{source}, #{hhaConcept1}, #{hhaConcept2}, #{hhaSeries}, #{tag}, #{catalog})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertFloors(Floors floors);

    @Update("UPDATE floors SET Name = #{name}, VFX = #{vfx}, DIY = #{diy}, Buy = #{buy}, Sell = #{sell}, Color1 = #{color1}, Color2 = #{color2}, Miles_Price = #{milesPrice}, Source = #{source}, HHA_Concept1 = #{hhaConcept1}, HHA_Concept2 = #{hhaConcept2}, HHA_Series = #{hhaSeries}, Tag = #{tag}, Catalog = #{catalog} WHERE id = #{id}")
    int updateFloors(Floors floors);

    @Delete("DELETE FROM floors WHERE id = #{id}")
    int deleteById(@Param("id") Long id);


    @Select("<script>" +
            "SELECT * FROM floors" +
            " WHERE 1=1 AND buy != 0" +
            "<if test='min != null'> AND buy &gt;= #{min}</if>" +
            "<if test='max != null'> AND buy &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY buy ${sort}" +
            "</if>" +
            "</script>")
    List<Floors> searchByBuyRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("<script>" +
            "SELECT * FROM floors" +
            " WHERE 1=1 AND sell != 0" +
            "<if test='min != null'> AND sell &gt;= #{min}</if>" +
            "<if test='max != null'> AND sell &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY sell ${sort}" +
            "</if>" +
            "</script>")
    List<Floors> searchBySellRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("<script>" +
            "SELECT * FROM floors" +
            " WHERE 1=1 AND miles_Price != 0" +
            "<if test='min != null'> AND miles_Price &gt;= #{min}</if>" +
            "<if test='max != null'> AND miles_Price &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY miles_Price ${sort}" +
            "</if>" +
            "</script>")
    List<Floors> searchByMilesPriceRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("SELECT * FROM floors WHERE VFX LIKE CONCAT('%', #{vfx}, '%')")
    List<Floors> findByVfx(@Param("vfx") String vfx);

    @Select("SELECT * FROM floors WHERE DIY LIKE CONCAT('%', #{diy}, '%')")
    List<Floors> findByDiy(@Param("diy") String diy);

    @Select("SELECT * FROM floors WHERE Color1 LIKE CONCAT('%', #{color1}, '%')")
    List<Floors> findByColor1(@Param("color1") String color1);

    @Select("SELECT * FROM floors WHERE Color2 LIKE CONCAT('%', #{color2}, '%')")
    List<Floors> findByColor2(@Param("color2") String color2);

    @Select("SELECT * FROM floors WHERE Source LIKE CONCAT('%', #{source}, '%')")
    List<Floors> findBySource(@Param("source") String source);

    @Select("SELECT * FROM floors WHERE HHA_Concept1 LIKE CONCAT('%', #{hhaConcept1}, '%')")
    List<Floors> findByHhaConcept1(@Param("hhaConcept1") String hhaConcept1);

    @Select("SELECT * FROM floors WHERE HHA_Concept2 LIKE CONCAT('%', #{hhaConcept2}, '%')")
    List<Floors> findByHhaConcept2(@Param("hhaConcept2") String hhaConcept2);

    @Select("SELECT * FROM floors WHERE HHA_Series LIKE CONCAT('%', #{hhaSeries}, '%')")
    List<Floors> findByHhaSeries(@Param("hhaSeries") String hhaSeries);

    @Select("SELECT * FROM floors WHERE Tag LIKE CONCAT('%', #{tag}, '%')")
    List<Floors> findByTag(@Param("tag") String tag);

    @Select("SELECT * FROM floors WHERE Catalog = #{catalog}")
    List<Floors> findByCatalog(@Param("catalog") String catalog);

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
            "       floors h" +
            "   JOIN" +
            "       recipes r ON h.Name = r.Name" +
            "   WHERE" +
            "       h.Name LIKE CONCAT('%', #{name}, '%')" +
            "   AND h.DIY = 'yes'")
    List<FloorsMaterials> selectFloorsMaterialsByName(@Param("name") String name);
}
