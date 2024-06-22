package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Art;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface ArtMapper extends BaseMapper<Art> {

    @Select("SELECT * FROM art WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Art> findByName(@Param("name") String name);

    @Insert("INSERT INTO art (Name, Genuine, Category, Buy, Sell, Size, Real_Artwork_Title, Artist, Museum_Description, HHA_Concept1, HHA_Concept2, Tag) VALUES (#{name}, #{genuine}, #{category}, #{buy}, #{sell}, #{size}, #{realArtworkTitle}, #{artist}, #{museumDescription}, #{hhaConcept1}, #{hhaConcept2}, #{tag})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertArt(Art art);

    @Update("UPDATE art SET Name = #{name}, Genuine = #{genuine}, Category = #{category}, Buy = #{buy}, Sell = #{sell}, Size = #{size}, Real_Artwork_Title = #{realArtworkTitle}, Artist = #{artist}, Museum_Description = #{museumDescription}, HHA_Concept1 = #{hhaConcept1}, HHA_Concept2 = #{hhaConcept2}, Tag = #{tag} WHERE id = #{id}")
    int updateArt(Art art);

    @Delete("DELETE FROM art WHERE id = #{id}")
    int deleteById(@Param("id") Long id);


    @Select("<script>" +
            "SELECT * FROM art" +
            " WHERE 1=1 AND buy != 0" +
            "<if test='min != null'> AND buy &gt;= #{min}</if>" +
            "<if test='max != null'> AND buy &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY buy ${sort}" +
            "</if>" +
            "</script>")
    List<Art> searchByBuyRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("<script>" +
            "SELECT * FROM art" +
            " WHERE 1=1 AND sell != 0" +
            "<if test='min != null'> AND sell &gt;= #{min}</if>" +
            "<if test='max != null'> AND sell &lt;= #{max}</if>" +
            "<if test='sort != null'>" +
            " ORDER BY sell ${sort}" +
            "</if>" +
            "</script>")
    List<Art> searchBySellRangeAndSort(@Param("min") Integer min, @Param("max") Integer max, @Param("sort") String sort);

    @Select("SELECT * FROM art WHERE Genuine LIKE CONCAT('%', #{genuine}, '%')")
    List<Art> findByGenuine(@Param("genuine") String genuine);

    @Select("SELECT * FROM art WHERE Category LIKE CONCAT('%', #{category}, '%')")
    List<Art> findByCategory(@Param("category") String category);

    @Select("SELECT * FROM art WHERE Size LIKE CONCAT('%', #{size}, '%')")
    List<Art> findBySize(@Param("size") String size);

    @Select("SELECT * FROM art WHERE Real_Artwork_Title LIKE CONCAT('%', #{realArtworkTitle}, '%')")
    List<Art> findByRealArtworkTitle(@Param("realArtworkTitle") String realArtworkTitle);

    @Select("SELECT * FROM art WHERE Artist LIKE CONCAT('%', #{artist}, '%')")
    List<Art> findByArtist(@Param("artist") String artist);

    @Select("SELECT * FROM art WHERE Museum_Description LIKE CONCAT('%', #{museumDescription}, '%')")
    List<Art> findByMuseumDescription(@Param("museumDescription") String museumDescription);

    @Select("SELECT * FROM art WHERE HHA_Concept1 LIKE CONCAT('%', #{hhaConcept1}, '%')")
    List<Art> findByHhaConcept1(@Param("hhaConcept1") String hhaConcept1);

    @Select("SELECT * FROM art WHERE HHA_Concept2 LIKE CONCAT('%', #{hhaConcept2}, '%')")
    List<Art> findByHhaConcept2(@Param("hhaConcept2") String hhaConcept2);

    @Select("SELECT * FROM art WHERE Tag LIKE CONCAT('%', #{tag}, '%')")
    List<Art> findByTag(@Param("tag") String tag);
}
