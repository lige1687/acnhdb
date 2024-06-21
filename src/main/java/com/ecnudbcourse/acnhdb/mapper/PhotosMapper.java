package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Photos;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface PhotosMapper extends BaseMapper<Photos> {

    @Select("SELECT * FROM photos WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Photos> findByName(@Param("name") String name);

    @Insert("INSERT INTO photos (Name, Variation, Color1, Color2) VALUES (#{name}, #{variation}, #{color1}, #{color2})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertPhotos(Photos photos);

    @Update("UPDATE photos SET Name = #{name}, Variation = #{variation}, Color1 = #{color1}, Color2 = #{color2} WHERE id = #{id}")
    int updatePhotos(Photos photos);

    @Delete("DELETE FROM photos WHERE id = #{id}")
    int deleteById(@Param("id") Long id);

}
