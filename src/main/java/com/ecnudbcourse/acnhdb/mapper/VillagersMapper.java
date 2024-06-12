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

}
