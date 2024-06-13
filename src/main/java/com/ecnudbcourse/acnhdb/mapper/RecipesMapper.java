package com.ecnudbcourse.acnhdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ecnudbcourse.acnhdb.entity.Recipes;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface RecipesMapper extends BaseMapper<Recipes> {

    @Select("SELECT * FROM recipes WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Recipes> findByName(@Param("name") String name);

    @Insert("INSERT INTO recipes (name, number_of_material_1, material_1, number_of_material_2, material_2, number_of_material_3, material_3, number_of_material_4, material_4, number_of_material_5, material_5, number_of_material_6, material_6, recipes_to_unlock, category) " +
            "VALUES (#{name}, #{numberOfMaterial_1}, #{material_1}, #{numberOfMaterial_2}, #{material_2}, #{numberOfMaterial_3}, #{material_3}, #{numberOfMaterial_4}, #{material_4}, #{numberOfMaterial_5}, #{material_5}, #{numberOfMaterial_6}, #{material_6}, #{recipesToUnlock}, #{category})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertRecipe(Recipes recipes);

    @Update("UPDATE recipes SET name = #{name}, number_of_material_1 = #{numberOfMaterial_1}, material_1 = #{material_1}, number_of_material_2 = #{numberOfMaterial_2}, material_2 = #{material_2}, " +
            "number_of_material_3 = #{numberOfMaterial_3}, material_3 = #{material_3}, number_of_material_4 = #{numberOfMaterial_4}, material_4 = #{material_4}, number_of_material_5 = #{numberOfMaterial_5}, material_5 = #{material_5}, " +
            "number_of_material_6 = #{numberOfMaterial_6}, material_6 = #{material_6}, recipes_to_unlock = #{recipesToUnlock}, category = #{category} " +
            "WHERE id = #{id}")
    int updateRecipe(Recipes recipes);

    @Delete("DELETE FROM recipes WHERE id = #{id}")
    int deleteById(@Param("id") Long id);

    Recipes selectRecipeByName(@Param("name") String name);
}
