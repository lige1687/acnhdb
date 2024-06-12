package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Construction;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface ConstructionMapper extends BaseMapper<Construction> {

    @Select("SELECT * FROM construction WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Construction> findByName(@Param("name") String name);

    @Insert("INSERT INTO construction (Name, Buy, Category, Source) VALUES (#{name}, #{buy}, #{category}, #{source})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertConstruction(Construction construction);

    @Update("UPDATE construction SET Name = #{name}, Buy = #{buy}, Category = #{category}, Source = #{source} WHERE id = #{id}")
    int updateConstruction(Construction construction);

    @Delete("DELETE FROM construction WHERE id = #{id}")
    int deleteById(@Param("id") Long id);

}
