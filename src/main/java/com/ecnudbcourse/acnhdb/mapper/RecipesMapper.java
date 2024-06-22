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


    @Select("SELECT * FROM recipes WHERE Number_Of_Material1 LIKE CONCAT('%', #{numberOfMaterial1}, '%')")
    List<Recipes> findByNumberOfMaterial1(@Param("numberOfMaterial1") String numberOfMaterial1);

    @Select("SELECT * FROM recipes WHERE Material1 LIKE CONCAT('%', #{material1}, '%')")
    List<Recipes> findByMaterial1(@Param("material1") String material1);

    @Select("SELECT * FROM recipes WHERE Number_Of_Material2 LIKE CONCAT('%', #{numberOfMaterial2}, '%')")
    List<Recipes> findByNumberOfMaterial2(@Param("numberOfMaterial2") String numberOfMaterial2);

    @Select("SELECT * FROM recipes WHERE Material2 LIKE CONCAT('%', #{material2}, '%')")
    List<Recipes> findByMaterial2(@Param("material2") String material2);

    @Select("SELECT * FROM recipes WHERE Number_Of_Material3 LIKE CONCAT('%', #{numberOfMaterial3}, '%')")
    List<Recipes> findByNumberOfMaterial3(@Param("numberOfMaterial3") String numberOfMaterial3);

    @Select("SELECT * FROM recipes WHERE Material3 LIKE CONCAT('%', #{material3}, '%')")
    List<Recipes> findByMaterial3(@Param("material3") String material3);

    @Select("SELECT * FROM recipes WHERE Number_Of_Material4 LIKE CONCAT('%', #{numberOfMaterial4}, '%')")
    List<Recipes> findByNumberOfMaterial4(@Param("numberOfMaterial4") String numberOfMaterial4);

    @Select("SELECT * FROM recipes WHERE Material4 LIKE CONCAT('%', #{material4}, '%')")
    List<Recipes> findByMaterial4(@Param("material4") String material4);

    @Select("SELECT * FROM recipes WHERE Number_Of_Material5 LIKE CONCAT('%', #{numberOfMaterial5}, '%')")
    List<Recipes> findByNumberOfMaterial5(@Param("numberOfMaterial5") String numberOfMaterial5);

    @Select("SELECT * FROM recipes WHERE Material5 LIKE CONCAT('%', #{material5}, '%')")
    List<Recipes> findByMaterial5(@Param("material5") String material5);

    @Select("SELECT * FROM recipes WHERE Number_Of_Material6 LIKE CONCAT('%', #{numberOfMaterial6}, '%')")
    List<Recipes> findByNumberOfMaterial6(@Param("numberOfMaterial6") String numberOfMaterial6);

    @Select("SELECT * FROM recipes WHERE Material6 LIKE CONCAT('%', #{material6}, '%')")
    List<Recipes> findByMaterial6(@Param("material6") String material6);

    @Select("SELECT * FROM recipes WHERE Recipes_to_Unlock LIKE CONCAT('%', #{recipesToUnlock}, '%')")
    List<Recipes> findByRecipesToUnlock(@Param("recipesToUnlock") String recipesToUnlock);

    @Select("SELECT * FROM recipes WHERE Category LIKE CONCAT('%', #{category}, '%')")
    List<Recipes> findByCategory(@Param("category") String category);
}
