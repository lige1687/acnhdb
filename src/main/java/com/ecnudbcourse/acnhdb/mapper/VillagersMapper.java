package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Villagers;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface VillagersMapper extends BaseMapper<Villagers> {

    @Select("SELECT * FROM villagers WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Villagers> findByName(@Param("name") String name);

    @Insert("INSERT INTO villagers (Name, Species, Gender, Personality, Hobby, Birthday, Catchphrase, Favorite_Song, Style_1, Style_2, Color_1, Color_2, Wallpaper, Flooring) VALUES (#{name}, #{species}, #{gender}, #{personality}, #{hobby}, #{birthday}, #{catchphrase}, #{favoriteSong}, #{style_1}, #{style_2}, #{color_1}, #{color_2}, #{wallpaper}, #{flooring})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertVillagers(Villagers villagers);

    @Update("UPDATE villagers SET Name = #{name}, Species = #{species}, Gender = #{gender}, Personality = #{personality}, Hobby = #{hobby}, Birthday = #{birthday}, Catchphrase = #{catchphrase}, Favorite_Song = #{favoriteSong}, Style_1 = #{style_1}, Style_2 = #{style_2}, Color_1 = #{color_1}, Color_2 = #{color_2}, Wallpaper = #{wallpaper}, Flooring = #{flooring} WHERE id = #{id}")
    int updateVillagers(Villagers villagers);

    @Delete("DELETE FROM villagers WHERE id = #{id}")
    int deleteById(@Param("id") Long id);

    @Select("<script>" +
            "SELECT * FROM villagers WHERE 1=1" +
            "<if test='species != null and species != \"\"'> AND species = #{species}</if>" +
            "<if test='gender != null and gender != \"\"'> AND gender = #{gender}</if>" +
            "<if test='personality != null and personality != \"\"'> AND personality = #{personality}</if>" +
            "<if test='birthdayMonth != null and birthdayMonth != \"\"'> AND birthday LIKE CONCAT('%', #{birthdayMonth}, '%')</if>" +
            "<if test='hobby != null and hobby != \"\"'> AND hobby = #{hobby}</if>" +
            "</script>")
    List<Villagers> findVillagers(@Param("species") String species,
                                    @Param("gender") String gender,
                                    @Param("personality") String personality,
                                    @Param("birthdayMonth") String birthdayMonth,
                                    @Param("hobby") String hobby);
}
