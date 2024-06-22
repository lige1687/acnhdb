package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Wallpaper;
import com.ecnudbcourse.acnhdb.dto.WallpaperMaterials;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface WallpaperMapper extends BaseMapper<Wallpaper> {

    @Select("SELECT * FROM wallpaper WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Wallpaper> findByName(@Param("name") String name);

    @Insert("INSERT INTO wallpaper (Name, VFX, VFX_Type, DIY, Buy, Sell, Color1, Color2, Miles_Price, Source, Source_Notes, Catalog, Window_Type, Window_Color, Pane_Type, Curtain_Type, Curtain_Color, Ceiling_Type, HHA_Concept1, HHA_Concept2, HHA_Series, Tag) VALUES (#{name}, #{vfx}, #{vfxType}, #{diy}, #{buy}, #{sell}, #{color1}, #{color2}, #{milesPrice}, #{source}, #{sourceNotes}, #{catalog}, #{windowType}, #{windowColor}, #{paneType}, #{curtainType}, #{curtainColor}, #{ceilingType}, #{hhaConcept1}, #{hhaConcept2}, #{hhaSeries}, #{tag})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertWallpaper(Wallpaper wallpaper);

    @Update("UPDATE wallpaper SET Name = #{name}, VFX = #{vfx}, VFX_Type = #{vfxType}, DIY = #{diy}, Buy = #{buy}, Sell = #{sell}, Color1 = #{color1}, Color2 = #{color2}, Miles_Price = #{milesPrice}, Source = #{source}, Source_Notes = #{sourceNotes}, Catalog = #{catalog}, Window_Type = #{windowType}, Window_Color = #{windowColor}, Pane_Type = #{paneType}, Curtain_Type = #{curtainType}, Curtain_Color = #{curtainColor}, Ceiling_Type = #{ceilingType}, HHA_Concept1 = #{hhaConcept1}, HHA_Concept2 = #{hhaConcept2}, HHA_Series = #{hhaSeries}, Tag = #{tag} WHERE id = #{id}")
    int updateWallpaper(Wallpaper wallpaper);

    @Delete("DELETE FROM wallpaper WHERE id = #{id}")
    int deleteById(@Param("id") Long id);


    @Select("<script>" +
            "SELECT * FROM wallpaper" +
            " WHERE 1=1 AND buy != 0" +
            "<if test='min != null'> AND buy &gt;= #{min}</if>" +
            "<if test='max != null'> AND buy &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY buy ${sort}" +
            "</if>" +
            "</script>")
    List<Wallpaper> searchByBuyRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("<script>" +
            "SELECT * FROM wallpaper" +
            " WHERE 1=1 AND sell != 0" +
            "<if test='min != null'> AND sell &gt;= #{min}</if>" +
            "<if test='max != null'> AND sell &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY sell ${sort}" +
            "</if>" +
            "</script>")
    List<Wallpaper> searchBySellRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("<script>" +
            "SELECT * FROM wallpaper" +
            " WHERE 1=1 AND miles_Price != 0" +
            "<if test='min != null'> AND miles_Price &gt;= #{min}</if>" +
            "<if test='max != null'> AND miles_Price &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY miles_Price ${sort}" +
            "</if>" +
            "</script>")
    List<Wallpaper> searchByMilesPriceRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("SELECT * FROM wallpaper WHERE VFX LIKE CONCAT('%', #{vfx}, '%')")
    List<Wallpaper> findByVfx(@Param("vfx") String vfx);

    @Select("SELECT * FROM wallpaper WHERE VFX_Type LIKE CONCAT('%', #{vfxType}, '%')")
    List<Wallpaper> findByVfxType(@Param("vfxType") String vfxType);

    @Select("SELECT * FROM wallpaper WHERE DIY LIKE CONCAT('%', #{diy}, '%')")
    List<Wallpaper> findByDiy(@Param("diy") String diy);

    @Select("SELECT * FROM wallpaper WHERE Color1 LIKE CONCAT('%', #{color1}, '%')")
    List<Wallpaper> findByColor1(@Param("color1") String color1);

    @Select("SELECT * FROM wallpaper WHERE Color2 LIKE CONCAT('%', #{color2}, '%')")
    List<Wallpaper> findByColor2(@Param("color2") String color2);

    @Select("SELECT * FROM wallpaper WHERE Source LIKE CONCAT('%', #{source}, '%')")
    List<Wallpaper> findBySource(@Param("source") String source);

    @Select("SELECT * FROM wallpaper WHERE Source_Notes LIKE CONCAT('%', #{sourceNotes}, '%')")
    List<Wallpaper> findBySourceNotes(@Param("sourceNotes") String sourceNotes);

    @Select("SELECT * FROM wallpaper WHERE Catalog = #{catalog}")
    List<Wallpaper> findByCatalog(@Param("catalog") String catalog);

    @Select("SELECT * FROM wallpaper WHERE Window_Type LIKE CONCAT('%', #{windowType}, '%')")
    List<Wallpaper> findByWindowType(@Param("windowType") String windowType);

    @Select("SELECT * FROM wallpaper WHERE Window_Color LIKE CONCAT('%', #{windowColor}, '%')")
    List<Wallpaper> findByWindowColor(@Param("windowColor") String windowColor);

    @Select("SELECT * FROM wallpaper WHERE Pane_Type LIKE CONCAT('%', #{paneType}, '%')")
    List<Wallpaper> findByPaneType(@Param("paneType") String paneType);

    @Select("SELECT * FROM wallpaper WHERE Curtain_Type LIKE CONCAT('%', #{curtainType}, '%')")
    List<Wallpaper> findByCurtainType(@Param("curtainType") String curtainType);

    @Select("SELECT * FROM wallpaper WHERE Curtain_Color LIKE CONCAT('%', #{curtainColor}, '%')")
    List<Wallpaper> findByCurtainColor(@Param("curtainColor") String curtainColor);

    @Select("SELECT * FROM wallpaper WHERE Ceiling_Type LIKE CONCAT('%', #{ceilingType}, '%')")
    List<Wallpaper> findByCeilingType(@Param("ceilingType") String ceilingType);

    @Select("SELECT * FROM wallpaper WHERE HHA_Concept1 LIKE CONCAT('%', #{hhaConcept1}, '%')")
    List<Wallpaper> findByHhaConcept1(@Param("hhaConcept1") String hhaConcept1);

    @Select("SELECT * FROM wallpaper WHERE HHA_Concept2 LIKE CONCAT('%', #{hhaConcept2}, '%')")
    List<Wallpaper> findByHhaConcept2(@Param("hhaConcept2") String hhaConcept2);

    @Select("SELECT * FROM wallpaper WHERE HHA_Series LIKE CONCAT('%', #{hhaSeries}, '%')")
    List<Wallpaper> findByHhaSeries(@Param("hhaSeries") String hhaSeries);

    @Select("SELECT * FROM wallpaper WHERE Tag LIKE CONCAT('%', #{tag}, '%')")
    List<Wallpaper> findByTag(@Param("tag") String tag);

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
            "       wallpaper h" +
            "   JOIN" +
            "       recipes r ON h.Name = r.Name" +
            "   WHERE" +
            "       h.Name LIKE CONCAT('%', #{name}, '%')" +
            "   AND h.DIY = 'yes'")
    List<WallpaperMaterials> selectWallpaperMaterialsByName(@Param("name") String name);
}
