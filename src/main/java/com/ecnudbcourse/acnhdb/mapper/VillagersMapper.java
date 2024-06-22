package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Villagers;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface VillagersMapper extends BaseMapper<Villagers> {

    @Select("SELECT * FROM villagers WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Villagers> findByName(@Param("name") String name);

    @Insert("INSERT INTO villagers (Name, Species, Gender, Personality, Hobby, Birthday, Catchphrase, Favorite_Song, Style1, Style2, Color1, Color2, Wallpaper, Flooring) VALUES (#{name}, #{species}, #{gender}, #{personality}, #{hobby}, #{birthday}, #{catchphrase}, #{favoriteSong}, #{style1}, #{style2}, #{color1}, #{color2}, #{wallpaper}, #{flooring})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertVillagers(Villagers villagers);

    @Update("UPDATE villagers SET Name = #{name}, Species = #{species}, Gender = #{gender}, Personality = #{personality}, Hobby = #{hobby}, Birthday = #{birthday}, Catchphrase = #{catchphrase}, Favorite_Song = #{favoriteSong}, Style1 = #{style1}, Style2 = #{style2}, Color1 = #{color1}, Color2 = #{color2}, Wallpaper = #{wallpaper}, Flooring = #{flooring} WHERE id = #{id}")
    int updateVillagers(Villagers villagers);

    @Delete("DELETE FROM villagers WHERE id = #{id}")
    int deleteById(@Param("id") Long id);


    @Select("<script>" +
            "SELECT * FROM villagers WHERE 1=1" +
            "<if test='species != null and species != \"\"'> AND species = #{species}</if>" +
            "<if test='gender != null and gender != \"\"'> AND gender = #{gender}</if>" +
            "<if test='personality != null and personality != \"\"'> AND personality = #{personality}</if>" +
            "<if test='birthday != null and birthday != \"\"'> AND SUBSTRING(birthday, 4, 3) = #{birthday}</if>" +
            "<if test='hobby != null and hobby != \"\"'> AND hobby = #{hobby}</if>" +
            "</script>")
    List<Villagers> findVillagers(@Param("species") String species,
                                  @Param("gender") String gender,
                                  @Param("personality") String personality,
                                  @Param("birthday") String birthday,
                                  @Param("hobby") String hobby);

    @Select("SELECT * FROM villagers WHERE Catchphrase LIKE CONCAT('%', #{catchphrase}, '%')")
    List<Villagers> findByCatchphrase(@Param("catchphrase") String catchphrase);

    @Select("SELECT * FROM villagers WHERE Favorite_Song LIKE CONCAT('%', #{favoriteSong}, '%')")
    List<Villagers> findByFavoriteSong(@Param("favoriteSong") String favoriteSong);

    @Select("SELECT * FROM villagers WHERE Style1 LIKE CONCAT('%', #{style1}, '%')")
    List<Villagers> findByStyle1(@Param("style1") String style1);

    @Select("SELECT * FROM villagers WHERE Style2 LIKE CONCAT('%', #{style2}, '%')")
    List<Villagers> findByStyle2(@Param("style2") String style2);

    @Select("SELECT * FROM villagers WHERE Color1 LIKE CONCAT('%', #{color1}, '%')")
    List<Villagers> findByColor1(@Param("color1") String color1);

    @Select("SELECT * FROM villagers WHERE Color2 LIKE CONCAT('%', #{color2}, '%')")
    List<Villagers> findByColor2(@Param("color2") String color2);

    @Select("SELECT * FROM villagers WHERE Wallpaper LIKE CONCAT('%', #{wallpaper}, '%')")
    List<Villagers> findByWallpaper(@Param("wallpaper") String wallpaper);

    @Select("SELECT * FROM villagers WHERE Flooring LIKE CONCAT('%', #{flooring}, '%')")
    List<Villagers> findByFlooring(@Param("flooring") String flooring);
}
