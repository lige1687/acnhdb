package com.ecnudbcourse.acnhdb.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Recipes;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface RecipesMapper extends BaseMapper<Recipes> {

    @Select("SELECT * FROM recipes WHERE name = #{name}")
    List<Recipes> findByName(@Param("name") String name);

    @Insert("INSERT INTO recipes (name, material1_count, material1, material2_count, material2, material3_count, material3, material4_count, material4, material5_count, material5, material6_count, material6, recipes_to_unlock, category) " +
            "VALUES (#{name}, #{material1Count}, #{material1}, #{material2Count}, #{material2}, #{material3Count}, #{material3}, #{material4Count}, #{material4}, #{material5Count}, #{material5}, #{material6Count}, #{material6}, #{recipesToUnlock}, #{category})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertRecipe(Recipes recipes);

    @Update("UPDATE recipes SET name = #{name}, material1_count = #{material1Count}, material1 = #{material1}, material2_count = #{material2Count}, material2 = #{material2}, " +
            "material3_count = #{material3Count}, material3 = #{material3}, material4_count = #{material4Count}, material4 = #{material4}, material5_count = #{material5Count}, material5 = #{material5}, " +
            "material6_count = #{material6Count}, material6 = #{material6}, recipes_to_unlock = #{recipesToUnlock}, category = #{category} " +
            "WHERE id = #{id}")
    int updateRecipe(Recipes recipes);

    @Delete("DELETE FROM recipes WHERE id = #{id}")
    int deleteById(@Param("id") Long id);
}
