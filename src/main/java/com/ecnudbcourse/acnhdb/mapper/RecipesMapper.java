package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Recipes;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface RecipesMapper extends BaseMapper<Recipes> {

    @Select("SELECT * FROM recipes WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Recipes> findByName(@Param("name") String name);

    @Insert("INSERT INTO recipes (Name, Number_Of_Material1, Material1, Number_Of_Material2, Material2, Number_Of_Material3, Material3, Number_Of_Material4, Material4, Number_Of_Material5, Material5, Number_Of_Material6, Material6, Recipes_to_Unlock, Category) VALUES (#{name}, #{numberOfMaterial1}, #{material1}, #{numberOfMaterial2}, #{material2}, #{numberOfMaterial3}, #{material3}, #{numberOfMaterial4}, #{material4}, #{numberOfMaterial5}, #{material5}, #{numberOfMaterial6}, #{material6}, #{recipesToUnlock}, #{category})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertRecipes(Recipes recipes);

    @Update("UPDATE recipes SET Name = #{name}, Number_Of_Material1 = #{numberOfMaterial1}, Material1 = #{material1}, Number_Of_Material2 = #{numberOfMaterial2}, Material2 = #{material2}, Number_Of_Material3 = #{numberOfMaterial3}, Material3 = #{material3}, Number_Of_Material4 = #{numberOfMaterial4}, Material4 = #{material4}, Number_Of_Material5 = #{numberOfMaterial5}, Material5 = #{material5}, Number_Of_Material6 = #{numberOfMaterial6}, Material6 = #{material6}, Recipes_to_Unlock = #{recipesToUnlock}, Category = #{category} WHERE id = #{id}")
    int updateRecipes(Recipes recipes);

    @Delete("DELETE FROM recipes WHERE id = #{id}")
    int deleteById(@Param("id") Long id);

}
